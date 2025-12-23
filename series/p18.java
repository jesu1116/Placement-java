import java.util.*;
public class p18 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int sum=0;
        for(int i=1;i<=n;i++)
        {
            int temp=i;
            int sum=0;
            while(temp>0)
            {
                int d=temp%10;
                int fact=1;
                for(int j=1;j<=d;j++)
                {
                    fact*=j;
                }
                sum+=fact;
                temp/=10;
            }
            if(sum==i)
            {
                System.out.println("Strong : "+i);
            }


        }
    }
}
