package lk.ijse.pos.dao;


import lk.ijse.pos.dao.custom.impl.CustomerDAOImpl;
import lk.ijse.pos.dao.custom.impl.ItemDAOImpl;

/**
 * @author : Jayani_Arunika  9/11/2023 - 12:52 AM
 * @since : v0.01.0
 **/

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {

    }

    public static DAOFactory getDoFactory() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }
    public enum DAOType{
        CUSTOMER,ITEM
    }
    public SuperDAO getDAO(DAOType type){
        switch (type){
            case CUSTOMER :
                return (SuperDAO) new CustomerDAOImpl();
            case ITEM:
                return (SuperDAO) new ItemDAOImpl();
            default:
                return null;
        }
    }
}
