// Q3.Write a java Program to check whether a person is eligible for senior citizen benefits (age ≥ 60)

import java.util.*;
public class p3
{
 public static void main(String[] args) 
     {
        Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        if(js>=60)
        {
            System.out.println("citizen");
        }
        else if(js>=40&&js<=60)
        {
           System.out.println("men");
        }
        else if(js>=20&&js<=40)
        {
            System.out.println("man");
        }
        else
        {
            System.out.println("adult");
        }

        
     }
 
}