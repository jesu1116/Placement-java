import java.util.*;
public class p13
 {
   public static void main(String[] args) 
       {
               Scanner sc=new Scanner(System.in);
               int n=sc.nextInt();
               int result=0;
               int pos=1;
               while(n>0)
               {
                int d=n%10;
                if(d!=0)
                {
                   result = d * pos + result;
                   pos *= 10;

                }
                n/=10;
               }
              System.out.println(result);
       }
}    

