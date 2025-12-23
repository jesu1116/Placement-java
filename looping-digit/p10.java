 
import java.util.*;
public class p10 
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int l=Integer.toString(n).length();
    int even=0;
    int odd=0;
    for(int i=0;i<l;i++)
    {
       int d=n%10;
       if(d%2==0)
       {
        even++;
       }
       else
       {
        odd++;
       }
       n/=10;
    }
    if(even>=0&&odd==0)
    {
        System.out.println("Even");
    }
    else if(odd>=0&&even==0)
    {
        System.out.println("Odd");

    }
    else 
    {
        System.out.println("Mixed");
    }
   }    
}
