// Q19.Write a java program to display mobile data usage alert – "Low Data", "Half Consumed", or "Data Over" based on usage.


import java.util.*;

public class p19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int usage = sc.nextInt();

        if (usage <= 500)
            System.out.println("Low Data");
        else if (usage <= 1000)
            System.out.println("Half Consumed");
        else
            System.out.println("Data Over");
    }
}
