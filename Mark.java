import java.io.*;
import java.util.*;
public class Mark{
  public static void main(String[] args){
         Scanner input=new Scanner (System.in);
         System.out.print("Enter Mark ");
         int a=input.nextInt();
         if ((90<=a) && (a<=100))
           System.out.println("Grade: A");
         else if ((75<=a) && (a<90))
           System.out.println("Grade: B");
         else if ((50<=a) && (a<75))
           System.out.println("Grade: B");
         else
            System.out.println("Grade: Fail");


}
}