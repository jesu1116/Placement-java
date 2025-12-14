package basic;
import java.util.*;

public class p7swapwithout 
{
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        int j=rs.nextInt();
        int s=rs.nextInt();
        j=j+s;
        s=j-s;
        j=j-s;  
        System.out.println(j+" "+s);
        
    }
}
