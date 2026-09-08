package OOPs;

class BankAccount {
    private String accNo;
    private double balance;

    BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Enter a valid amount ");
        }
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
            System.out.println("Money is withdraw");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    double getter() {
        return balance;
    }
}

public class BankAcc {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("67462", 1000.0);
        b1.deposite(100);
        System.out.println(b1.getter());
        b1.withdraw(1000);
        System.out.println(b1.getter());

    }
}
