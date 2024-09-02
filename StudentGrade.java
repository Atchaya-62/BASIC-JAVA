import java.util.*;

public class StudentGrade{
    public static void main(String[] args){
       Scanner input=new Scanner (System.in);
       int[][] ar=new int[3][4];
       System.out.println("Enter marks: ");
       for (int i=0;i<3;i++){
        for(int j=0;j<4;j++)
          ar[i][j]=input.nextInt();
         }
       printStudentAverages(ar);
       printSubjectAverages(ar);
}
    public static void printStudentAverages(int[][] scores) {
        System.out.println("Average scores for each student:");
        for (int i = 0; i < scores.length; i++) {
            double sum = 0;
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            double average = sum / scores[i].length;
            System.out.println("Student " + (i + 1) + ": " + average);
        }
    }

    public static void printSubjectAverages(int[][] scores) {
        System.out.println("Average scores for each subject:");
        for (int j = 0; j < scores[0].length; j++) {
            double sum = 0;
            for (int i = 0; i < scores.length; i++) {
                sum += scores[i][j];
            }
            double average = sum / scores.length;
            System.out.println(getSubjectName(j) + ": " + average);
        }
    }

     public static String getSubjectName(int index) {
        switch (index) {
            case 0:
                return "Math";
            case 1:
                return "Science";
            case 2:
                return "English";
            case 3:
                return "History";
            default:
                return "Unknown Subject";
        }
    }
}


    