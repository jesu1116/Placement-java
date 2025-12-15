import java.util.*;
public class p4 
{
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        int js1=rs.nextInt();
        int js2=rs.nextInt();
        int rs1=js1%10;
        int rs2=js2%10;
        if(rs1==rs2)
        {
            System.out.println("equal");
        }
        else
        {
          System.out.println("not equal");
        }
    }
}
