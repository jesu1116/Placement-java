import java.util.*;
 
public class p2 
{
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int x,y,z;
       if(a>=b&&a>=c)
       {
        z=a;x=b;y=c;
       }
       else if(b>=a&&b>=c)
       {
           z=b;x=c;y=a;
       }
       else
       {
         z=c;x=a;y=b;
       }
       if(z*z==x*x+y*y)
       {
        System.out.println("equal");
       }
       else
        {
         System.out.println("not equal");
       }

    }
}
