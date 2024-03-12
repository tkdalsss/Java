package app;

import company.Employee;
import company.SalesEmployee;
import company.SecretaryEmployee;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee("100", "james", "Account", 1000L);
        System.out.println(employee1);

        Object obj1 = new Employee("100", "james", "Account", 1000L);
        System.out.println(obj1);

        Employee employee2 = new SalesEmployee("100", "james", "Account", 1000L, 500L);
        System.out.println(employee2);

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("100", "james", "Account", 1000L);
        employees[1] = new SalesEmployee("100", "james", "Account", 1000L, 500L);
        employees[2] = new SecretaryEmployee("100", "james", "Account", 1000L, "Boss");

        for (Employee e : employees) {
            System.out.println(e.getAnnSalary());
        }

        Date date = new Date();
        System.out.println(date);
    }
}
