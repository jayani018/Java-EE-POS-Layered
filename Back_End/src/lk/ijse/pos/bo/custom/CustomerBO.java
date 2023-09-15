package lk.ijse.pos.bo.custom;



import lk.ijse.pos.bo.SuperBO;
import lk.ijse.pos.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  9/11/2023 - 1:05 AM
 * @since : v0.01.0
 **/

public interface CustomerBO extends SuperBO {
    boolean addCustomer(CustomerDTO dto) throws SQLException;

    boolean updateCustomer(CustomerDTO dto) throws SQLException;

    boolean deleteCustomer(CustomerDTO dto) throws SQLException;

    ArrayList<CustomerDTO> getAllCustomers() throws SQLException;
}
