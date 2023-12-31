package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 3-1
/*
 * 동시성 문제가 고려되어 있지 않기 때문에 실무에서는 ConcurrentHashMap, AtomicLong 사용을 고려한다
 */
public class MemberRepository {
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id){
        return store.get(id);
    }

    public List<Member> findAll(){
        // store의 모든 값을 꺼내 새로운 ArrayList에 담아 반환
        // 이렇게 하는 이유는 store의 데이터를 보호하기 위해
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }
}
