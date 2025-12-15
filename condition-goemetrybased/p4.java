import java.util.*;
public class p4 
{
    public  static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        int js1=rs.nextInt();
        int js2=rs.nextInt();
        int js3=rs.nextInt();
        int jesu=js1+js2+js3;
        
        if(jesu==180)
        {
            System.out.println("valid");
        }
        else 
        {
          System.out.println("not valid");
        }
    }
}
