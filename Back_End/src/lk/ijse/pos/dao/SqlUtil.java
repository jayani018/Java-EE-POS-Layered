package lk.ijse.pos.dao;


import lk.ijse.pos.listner.listner;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.servlet.ServletContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author : Jayani_Arunika  9/10/2023 - 6:59 PM
 * @since : v0.01.0
 **/

public class SqlUtil {

        static ServletContext servletContext = listner.getServletContext();
        static BasicDataSource pool = (BasicDataSource) servletContext.getAttribute("dbcp");


        public static <T> T execute(String sql, Object...args) throws SQLException {
            try(Connection connection = pool.getConnection()){
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                for (int i = 0; i < args.length; i++) {
                    preparedStatement.setObject(i + 1, args[i]);
                }
                if (sql.startsWith("SELECT") || sql.startsWith("select")) {
                    return (T) preparedStatement.executeQuery();
                } else {
                    return (T) (Boolean) (preparedStatement.executeUpdate() > 0);
                }


            }
        }

    }


