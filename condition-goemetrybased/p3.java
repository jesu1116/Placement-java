import java.util.*;
public class p3 
{
    public static void main(String[] args)
    {
        Scanner rs=new Scanner (System.in);
        int js1=rs.nextInt();
        int js2=rs.nextInt();
        if(js1>0&&js2>0)
        {
            System.out.println("1");
        }
        else if(js1>0&&js2<0)
        {
          System.out.println("2");
        }
        else if(js1<0&&js2<0)
        {
            System.out.println("3");
        }
        else if(js1<0&&js2>0)
        {
            System.out.println("4");
        }
        else if(js1==0&&js2==0)
        {
            System.out.println("O");
        }
        else if(js1!=0&&js2==0)
        {
            System.out.println("y");
        }
        else
        {
            System.out.println("x");
        }
            
    }
}
