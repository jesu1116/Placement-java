import java.util.Scanner;

public class p11 
{
      public static void main(String[] args)
      {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // int temp=n;
        // int count=0;
        for(int i=0;i<=n;i++)
        {
            int temp=n;
            int count=0;
            while(temp>0)
            {
                int d=temp%10;
                if(d==i)

                    {
                        count++;

                    }
                    temp/=10;
            }
            
            if(count>0)
        {
            System.out.println("Frequency "+ count);
        }
      }    

        }
    //  if(count>0)
        // {
            // System.out.println("Frequency "+ count);
        // }
}    

