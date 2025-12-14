import java.util.*;
public class p13avcuboid 
{
    public static void main(String[] args)
    { 
        Scanner rs=new Scanner(System.in);
        int l=rs.nextInt();
        int b=rs.nextInt();
        int h=rs.nextInt();
        int area = 2*(l*b + b*h + h*l);
        int volume = l*b*h;
        int perimeter = 4*(l+b+h);
        System.out.println("Area: " + area);
        System.out.println("Volume: " + volume);
        System.out.println("Perimeter: " + perimeter);
    }
}