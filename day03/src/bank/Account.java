package bank;

public class Account {
    private String accNum;
    private String custName;
    private long balance;
    private double interest;

    public static int count = 0;

    static {
        System.out.println("Start static Area ....");
        count = 100000;
        System.out.println("End static Area ....");
    } // 메모리에 로딩되는 시점에 한번만 호출됨 -> static -> 이때 static 변수 초기화

    public Account() {
    }

    public Account(String accNum, String custName, long balance, double interest) {
        this.accNum = String.valueOf(count);
        this.custName = custName;
        if(balance < 0) {
            System.out.println("잔액은 0 이상이어야 합니다.");
            return;
        }
        this.balance = balance;
        this.interest = interest;
        count++;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getCustName() {
        return custName;
    }

    public long getBalance() {
        return balance;
    }

    public double getInterest() {
        return interest;
    }

    public void deposit(long money) {
        if (money <= 0) {
            return; // exception 발생
        }
        this.balance += money;
    }

    public void withdraw(long money) {
        this.balance -= money;
    }

    public double getCalInterest() {
        return (this.balance * this.interest) / 100;
    }

    public int getCalInterest(int month) {
//        return (int)((this.balance * this.interest) / month);
        return (int)(this.getCalInterest()/month);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("accNum='").append(accNum).append('\'');
        sb.append(", custName='").append(custName).append('\'');
        sb.append(", balance=").append(balance);
        sb.append(", interest=").append(interest);
        sb.append('}');
        return sb.toString();
    }
}
