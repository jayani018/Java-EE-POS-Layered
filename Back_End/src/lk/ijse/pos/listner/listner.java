package lk.ijse.pos.listner;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author : Jayani_Arunika  9/10/2023 - 9:40 AM
 * @since : v0.01.0
 **/
@WebListener
public class listner implements ServletContextListener {

    static ServletContext servletContext;

   public static ServletContext getServletContext() {
       return servletContext;
    }

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext servletContext = servletContextEvent.getServletContext();

        BasicDataSource pool = new BasicDataSource();
        pool.setDriverClassName("com.nysql.jdbc.Driver");
        pool.setUrl("jdbc:mysql://localhost:3306/pos_system");
        pool.setUsername("root");
        pool.setPassword("1234");
        pool.setInitialSize(3);
        pool.setMaxTotal(3);
        servletContext.setAttribute("dbcp",pool);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
