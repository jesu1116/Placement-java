 
import java.util.*;
public class p1 
{
  public static void main(String[] args)
  {
    Scanner rs=new Scanner(System.in);
    int js=rs.nextInt();
    if(js%400==0||js%4==0||js%100!=0)
    {
        System.out.println("leap");
    }
    else
    {
       System.out.println("not leap");
    }
    
  }

      
}
