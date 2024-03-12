package company;

public class SalesEmployee extends Employee{
    private long bonus;

    public SalesEmployee() {
    }

    public SalesEmployee(String id, String name, String dept, long salary, long bonus) {
        super(id, name, dept, salary);
        this.bonus = bonus;
    }

    public long getBonus() {
        return this.bonus;
    }

    @Override
    public long getAnnSalary() {
        return super.getAnnSalary() + this.bonus;
    }

    @Override
    public String toString() {
        return super.toString() + this.bonus;
    }
}
