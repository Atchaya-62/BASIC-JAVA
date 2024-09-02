import java.util.*;

class Employee{
   String name;
   int Id;
   double salary;
   double allow;
      public Employee(String b , int a, double p,double c){
      name =b;
      Id=a;
      salary=p;
      allow=c;


}
  public void display(){
       System.out.println("Name: "+name);
       System.out.println("ID: "+ Id);
       System.out.println("Basic salary: $"+salary);
       System.out.println("Allowance: $"+ allow);
       System.out.println("Gross salary: $"+ (salary+allow));

}
}


public class Salary{
    public static void main(String[] args){
       Scanner input=new Scanner (System.in);
       System.out.print("Enter number of employees: ");
       int n=input.nextInt();
       Employee ar[]=new Employee[n];
       for(int i=0;i<n;i++){
         System.out.println("Enter details for employee "+ (i+1));

         System.out.print("Name: ");
         String b=input.next();
         System.out.print("Id: ");
         int a=input.nextInt();
         System.out.print("Basic Salary: ");
         double p=input.nextDouble();
         System.out.print("Allowance: ");
         double c=input.nextDouble();
         System.out.println();
         Employee obj=new Employee(b,a,p,c);
         ar[i]=obj;
}
      for(int i=0;i<n;i++){
         System.out.println("details of employee "+ (i+1)); 
         ar[i].display();
         System.out.println();

}
}}

