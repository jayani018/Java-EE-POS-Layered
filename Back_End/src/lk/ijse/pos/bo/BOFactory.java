package lk.ijse.pos.bo;


import lk.ijse.pos.bo.custom.impl.CustomerBOImpl;
import lk.ijse.pos.bo.custom.impl.ItemBOImpl;

/**
 * @author : Jayani_Arunika  9/11/2023 - 1:03 AM
 * @since : v0.01.0
 **/

public class BOFactory {
    private static BOFactory boFactory;

    private BOFactory() {

    }

    public static BOFactory getBoFactory() {
        if (boFactory == null) {
            boFactory = new BOFactory();
        }
        return boFactory;
    }
    public enum BOType{
        CUSTOMER,ITEM
    }
    public SuperBO getBO(BOType type){
        switch (type){
            case CUSTOMER:
                return (SuperBO) new CustomerBOImpl();
            case ITEM:
                return (SuperBO) new ItemBOImpl();

            default:
                return null;
        }
    }
}
