package lk.ijse.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

import java.util.List;

@Entity
public class Address {
    @Id
    private int aid;
    private String city;
    private String country;

    @ManyToMany(mappedBy = "addresses") //inverse End
    private List<Customer> customers;

    public Address() {
    }

    public Address(int aid, String city, String country, List<Customer> customers) {
        this.aid = aid;
        this.city = city;
        this.country = country;
        this.customers = customers;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
