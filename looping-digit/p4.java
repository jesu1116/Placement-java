import java.util.*;
public class p4 
{
  public static void main(String[] args) 
      {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt(); 
       int temp=a;
       int c=0;
       while(temp>0)
       {
        int d=temp%10;
        if(d==b)
        {
            c++;
        }
        temp/=10;
       }
       System.out.println(c);
      }
     
}
