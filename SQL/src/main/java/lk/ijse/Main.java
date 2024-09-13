package lk.ijse;

import lk.ijse.Entity.Customer;
import lk.ijse.confit.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        NativeQuery query = session.createNativeQuery("select * from customer");

        //insert update
        query.addEntity(Customer.class);

        List<Customer> customers = query.list();
        for (Customer c : customers) {
            System.out.println(c.getCusId());
        }

        transaction.commit();
        session.close();
    }
}