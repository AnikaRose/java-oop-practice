class BankAccount {
    private double balance = 500.0; // Hidden data

    // Getter method
    public double getBalance() {
        return balance;
    }

    // Setter method with simple validation
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

public class Encapsulation{
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        
        // Modifying private data safely through a method
        account.deposit(150.0);
        
        // Accessing private data safely through a getter
        System.out.println("Current Balance: $" + account.getBalance());
    }
}