package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee employee1 = new Employee(0, "100001", "james1", 200000L);
        Employee employee2 = new Employee(0, "100002", "james2", 200000L);
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
    }
}
