package servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SpringContextListener implements ServletContextListener {
    //1.添加监听器类
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        //配置完web.xml再进行值的填写
        String config = context.getInitParameter("contextLocation");//4.加载初始化配置文件
        ApplicationContext app = new ClassPathXmlApplicationContext(config);
        context.setAttribute("Application", app);
    }
}
