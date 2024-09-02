import java.util.*;

public class Grades{
    public static void main(String[] args){
       Scanner input=new Scanner (System.in);
       int[][] ar=new int[5][2];
       System.out.println("Enter marks: ");
       for (int i=0;i<5;i++){
        for(int j=0;j<2;j++)
          ar[i][j]=input.nextInt();
         }
       printmark(ar);
       printavg(ar);
}
    public static void printmark(int[][] ar){
       System.out.println("Grades of all students: ");
       for (int i=0;i<ar.length;i++){
          System.out.println("Student "+(i+1)+": Math: "+ar[i][0]+", Science: "+ar[i][1]);
}
}
    public static void printavg(int[][] ar){

        int totalmath=0;
        int totalsci=0;
        for (int i=0;i<ar.length;i++){
           totalmath+=ar[i][0];
           totalsci+=ar[i][1];
}
        double avgmath=(double) totalmath/ar.length;
        double avgsci=(double) totalsci/ar.length;
        System.out.printf("Average math grade: %.1f\n",avgmath);
        System.out.printf("Average science grade: %.1f\n",avgsci);
}}



    