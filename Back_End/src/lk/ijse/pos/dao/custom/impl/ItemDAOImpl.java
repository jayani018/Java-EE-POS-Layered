package lk.ijse.pos.dao.custom.impl;

import lk.ijse.pos.dao.SqlUtil;
import lk.ijse.pos.dto.itemDTO;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * @author : Jayani_Arunika  9/11/2023 - 8:39 AM
 * @since : v0.01.0
 **/

public class ItemDAOImpl {
    public ArrayList<itemDTO> getAll() throws SQLException {
        ArrayList<itemDTO> Item = new ArrayList<>();
        ResultSet rst = SqlUtil.execute("SELECT * FROM item");
        while (rst.next()) {
            itemDTO itemDTO = new itemDTO(rst.getString(1), rst.getString(2), rst.getDouble(3), rst.getInt(4));
            Item.add(itemDTO);
        }

        return Item;

    }
    public boolean add(itemDTO dto) throws SQLException {
        return SqlUtil.execute("INSERT INTO item VALUES (?,?,?,?)", dto.getCode(), dto.getName(), dto.getUnitPrice(),dto.getQtyOnHand());
    }
    public boolean update(itemDTO dto) throws SQLException {
        return SqlUtil.execute("update item set name=?,qtyOnHand=?,unitPrice=? where code=?", dto.getCode(), dto.getName(), dto.getUnitPrice(),dto.getQtyOnHand());
    }
    public boolean delete(String code) throws SQLException {
        return SqlUtil.execute("delete from item where code=?", code);
    }
}
