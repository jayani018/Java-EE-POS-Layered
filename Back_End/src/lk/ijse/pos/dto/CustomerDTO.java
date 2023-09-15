package lk.ijse.pos.dto;

/**
 * @author : Jayani_Arunika  9/10/2023 - 10:44 PM
 * @since : v0.01.0
 **/

public class CustomerDTO {
    private String cusId;
    private String cusName;
    private String cusAddress;
    private Double cusSalary;

    public CustomerDTO() {
    }

    public CustomerDTO(String cusId, String cusName, String cusAddress, Double cusSalary) {
        this.cusId = cusId;
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.cusSalary = cusSalary;
    }

    public String getCusId() {
        return cusId;
    }

    public void setCusId(String cusId) {
        this.cusId = cusId;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public Double getCusSalary() {
        return cusSalary;
    }

    public void setCusSalary(Double cusSalary) {
        this.cusSalary = cusSalary;
    }
}
