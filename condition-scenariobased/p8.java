// Q8.Write a java program to check if an entered PIN matches the stored ATM PIN before allowing withdrawal.

import java.util.*;
public class p8 
{
  public static void main(String[] args)
  {
    Scanner rs=new Scanner(System.in);
    int js1=rs.nextInt();
    int js2=1116;
    if(js1==js2)
    {
        System.out.println("match");
    }
    else
    {
       System.out.println("not match");
    }
    
  }    
}
