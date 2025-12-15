// Q9.Write a java program to check if withdrawal amount ≤ balance and is a multiple of 100 (ATM Withdrawal Validation).

import java.util.*;
public class p9 
{
 public static void main(String[] args)
 {
    Scanner rs=new Scanner(System.in);
    int js1=rs.nextInt();
    int js2=rs.nextInt();
    if(js1<=js2&&js1%100==0)
    {
        System.out.println("valid");
    }
    else
    {
        System.out.println("not valid");
    }
    

 }    
}
