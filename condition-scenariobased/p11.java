// Q11.Write a java program to apply % of discount based on purchase amount.



import java.util.*;
public class p11
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
