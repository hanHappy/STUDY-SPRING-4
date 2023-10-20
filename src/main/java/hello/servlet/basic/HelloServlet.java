package hello.servlet.basic;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 2-2
@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    // http 요청이 오면 WAS의 서블릿 컨테이너가 request, response 객체를 만들어 서블릿에 던져준다
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("HelloServlet.service()");

        // request = org.apache.catalina.connector.RequestFacade@37f5c612
        // org.apache.catalina : tomcat쪽 라이브러리
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        // 쿼리 파라미터를 편하게 꺼낼 수 있도록 하는 서블릿의 기능
        String name = request.getParameter("username");
        System.out.println("username = " + name);

        // http 헤더에 정보가 들어간다
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        // http body에 데이터가 들어간다
        // 브라우저에 hello han
        response.getWriter().write("hello " + name);
    }
}
