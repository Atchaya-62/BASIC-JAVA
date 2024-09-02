
import java.util.*;

class Student{
   String name;
 
   double hgrade;
   double fgrade;

   public Student(String b , double p,double c){
      name=b;
      
      hgrade=p;
      fgrade=c;


}
  public void display(){
       System.out.println("Student Name: "+name);
       System.out.println("Homework Grade: "+ hgrade);
       System.out.println("Final Grade: "+ fgrade);
}
}


public class GradeManager{
    public static void main(String[] args){
       Scanner input=new Scanner (System.in);

       System.out.print("Name: ");
       String b=input.nextLine();
       System.out.print("Homework grade: ");
       double p=input.nextDouble();
       System.out.print("Final Grade: ");
       double c=input.nextDouble();
       System.out.println();
       Student obj=new Student(b,p,c);
       obj.display();
       double avg=(p+c)/2;
       System.out.println("Average Grade: "+avg);

}
}