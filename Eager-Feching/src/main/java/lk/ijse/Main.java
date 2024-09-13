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

        Customer customer =session.get(Customer.class, 1);
        System.out.println(customer.getCusId() +""+ customer.getAddresses().toString() +""+ customer.getName());
       /* Address address1 = new Address();
        address1.setAid(1);
        address1.setCity("London");
        address1.setCountry("ausi");

        Address address2 = new Address();
        address2.setAid(2);
        address2.setCity("elpitiya");
        address2.setCountry("srilanka");

        List<Address> addresses = new ArrayList<>();
        addresses.add(address1);
        addresses.add(address2);

        Customer customer = new Customer();
        customer.setCusId(1);
        customer.setName("tinka");
        customer.setPhone("09415545230");
        customer.setAddresses(addresses);

        address1.setCustomer(customer);
        address2.setCustomer(customer);




        session.save(address1);
        session.save(address2);
        session.save(customer);*/


        transaction.commit();
        session.close();
    }
}