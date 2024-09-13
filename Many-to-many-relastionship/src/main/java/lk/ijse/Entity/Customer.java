package lk.ijse.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    private int CusId;
    private String Name;
    private String Phone;

    @ManyToMany
    private List<Address> addresses;
    //Owners End

    public Customer() {}

    public Customer(int cusId, String name, String phone, List<Address> addresses) {
        CusId = cusId;
        Name = name;
        Phone = phone;
        this.addresses = addresses;
    }

    public int getCusId() {
        return CusId;
    }

    public void setCusId(int cusId) {
        CusId = cusId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}
