import java.io.*;
import java.util.*;
public class Pascal{
   public static void main(String[] args){
       Scanner input = new Scanner (System.in);
       System.out.print("Enter size  ");
       int a=input.nextInt(); 
       for(int i=1;i<=a;i++){
          int num=1;
        for(int j=0;j<a-i;j++){
            System.out.print(" ");
          }
        for(int k=1;k<=i;k++){
           System.out.print(num+" ");
           num=num*(i-k)/k;
}
        System.out.println();
    
}
}
}