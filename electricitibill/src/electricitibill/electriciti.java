package electricitibill;

import java.util.Scanner;

public class electriciti {
   int cid;
   String cname,date;
   float total,unit,price;
   public void accept() {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter custmer name:");
   cname=sc.next();
   System.out.println("enter cust id:");
   cid=sc.nextInt();
   System.out.println("enter date:");
   date=sc.next();
   System.out.println("enter unit:");
   unit=sc.nextFloat();
   System.out.println("enter unit price:");
   price=sc.nextFloat();
   }
   public void calculate() {
	   total=unit*price;
   }
   public void display() {
	   System.out.println("\t++++++++++++++++++++++++++++++++++");
	   System.out.println("\tCustmer Name               :"+cname);
	   System.out.println("\tCustmer ID                 :"+cid);
	   System.out.println("\tDate                       :"+date);
	   System.out.println("\tUnit                       :"+unit);
	   System.out.println("\tprice                      :"+price);
	   System.out.println("\tTotal                      :"+total);
	   System.out.println("\t++++++++++++++++++++++++++++++++++");
   }   
}

