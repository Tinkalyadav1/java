import java.util.Scanner;

class Payment {
    void pay() {
        System.out.println("Payment is processing....");
    }
}

class Creditcard extends Payment {
    void pay() {
        System.out.println("Payment is done using Credit Card");
    }
}

class Upi extends Payment {
    void pay() {
        System.out.println("Payment is done using UPI");
    }
}

class Netbanking extends Payment {
    void pay() {
        System.out.println("Payment is done using Netbanking");
    }
}

public class PolymorphismNew {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Payment p;

        System.out.println("Choose Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Netbanking");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                p = new Creditcard();
                p.pay();
                break;

            case 2:
                p = new Upi();
                p.pay();
                break;

            case 3:
                p = new Netbanking();
                p.pay();
                break;

            default:
                System.out.println("Invalid Payment Method");
        }

        sc.close();
    }
}