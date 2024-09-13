package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Customer {
    @Id
    private int CusId;
    private String Name;
    private String Phone;

    @OneToMany(mappedBy = "customer",fetch = FetchType.EAGER)
    private List<Address> addresses;

    public Customer() {}

    public Customer(int cusId, String name, String phone, List<Address> addresses) {
        CusId = cusId;
        Name = name;
        Phone = phone;
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "CusId=" + CusId +
                ", Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", addresses=" + addresses +
                '}';
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
