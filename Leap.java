import java.io.*;
import java.util.*;
public class Leap{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.print("Enter year :");
       int a=input.nextInt();
       if ((a%4==0 && a%400==0)||(a%100!=0))
           System.out.print("This is leap year ");
       else
           System.out.print("This is not a leap year");


}
}