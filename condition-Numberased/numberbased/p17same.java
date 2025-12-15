package Numberased.numberbased;
import java.util.*;
 
 
public class p17same 
{
    public static void main(String[] args) 
    {
      Scanner rs=new Scanner(System.in);
      int js1=rs.nextInt();   
      int js2=rs.nextInt();
      js1%=10;
      js2%=10;
      if(js1==js2)
        {
            System.out.println("equal");
        } 
        else
        {
            System.out.println("not equal");
        }
        
    }
}
