import java.io.*;
import java.util.*;
public class Range{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.print("Enter upper limit: ");
       int n=input.nextInt();
       System.out.print("Enter divisor: ");
       int d=input.nextInt();
       int i=1;
       for(i=1;i<=n;i++){
         if(i%d==0)
           break;
       }
       if(i==n)
         System.out.print("No number is divisible by "+d);
       else
         System.out.print("The first number divisible by 3 is "+i);
              
}
}