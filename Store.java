,import java.util.*;

class Book{
   String b,a;
   double p;
   int c;

   public void getBook(){
       Scanner input=new Scanner (System.in);

       System.out.print("Enter book title: ");
       b=input.nextLine();
       System.out.print("Enter book author: ");
       a=input.nextLine();
       System.out.print("Enter book price: ");
       p=input.nextDouble();
       System.out.print("Enter number of copies: ");
       c=input.nextInt();
}
  public void display(){
       System.out.println("Book title: "+ b);
       System.out.println("Book author: "+ a);
       System.out.println("Book price: "+ p);
       System.out.println("Number of copies: "+ c);
}
}


public class Store{
    public static void main(String[] args){
       Book book1=new Book();
       System.out.println("Enter details for book 1: ");
       book1.getBook();
       System.out.println();

       Book book2=new Book();
       System.out.println("Enter details for book 2: ");
       book2.getBook();
       System.out.println();

       Book book3=new Book();
       System.out.println("Enter details for book 3: ");
       book3.getBook();
       System.out.println();


       System.out.println("Books in the Inventory :");
       book1.display();
       System.out.println();

       book2.display();
       System.out.println();


       book3.display();
       System.out.println();
}
}



