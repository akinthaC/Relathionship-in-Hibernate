package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
    @Id
    private int addressId;
    private String Road;
    private String City;

    @OneToOne
    private Employee EmpId;



    public Address() {}

    public Address(int addressId, String road, String city, Employee empId) {
        this.addressId = addressId;
        Road = road;
        City = city;
        EmpId = empId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getRoad() {
        return Road;
    }

    public void setRoad(String road) {
        Road = road;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public Employee getEmpId() {
        return EmpId;
    }

    public void setEmpId(Employee empId) {
        EmpId = empId;
    }
}
