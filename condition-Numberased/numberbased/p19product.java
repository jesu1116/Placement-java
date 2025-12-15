package Numberased.numberbased;
import java.util.*;
public class p19product 
{
  public static void main(String[] args)
  {
    Scanner rs=new Scanner(System.in);
    int js1=rs.nextInt();
    int js2=rs.nextInt();
    int product=js1*js2;
    if(product%2==0)
    {
        System.out.println("Even");
    }
    else
    {
       System.out.println("Odd");
    }

  }

}
