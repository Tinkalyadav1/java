import java.util.Scanner;
import java.util.Random;

public class MainM {
    static Scanner sc = new Scanner(System.in);
    static int GLoan;
    static int ratePerGram = 4500;
    static int Netweight;
    static String loanAccount;

    static boolean User() {
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();

        System.out.println("Enter a Mobile Number:");
        String mobile = sc.nextLine();

        System.out.println("Enter Address:");
        String address = sc.nextLine();

        System.out.println("Enter PAN:");
        String pan = sc.nextLine();

        System.out.println("Enter Age:");
        int age = sc.nextInt();
        sc.nextLine();

        if (mobile.length() == 10) {
            return true;
        } else {
            System.out.println("Mobile number must be 10 digits.");
            return false;
        }
    }

    static void Loan() {
        System.out.println("Enter Ornament Name:");
        String name = sc.nextLine();

        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();

        System.out.println("Enter Gross Weight:");
        int gross = sc.nextInt();

        System.out.println("Enter Impurity:");
        int impurity = sc.nextInt();

        Netweight = gross - impurity;
        System.out.println("Calculated Net Weight: " + Netweight);
    }

    static void Calculation() {
        int charges = 300;

        GLoan = Netweight * ratePerGram;
    
        System.out.println("Loan Eligibility: " + GLoan);
        System.out.println("Processing Charges: " + charges);

        int finalAmount = GLoan - charges;
        System.out.println("Final Loan Amount Disbursed: " + finalAmount);
    }

    public static void main(String[] args) {
        if (User()) {
            Loan();
            Calculation();
        }
    }
}
