package company;

public class Employee {
    private int id;
    private String idc;
    private String name;
    private long sal;

    public Employee(int id, String idc, String name, long sal) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdc() {
        return idc;
    }

    public void setIdc(String idc) {
        this.idc = idc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSal() {
        return sal;
    }

    public void setSal(long sal) {
        this.sal = sal;
    }

    public long getAnnualSalary() {
        return sal * 12;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", idc='" + idc + '\'' +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
