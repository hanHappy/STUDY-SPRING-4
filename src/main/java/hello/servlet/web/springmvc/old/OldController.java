package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 5-2 핸들러 매핑과 핸들러 어댑터
@Component("/springmvc/old-controller") // spring bean 이름 등록
public class OldController implements Controller{

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController.handleRequest()");
        return new ModelAndView("new-form");
    }
    
}
