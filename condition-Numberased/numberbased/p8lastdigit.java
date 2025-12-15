package Numberased.numberbased;
 
import java.util.Scanner;
public class p8lastdigit 

{
    public static void main(String[] args) {
        {
          Scanner rs=new Scanner(System.in);
          int js=rs.nextInt();
          int lastdigit=js%10;
          if(lastdigit%3==0)
          {
              System.out.println("divisible by 3");
          }
          else
          {
              System.out.println("not divisible by 3");
          }
           
        }
    }
}
