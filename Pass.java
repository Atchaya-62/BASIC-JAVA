import java.io.*;
import java.util.*;
public class Pass{
  public static void main(String[] args){
         Scanner input=new Scanner (System.in);
         System.out.print("Enter mark");
         int a=input.nextInt();
         String p="Pass";
         String f="Fail";
         String b=(a>50)?p:f;
         System.out.print(b);
}
}

            

