// Q4.Write a java program to display mobile Battery Check – "Low Battery", "50% Consumed", or "Battery Full".

import java.util.*;
public class p4
{
 public static void main(String[] args) 
     {
        Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        if(js==100)
        {
            System.out.println("battery full");
        }
        else if(js>=50&&js<100)
        {
           System.out.println("50% consumed");
        }
        else 
        {
            System.out.println("low battery");
        }
         

        
     }
 
}