package Numberased.numberbased;
import java.util.*;
public class p6greatest 
{
    public static void main(String[] args) {
         Scanner rs=new Scanner(System.in);
        int a=rs.nextInt();
        int b=rs.nextInt();
        int c=rs.nextInt();
        if (a > b && a > c) {
            System.out.println("a is greatest");
        } else if (b > a && b > c) {
            System.out.println("b is greatest");
        } else {
            System.out.println("c is greatest");
        }
    }
}