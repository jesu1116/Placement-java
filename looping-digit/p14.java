import java.util.Scanner;

public class p14 
{
   public static void main(String[]  args)
   {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int sumsq=0;
    int sumcube=0;
    while(n>0)
    {
         int d=n%10;
         sumsq+=d*d;
         sumcube+=d*d*d;
         n/=10;
    }
    System.out.println("sum of square :"+sumsq);
    System.out.println("sum of cube :"+sumcube);
   }    
}
