package lk.ijse.pos.bo.custom;



import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.itemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  9/11/2023 - 1:05 AM
 * @since : v0.01.0
 **/

public interface ItemBO {
    boolean addItem(CustomerDTO dto) throws SQLException;

    boolean updateItem(CustomerDTO dto) throws SQLException;

    boolean deleteItem(CustomerDTO dto) throws SQLException;

    ArrayList<itemDTO> getAllItem() throws SQLException;

}
