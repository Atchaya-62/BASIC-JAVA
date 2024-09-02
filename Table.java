import java.io.*;
import java.util.*;
public class Table{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.print("Enter size of table ");
       int a=input.nextInt(); 
       for(int i=1;i<=a;i++){
        for(int j=1;j<=a;j++)
            System.out.print((i*j)+" ");
       System.out.println();
}
}
}