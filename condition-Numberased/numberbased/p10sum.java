package Numberased.numberbased;
import java.util.Scanner;

public class p10sum 
{
  public static void main(String[] args)
  {
    Scanner rs=new Scanner(System.in);
    {
        int js1=rs.nextInt();
        int js2=rs.nextInt();
        int sum=js1+js2;
        if(sum%2==0)
        {
            System.out.println("Even");

        }
        else
        {
            System.out.println("Odd");
        }
    }
  }    
}
