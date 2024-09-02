import java.util.*;
import java.util.Random;

public class Guess{
       public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       Random rand = new Random();
       int k=rand.nextInt(100);
       System.out.println("Welcome to the Guessing Game!");
       System.out.println("I have selected a number between 1 and 100.");
       System.out.println("Can you guess what it is?");
       boolean n=true;
       do{
          System.out.print("Enter your guess: ");
          int a=input.nextInt();
          if(a<k)
            System.out.println("Too low!");
          else if (a>k)
            System.out.println("Too high!");
          else if (a==k){
            System.out.println("Congratulations!You guessed the correct number!");
            n=false;}
         }while(n);
}
}
            


          

         
