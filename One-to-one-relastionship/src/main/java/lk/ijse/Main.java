package lk.ijse;

import lk.ijse.Entity.Address;
import lk.ijse.Entity.Employee;
import lk.ijse.confit.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();

        Employee employee = new Employee();
        Address address = new Address();

        employee.setEmpid(1);
        employee.setName("Kamal");
        employee.setPhone("09154622462");

        session.get(Employee.class,1);
        System.out.println(employee.getEmpid() + " " + employee.getName() + " " + employee.getPhone());

        address.setAddressId(1);
        address.setCity("elpitiya");
        address.setRoad("pituwala");
        address.setEmpId(employee);

        Transaction transaction = session.beginTransaction();

        session.save(employee);
        session.save(address);

        transaction.commit();
        session.close();



    }
}