package Numberased.numberbased;
 
import java.util.*;
public class p4evenorodd 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int a = sc.nextInt();
         int b=sc.nextInt();
         int diff=a-b;
         System.out.println("Difference is: "+diff);
        if (diff%2==0) {
            System.out.println("Even");
        }  
         else  {
            System.out.println("Odd");
        }
    }
}