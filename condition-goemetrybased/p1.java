import java.util.Scanner;
 

public class p1 
{
  public static void main(String[] args) 
   {
    Scanner rs=new Scanner(System.in);
    int js1=rs.nextInt();
    int js2=rs.nextInt();
    int js3=rs.nextInt();
    if(js1==js2&&js2==js3)
    {
      System.out.println("Equilateral");
    }
    else if(js1==js2||js2==js3||js3==js1)
    {
      System.out.println("Isosceeles");
    }
    else 
    {
       System.out.println("Scalene");
    }

    
  }
}
