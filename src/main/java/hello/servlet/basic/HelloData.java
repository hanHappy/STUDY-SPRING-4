package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

// 2-8 HTTP 요청 데이터 - API 메시지 바디 - JSON
@Getter @Setter
public class HelloData {
    private String username;
    private int age;

}
