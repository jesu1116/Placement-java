package basic;
import java.util.*;
public class p10lastfirstsum 
{
  public static void main(String[] args) 
  {
      
        Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        int lastdigit=js%10;
        int firstdigit=js/100;
        
         
         
        
        System.out.println(lastdigit+firstdigit);
      
  }  
}
