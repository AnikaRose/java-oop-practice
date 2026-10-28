class SmartDevice {
    String brand = "Samsung";
    
    void powerOn() {
        System.out.println("Device is turning on...");
    }
}

public class Inheritance extends SmartDevice {
    String os = "Android";

    public static void main(String[] args) {
        Inheritance phone = new Inheritance();
        
        // Inherited method from parent class
        phone.powerOn();
        
        // Accessing parent and child attributes
        System.out.println("Brand: " + phone.brand + ", OS: " + phone.os);
    }
}