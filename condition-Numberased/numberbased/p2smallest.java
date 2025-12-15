package Numberased.numberbased;
import java.util.*;
public class p2smallest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int a = sc.nextInt();
         
        int b = sc.nextInt();
         
        
        if (a < b) {
            System.out.println("The smallest number is: " + a);
        }  
         else {
            System.out.println("The smallest number is: " + b);
        }
    }
}
