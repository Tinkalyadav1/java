class Payment{
    void pay(){
        System.out.println("Payment is processing....");
    }
}
class Creditcard extends Payment {
    void pay(){
        System.out.println("Payment is done using creditcard");
    }
}
class Upi extends Payment{
    void pay(){
        System.out.println("Payment is done using upi");
    }
}
class Netbanking extends Payment{
    void pay(){
        System.out.println("Payment is done using Netbanking");
    }
}

public class Polymorphism{
    public static void main(String [] args){
        Payment p;
        p = new Creditcard();
        p.pay();

        p= new Upi();
        p.pay();

        p=new Netbanking();
        p.pay();
    }
}