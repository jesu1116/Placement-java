import java.util.*;
public class p15avcylinder 
{
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int r = rs.nextInt();
        int h = rs.nextInt();   
        double area = 2 * 3.14 * r * (r + h);
        double volume = 3.14 * r * r * h;
        System.out.printf("Area: " + "%.2f",area);
        System.out.println("Volume: " + volume);
    }
}