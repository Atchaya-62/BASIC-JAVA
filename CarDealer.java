
import java.util.*;

class Car{
   String made;
   String model;
   int year;
   double price;

   public Car(String b , String a, int p,double c){
      this.made=b;
      this.model=a;
      this.year=p;
      this.price=c;


}
  public void display(){
       System.out.println("Make: "+this.made);
       System.out.println("Model: "+ this.model);
       System.out.println(this.year);
       System.out.println("Price: "+ this.price);
}
}


public class CarDealer{
    public static void main(String[] args){
       Scanner input=new Scanner (System.in);

       System.out.print("Enter car make: ");
       String b=input.nextLine();
       System.out.print("Enter car model: ");
       String a=input.nextLine();
       System.out.print("Enter car year: ");
       int p=input.nextInt();
       System.out.print("Enter car price: ");
       double c=input.nextDouble();
       System.out.println();
       Car obj=new Car(b,a,p,c);
       obj.display();
}
}