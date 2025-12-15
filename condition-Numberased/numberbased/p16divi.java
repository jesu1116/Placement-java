package Numberased.numberbased;
import java.util.*;
public class p16divi
 {
    public static void main(String[] args) 
        {
           Scanner rs=new Scanner(System.in);
           int js=rs.nextInt();
           if((js%2==0&&js%5==0)||js%8!=0)
           {
            System.out.println("divisible");
           }
           else
           {
            System.out.println("not divisible");
           }
        }
    
       
}
