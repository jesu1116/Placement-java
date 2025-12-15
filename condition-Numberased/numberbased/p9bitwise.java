package Numberased.numberbased;
 
import java.util.*;
public class p9bitwise 
{
    public static void main(String[] args) {
        Scanner rs=new Scanner(System.in);
        int a=rs.nextInt();
        
        if((a&1)==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
        
    
         
    }
}