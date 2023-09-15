package lk.ijse.pos.dao;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  9/11/2023 - 12:32 AM
 * @since : v0.01.0
 **/

public interface CrudDAO<T> extends SuperDAO {
     ArrayList<T> getAll() throws SQLException;
     boolean add(T entity) throws SQLException;
     boolean update(T entity) throws SQLException;
     boolean delete(String id) throws SQLException;
}
