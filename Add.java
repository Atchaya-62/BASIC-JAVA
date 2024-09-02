import java.util.*;

class Calculator{
     public int add(int a,int b){
         return a+b;
}
     public int add(int a,int b,int c){
         return a+b+c;
}

     public double add(double a,double b){
         return a+b;
}
}

     

public class Add{
    public static void main(String[] args){
       Scanner input=new Scanner (System.in);
       Calculator obj = new Calculator();
       int h=obj.add(5,6);
       int k=obj.add(6,8,9);
       double j=obj.add(3.4,9);
       System.out.println(h);
       System.out.println(j);
       System.out.println(k);
}}
