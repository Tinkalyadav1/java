//SWAP A NUMBER 

/*public class Swap{
    public static void main(String [] args){
        int m = 1;
        int n = 3;
        System.out.println("Before swapping: m = " + m + ", n = " + n);
        int temp = m;
        m = n;
        n = temp;
      System.out.println("After swapping: m = " + m + ", n = " + n);
    }
} */

// BY USING A MANULLY ENTER A NUMBER 
import java.util.Scanner;
public class Swap{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a : ");
        int a = sc.nextInt();

        System.out.print("Enter a number b: ");
        int b = sc.nextInt();
        int temp; 
        temp = a;
        a=b;
        b=temp;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        sc.close();


    }
}