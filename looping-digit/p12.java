import java.util.*;
public class p12 
{
 public static void main(String[] args)
 {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int evensum=0;
    int oddsum=0;
    while(n>0)
    {
        int d=n%10;
        if(d%2==0)
        {
            evensum+=d;
        }
        else 
        {
            oddsum+=d;
        }
        n/=10;
    }
    int diff=evensum-oddsum;
    System.out.println(diff);
 }   
}
