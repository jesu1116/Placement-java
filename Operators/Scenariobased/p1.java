 //Q1.Write a java Program to print Price After Discount
import java.util.*;
 public class p1 
{
 public static void main(String[] args) 
     {
        Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        int discount=rs.nextInt();  
        double afterdiscount=js*discount/100.0;
        double priceafterdiscount=js-afterdiscount;
        System.out.printf("%.2f",priceafterdiscount);}
   
}
