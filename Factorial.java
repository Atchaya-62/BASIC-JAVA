import java.io.*;
import java.util.*;
public class Factorial{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.print("Enter a positive integer ");
       int a=input.nextInt();
       int fact=1;
       for(int i=1;i<=a;i++)
         fact=fact*i;
     
       System.out.print("Factorial of "+a+" is "+fact);
}
}