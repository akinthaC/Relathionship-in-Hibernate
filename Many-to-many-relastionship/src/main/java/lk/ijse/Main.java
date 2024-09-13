package lk.ijse;

import lk.ijse.Entity.Address;
import lk.ijse.Entity.Customer;
import lk.ijse.confit.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();
        Customer customer = new Customer();
        Address address1 = new Address();

        List<Customer> customers = new ArrayList<>();
        customers.add(customer);


        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);

        address1.setAid(1);
        address1.setCity("elpitiya");
        address1.setCountry("Srilanka");
        address1.setCustomers(customers);

        customer.setCusId(1);
        customer.setName("tinka");
        customer.setPhone("09415545230");
        customer.setAddresses(addresses);

        /*customer.setCusId(2);
        customer.setName("aki");
        customer.setPhone("0941555454");
        customer.setAddresses(addresses);*/



        session.save(customer);
        session.save(address1);



        transaction.commit();
        session.close();
    }
}