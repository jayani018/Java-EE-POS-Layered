package lk.ijse.pos.bo.custom.impl;


import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.pos.dto.CustomerDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  9/11/2023 - 1:06 AM
 * @since : v0.01.0
 **/

public class CustomerBOImpl {
    private final CustomerDAOImpl customerDAO = (CustomerDAOImpl) DAOFactory.getDoFactory().getDAO(DAOFactory.DAOType.CUSTOMER);

    public ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        return customerDAO.getAll();
    }
        public boolean addCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
            return customerDAO.add(dto);
        }
    public boolean updateCustomer(CustomerDTO dto) throws SQLException, ClassNotFoundException {
        return customerDAO.update(dto);
    }
    public boolean deleteCustomer(String id) throws SQLException, ClassNotFoundException {
        return customerDAO.delete(id);
    }

}
