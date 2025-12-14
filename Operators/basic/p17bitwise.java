package basic;
import java.util.*;
public class p17bitwise 
{
  public static void main(String[] args)
  {
     Scanner rs=new Scanner(System.in);
     int js=rs.nextInt();
     String jesu=(js&(js-1))==0?"power of 2":"not power of 2";
     System.out.println(jesu);
  }  
}
