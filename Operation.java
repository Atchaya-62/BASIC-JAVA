import java.util.*;

public class Operation{
  public static void main(String[] args){
     int a,b,n;
    
     Scanner input=new Scanner (System.in);
     while(true){
       System.out.println("1.add\n2.sub\n3.multi\n4.div\n5.exit");
       n=input.nextInt();
       if(n==5)
         break;
     
       System.out.print("Number 1: ");
       a=input.nextInt();
       System.out.print("Number 2: ");
       b=input.nextInt();

       switch(n){
                case 1:
                    System.out.println("addition of this numbers is:"+(a+b));
                    break;
                case 2:
                    System.out.println("subtraction of this numbers is:"+(a-b));
                    break;
                case 3:
                    System.out.println("multiplication of this numbers is:"+(a*b));
                    break;
                case 4:
                    System.out.println("division of this numbers is:"+(a/b));
                    break;
            
                default:
                    System.out.println("enter correct choice");
                    break;
            }
        }
    }
    
}
