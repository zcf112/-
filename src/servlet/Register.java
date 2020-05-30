package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 注册处理
 *
 * @author asus
 */
@WebServlet("/register")
public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //是否添加成功标志位
        int success = 0;
        //1.向数据库添加数据

        //2.返回登录界面，失败返回注册界面
        if (success == 1) {
            response.sendRedirect("/index.jsp");
        } else {
            response.sendRedirect("/register.jsp");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/register.jsp");
    }
}
