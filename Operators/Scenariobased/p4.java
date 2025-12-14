// Q4.Write a java Program to Calculate the Distance Travelled

import java.util.*;
public class p4
 {
    public static void main(String[] args) 
    {
      Scanner rs=new Scanner(System.in);
        int speed=rs.nextInt();
        int time=rs.nextInt();
        int distance=speed*time;
        System.out.println(distance);
    }
}
