package lk.ijse.pos.bo.custom.impl;


import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.impl.ItemDAOImpl;
import lk.ijse.pos.dto.itemDTO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  9/11/2023 - 1:07 AM
 * @since : v0.01.0
 **/

public class ItemBOImpl {
    private final ItemDAOImpl itemDAO = (ItemDAOImpl) DAOFactory.getDoFactory().getDAO(DAOFactory.DAOType.ITEM);

    public ArrayList<itemDTO> getAllCustomer() throws SQLException, ClassNotFoundException {
        return itemDAO.getAll();
    }
    public boolean addItem(itemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.add(dto);
    }
    public boolean updateItem(itemDTO dto) throws SQLException, ClassNotFoundException {
        return itemDAO.update(dto);
    }
    public boolean deleteItem(String code) throws SQLException, ClassNotFoundException {
        return itemDAO.delete(code);
    }
}
