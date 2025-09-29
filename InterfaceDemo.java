interface Payment {
    void pay(int amount);
}

class UpiPayment implements Payment {
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Payment p = new UpiPayment();
        p.pay(500);
    }
}