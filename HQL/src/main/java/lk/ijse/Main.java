package lk.ijse;

import lk.ijse.Entity.Customer;
import lk.ijse.confit.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

       /*Query query= session.createQuery("from Customer where id= 1");

       List<Customer> customers = query.list();

       for (Customer customer : customers) {
           System.out.println(customer.getCusId()+" "+customer.getName());
       }*/

        Query query= session.createQuery("from Customer where id= 1");

        Customer customer = (Customer) query.list();


            System.out.println(customer.getCusId()+" "+customer.getName());

        transaction.commit();
        session.close();
    }
}