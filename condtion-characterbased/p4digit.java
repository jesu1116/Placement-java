import java.util.*;
public class p4digit 
{
 public static void main(String[] args)
 {
    Scanner rs=new Scanner(System.in);
    char js=rs.next().charAt(0);
    if(Character.isDigit(js))
    // if(js >= '0' && js <= '9')
    {
        System.out.println("digit");
    }
    else
    {
       System.out.println("not digit");
    }
 }    
}
