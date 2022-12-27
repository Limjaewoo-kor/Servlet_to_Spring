package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "RequestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


//        req.getParameterNames().asIterator()
//                .forEachRemaining(paramName -> System.out.println(paramName +" = "+ req.getParameter(paramName)));

        String username = req.getParameter("username");
        String age = req.getParameter("age");
        System.out.println("age = " + age);
        System.out.println("username = " + username);

//        System.out.println("이름이 같은 복수 파라미터 조회 방법");
//        String[] usernames = req.getParameterValues("username");
//
//        for (String s : usernames) {
//            System.out.println("s = " + s);
//        }

        resp.getWriter().write("ok");
    }
}
