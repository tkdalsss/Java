package app;

import company.Employee;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee(100, "id01", "james", 20000);
        long sal = employee.getSal();
        long annualSalary = employee.getAnnualSalary();

        System.out.println(sal + annualSalary);
    }
}
