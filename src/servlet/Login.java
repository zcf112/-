package servlet;

import domain.User;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author asus
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("UserNameIn");
        String password = request.getParameter("PasswordIn");

        //使用spring创建对象并调用方法
        ServletContext context = getServletContext();
        //获取ServletContext context中的ApplicationContext
        ApplicationContext app = (ApplicationContext) context.getAttribute("ApplicationContext");
        User user = app.getBean("user", User.class);
        int success = user.checkThis(username, password);
        if (success == 1) {
            System.out.println("登陆成功");
        } else {
            System.out.println("登陆失败");
        }
        //重定向
        // response.sendRedirect("/main.jsp");
        request.setAttribute("username", username);
        System.out.println(request);
        request.getRequestDispatcher("/main.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("登录的doGet");
        //跳转main
    }
}
