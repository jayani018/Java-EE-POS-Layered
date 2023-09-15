package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.SqlUtil;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.dto.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  9/10/2023 - 10:56 PM
 * @since : v0.01.0
 **/

public class CustomerDAOImpl implements CustomerDAO {

    public ArrayList<CustomerDTO> getAll() throws SQLException {
        ArrayList<CustomerDTO> Customer = new ArrayList<>();
        ResultSet rst = SqlUtil.execute("SELECT * FROM customer");
        while (rst.next()) {
            CustomerDTO customerDTO = new CustomerDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4));
            Customer.add(customerDTO);
        }

        return Customer;

    }
    public boolean add(CustomerDTO dto) throws SQLException {
        return SqlUtil.execute("INSERT INTO customer VALUES (?,?,?,?)", dto.getCusId(), dto.getCusName(), dto.getCusAddress(),dto.getCusSalary());
    }
    public boolean update(CustomerDTO dto) throws SQLException {
        return SqlUtil.execute("update Customer set name=?,address=?,salary=? where id=?", dto.getCusId(), dto.getCusName(), dto.getCusAddress(),dto.getCusSalary());
    }
    public boolean delete(String id) throws SQLException {
        return SqlUtil.execute("delete from Customer where id=?", id);
    }
}


