package servlet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class SpringContextListener implements ServletContextListener {
    /* 1.添加监听器类 */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();
        String config;
        //配置完web.xml再进行值的填写
        //4.加载初始化配置文件application.xml
        //定义在web.xml里
        config = context.getInitParameter("contextLocation");
        ApplicationContext app = new ClassPathXmlApplicationContext(config);
        //起名Application，把app放进去ServletContext context的域当中
        context.setAttribute("ApplicationContext", app);
    }
}
