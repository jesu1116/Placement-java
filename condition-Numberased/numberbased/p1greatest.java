package Numberased.numberbased;
 
import java.util.*;
public class p1greatest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        int a = sc.nextInt();
         
        int b = sc.nextInt();
         
        
        if (a > b) {
            System.out.println("The greatest number is: " + a);
        }  
         else {
            System.out.println("The greatest number is: " + b);
        }
    }
}