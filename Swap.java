import java.io.*;
import java.util.*;

public class Swap{
   public static void main(String[] args){
           Scanner input=new Scanner (System.in);
           System.out.print("Enter a");

           int a = input.nextInt();
           System.out.print("Enter b");

           int b = input.nextInt();
           a=a+b;
           b=a-b;
           a=a-b;
           System.out.println("a= "+a);
           System.out.println("b= "+b);
}
}
