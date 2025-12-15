package Numberased.numberbased;
import java.util.Scanner;

public class p11firstdigit 
{
 public static void main(String[] args) 
 {
     Scanner rs=new Scanner(System.in);
     int js=rs.nextInt();
     js/=10;
     if(js%2==0)
     {
        System.out.println("Even");
     }
     else
     {
        System.out.println("Odd");
     }

 }    
}
