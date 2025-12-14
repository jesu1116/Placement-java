import java.util.*;
public class p11distance 
{
  public static void main(String[] args)
  {
    Scanner rs=new Scanner(System.in);

    int js1=rs.nextInt();
    int rs1=rs.nextInt();
    int js2=rs.nextInt();
    int rs2=rs.nextInt();
    double jesu=Math.sqrt((rs1-js1)*(rs1-js1)+(rs2-js2)*(rs2-js2));
    System.out.printf("%.2f",jesu);

  }    
}
