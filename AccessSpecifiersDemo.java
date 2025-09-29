class Account {
    private double balance = 1000;   // private

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    protected double getBalance() {
        return balance;
    }
}

public class AccessSpecifiersDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());
    }
}