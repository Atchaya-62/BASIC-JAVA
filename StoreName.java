import java.util.*;

public class StoreName{
    public static void main(String[] args){
       Scanner input=new Scanner (System.in);
       String ar[]=new String[5];
       System.out.print("Enter names: ");
       for (int i=0;i<ar.length;i++){
          ar[i]=input.next();
         }
       String high=ar[0];
       String low=ar[0];
       for (int i=0;i<ar.length;i++){
          if(ar[i].length()>high.length())
             high=ar[i];
          if(ar[i].length()<low.length())
             low=ar[i];
}   
      System.out.print("Names in reverse order: ");

      for (int i=ar.length-1;i>=0;i--){
         System.out.print(ar[i]+",");
         }
       System.out.println();
       System.out.println("Longest name: "+high);
       System.out.println("Shortest name:: "+low);

}
}