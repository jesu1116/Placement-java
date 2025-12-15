// Q16.Write a java program to validate a mobile number . If it has 10 digits print “Valid Number” otherwise print “Invalid Number”.


import java.util.*;
public class p16 
{
   public static void main(String[] args)
   {
    Scanner rs=new Scanner(System.in);
    String js=rs.next();
    if(js.length()==10)
    {
        System.out.println("valid");
    }
    else
    {
       System.out.println("invalid");
    }
   }    
}
