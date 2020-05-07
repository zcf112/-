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
import java.io.PrintWriter;

@WebServlet("/helloServlet")
public class helloServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=gb2312");
        PrintWriter ou = response.getWriter();
        request.setCharacterEncoding("gb2312");

        String username = request.getParameter("username");
        int password = Integer.parseInt(request.getParameter("password"));

        //使用spring创建对象并调用方法
        ServletContext context = getServletContext();
        ApplicationContext app = (ApplicationContext) context.getAttribute("ApplicationContext");
        User user = app.getBean("user", User.class);
        String str = user.checkThis(username, password);
        System.out.println(user.checkThis(username, password));

        ou.println("<html>");
        ou.println("<body>");
        ou.println(str);
        ou.println("</body>");
        ou.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("登录");
        //跳转main？？？
    }
}
