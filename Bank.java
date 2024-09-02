import java.io.*;
import java.util.*;
public class Bank{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.print("Enter current balance :");
       int a=input.nextInt();
       System.out.print("Enter withdraw amount :");
       int b=input.nextInt();
       if(a>b){
         System.out.print("withdraw successful . New balance "+(a-b));
       }
       else{
         System.out.print("withdraw successful . New balance "+(a-b));
       }
}
}
         
