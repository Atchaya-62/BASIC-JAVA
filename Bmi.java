import java.io.*;
import java.util.*;
public class Bmi{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.print("Enter Weight :");
       double a=input.nextDouble();
       System.out.print("Enter height :");
       double b=input.nextDouble();
       double c=a/(b*b);
       System.out.printf("BMI ",c));
       if (c<18.5)
          System.out.print(" underweight");
       else if(c<24.9 && c>=18.5)
          System.out.print(" Normal weight");
       else if(c>=25 && c<29.9)
          System.out.print(" overweight");
       else
          System.out.print(" obesity");
}
}


