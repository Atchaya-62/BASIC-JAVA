import java.util.*;

public class StudentScore{
    public static void main(String[] args){
       Scanner input=new Scanner (System.in);
       int ar[]=new int[5];
       System.out.print("Enter Scores: ");
       for (int i=0;i<ar.length;i++){
          ar[i]=input.nextInt();
         }
       int total=0;
       int high=ar[0];
       int low=ar[0];
       for (int i=0;i<ar.length;i++){
          total+=ar[i];
          if(ar[i]>high)
             high=ar[i];
          if(ar[i]<low)
             low=ar[i];
}
       double avg=(double) total/ar.length;
       System.out.print("Scores: ");
       for (int i=0;i<ar.length;i++){
         System.out.print(ar[i]+" ");
         }
       System.out.println();
       System.out.println("Average score: "+avg);
       System.out.println("Highest score: "+high);
       System.out.println("Lowest score: "+low);

      }}  


       
       