// Q13.Write a java program to display mobile battery status (full, moderate, low).?



import java.util.*;
public class p13
{
 public static void main(String[] args) 
     {
        Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        if(js==100)
        {
            System.out.println("full");
        }
        else if(js>=50&&js<100)
        {
           System.out.println("50% moderate");
        }
        else 
        {
            System.out.println("low ");
        }
         

        
     }
 
}
