import java.io.*;
import java.util.*;
public class Sum{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.print("Enter a positive integer ");
       int a=input.nextInt();
       int sum=0;
       for(int i=1;i<=a;i++){
           sum+=i;
        }
       System.out.print("Sum of first 5 natural numbers : "+sum);
}}

