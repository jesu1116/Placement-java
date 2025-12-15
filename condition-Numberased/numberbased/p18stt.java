package Numberased.numberbased;
import java.util.*;
 
public class p18stt 

{
    public static void main(String[] args) 
    {
      Scanner rs=new Scanner(System.in);
      int js=rs.nextInt();  
      if(js>0&&js<9)
        {
            System.out.println("Single");
        }  
        else if(js>10&&js<99)
        {
            System.out.println("Two");
        }
        else if(js>100&&js<999)
        {
            System.out.println("Three");
        }
        else 
        {
            System.out.println("Four");
        }
    }
}
