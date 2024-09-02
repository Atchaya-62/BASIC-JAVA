import java.io.*;
import java.util.*;
public class Password{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       String a="atchaya";
       while(true){
        System.out.print("Enter password ");
        String k=input.next();
        if(k.equals(a)){
          System.out.print("password accepted");

          break;}
        else
          System.out.println("Incorrect password. Try again.");
         
       }

}
}