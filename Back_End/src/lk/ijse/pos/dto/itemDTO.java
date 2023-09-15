package lk.ijse.pos.dto;

/**
 * @author : Jayani_Arunika  9/10/2023 - 10:44 PM
 * @since : v0.01.0
 **/

public class itemDTO {
    private String code;
    private String name;
    private Double unitPrice;
    private int qtyOnHand;

    public itemDTO() {
    }

    public itemDTO(String code, String name, Double unitPrice, int qtyOnHand) {
        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.qtyOnHand = qtyOnHand;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQtyOnHand() {
        return qtyOnHand;
    }

    public void setQtyOnHand(int qtyOnHand) {
        this.qtyOnHand = qtyOnHand;
    }
}
