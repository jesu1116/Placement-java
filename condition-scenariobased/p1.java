// Q1.Write a java Program to calculate different discount for different Bill amount
import java.util.*;
public class p1 
{
    public static void main(String[] args)
    {
      Scanner rs=new Scanner(System.in);
      int js=rs.nextInt();
      if(js>=5000)
      {
        int dis=js*20/100;
        int tot=js-dis;
        System.out.println(dis);
        System.out.println(tot);
      }
      else if(js>=3000&&js<=5000)
      {
        int dis=js*10/100;
        int tot=js-dis;
        System.out.println(dis);
        System.out.println(tot);
      }
      else if(js>=1000&&js<=3000)
      {
        
        int dis=js*5/100;
        int tot=js-dis;
        System.out.println(dis);
        System.out.println(tot);
      }
      else 
      {
        System.out.println("no discount");
      }

    }
}
