import java.util.*;
public class p24hextoint 
 {
     public static void main(String[] args)
     {
         Scanner rs=new Scanner(System.in);
         String hex=rs.nextLine();
         int decimal=Integer.parseInt(hex,16);
         System.out.println(decimal);
     }
    
}
