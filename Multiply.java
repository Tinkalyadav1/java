/* public class Multiply{
    public static void main(String [] args){
        int a = 10;
        int b= 20;
        int sum = a*b;

        System.out.println(sum);
    
    }
}
*/

// by using scanner
import java.util.Scanner;
public class Multiply{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value a: ");
        int a =sc.nextInt();
        System.out.print("Enter value b: ");
        int b = sc.nextInt();
      
       int sum = a*b;
       System.out.println("Result: " +sum);
 sc.close();
    }
}