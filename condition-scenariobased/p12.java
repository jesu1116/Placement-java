// Q12.Write a java program to show weather condition (cold, pleasant, hot, heatwave) based on temperature.


import java.util.*;
public class p12 
{
     public static void main(String[] args)
     {
       Scanner rs=new Scanner(System.in);
       int js=rs.nextInt();
       if(js<10)
       {
        System.out.println("cold");
       }
       else if(js<=24)
       {
        System.out.println("pleasant");
       }
       else if(js<=50)
       {
        System.out.println("hot");
       }
       else 
       {
        System.out.println("heatwave");
       }
       

     } 
}
