 
import java.util.*;
public class p2ulds 
{
  public static void main(String[] args)
  {
    Scanner rs=new Scanner(System.in);
    char js=rs.next().charAt(0);
    if(Character.isUpperCase(js))
    {
        System.out.println("upper");
    }
    else if(Character.isLowerCase(js))
    {
        System.out.println("lower");
    }
    else if(Character.isDigit(js))
    {
        System.out.println("digit");
    }
    else
    {
      System.out.println("special symbol");
    }
  }    
}
