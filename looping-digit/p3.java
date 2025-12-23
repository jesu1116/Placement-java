import java.util.*;
public class p3 
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int temp=a;
    int flag=0;
    while(temp>0)
    {
       int d =temp%10;
        if(b==d)
        {
            flag=1;
          break ;
        }
        temp/=10;
    }
    if(flag==1)
    {
        System.out.println("Digit found");
    }
    else
    {
       System.out.println("Digit not found");
    }

   }    
}
