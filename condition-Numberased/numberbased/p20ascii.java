package Numberased.numberbased;
import java.util.*;

public class p20ascii 
{
  public static void main(String[] args)
  {
    Scanner rs=new Scanner(System.in);
    char js=rs.next().charAt(0);
    int js1=js;
    if(js1%2==0)
    {
        System.out.println("even");
    }
    else
    {
      System.out.println("odd");
    }

  }
}
