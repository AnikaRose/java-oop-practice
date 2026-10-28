class Payment {
    void processPayment() {
        System.out.println("Processing generic payment...");
    }
}

class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing payment via Credit Card.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Payment myPayment = new CreditCardPayment(); // Polymorphic reference
        
        // Calls the overridden method in CreditCardPayment
        myPayment.processPayment();
    }
}