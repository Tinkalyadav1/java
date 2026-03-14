class Car{
    void BWM(){
        System.out.println("Its a BWM");
    }
}
 
 class  Ecar extends Car{
    void Raching (){
        System.out.println("its a electronic car");
    }
 }
  public class InheritanceNew{
    public static void main(String [] args){
        Ecar c = new Ecar();
        c.BWM();
        c.Raching();
    }
  }