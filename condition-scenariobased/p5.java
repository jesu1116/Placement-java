// Q5.Write a java program to check if temperature is above 100 (fever check).

import java.util.*;
public class p5 
{
    public static void main(String[] args) 
    {
      Scanner rs=new Scanner(System.in);
      double js=rs.nextDouble(); 
      if(js>100)
        {
            System.out.println("fever");
        }  
        else
            {
                System.out.println("normal");
            } 
    }
}
