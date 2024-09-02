import java.util.*;

class Ani{
     public void makeSound(){
         System.out.println("Animal makes a sound");

}
}
class Dog extends Ani{
     public void makeSound(){
         System.out.println("Dog Barks");
}
}
public class Animal{
    public static void main(String[] args){
         Ani myAni = new Ani();
         Dog myDog=new Dog();
         myAni.makeSound();
         myDog.makeSound();
         

         
}
}