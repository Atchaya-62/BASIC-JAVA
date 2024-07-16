import java.io.*;
import java.util.*;

public class FtoC{
  public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter F ");
        double f=input.nextDouble();
        double c=((f-32)*5)/9;
        System.out.print("Celcius= " + c);
}
}