package Numberased.numberbased;
 
import java.util.*;
public class p7smallest 
{
    public static void main(String[] args) {
        Scanner rs=new Scanner(System.in);
        int a=rs.nextInt();
        int b=rs.nextInt();
        int c=rs.nextInt();
        if (a < b && a < c) {
            System.out.println("a is smallest");
        } else if (b < a && b < c) {
            System.out.println("b is smallest");
        } else {
            System.out.println("c is smallest");
        }
    }
}