import java.io.*;
import java.util.*;
public class Skip{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.print("Enter a positive integer: ");
       int a=input.nextInt();
       System.out.println("Odd numbers from 1 to  "+a);
 
       for(int i=1;i<=a;i++){
          if(i%2==0)
             continue;
          else
             System.out.print(i +" ");

}
}}