import java.util.*;
public class p25octtoint 
 {
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        String oct=rs.nextLine();
        int decimal=Integer.parseInt(oct,8);
        System.out.println(decimal);
    }
    
}
