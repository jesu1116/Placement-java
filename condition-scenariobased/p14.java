// Q14.Write a java program to assign ticket price based on passenger age (child, adult, senior).



import java.util.*;
public class p14
{
 public static void main(String[] args) 
     {
        Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        if(js>=40)
        {
            System.out.println("senior");
        }
        else if(js>=20&&js<=40)
        {
           System.out.println("adult");
        }
        else 
        {
            System.out.println("child");
        }
         

        
     }
 
}
