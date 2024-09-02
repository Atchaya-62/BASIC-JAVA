import java.util.*;

public class Multiply{
       public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       Random rand = new Random();
       System.out.println("Welcome to the Multiplication Practice Program!");
       boolean n=true;
       while (n == true){
          int a= rand.nextInt(10);
          int b=rand.nextInt(10);
          System.out.println("What is "+a+"*"+b);
          int k=input.nextInt();
          if (a!=0 && b!=0 && k==0){
             System.out.print("Thank you for practicing!");
             n=false;
}
          else{
            if (k==(a*b)){
              System.out.println("Correct !");
             }
            else if (k!=0 && k!=a*b) {
              System.out.println("Incorrect ! The correct answer is "+(a*b));
             }
         }
        }
}
}





   