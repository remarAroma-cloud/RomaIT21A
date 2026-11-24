// PolymorphismDemo.java
class Payment {
    public void processPayment() {
        System.out.println("Processing a general payment.");
    }
}

class CashPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("Cash payment: Please hand the money to the cashier.");
    }
}

class EWalletPayment extends Payment {
    @Override
    public void processPayment() {
        System.out.println("E-wallet payment: Scan the QR code to complete the payment.");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // One parent-class type can refer to different child-class objects.
        Payment payment;

        payment = new CashPayment();
        payment.processPayment();

        payment = new EWalletPayment();
        payment.processPayment();
    }
}
