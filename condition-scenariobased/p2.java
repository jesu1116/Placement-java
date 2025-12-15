// Q2.Write a java Program to check whether a person is eligible to vote (age ≥ 18)

import java.util.*;
public class p2 
{
 public static void main(String[] args) 
     {
        Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        if(js>=18)
        {
            System.out.println("Eligible");
        }
        else
        {
           System.out.println("not eligible");
        }

        
     }
 
}
