

// Q10.Write a java program to print "Stop / Ready / Go" based on traffic light color.

import java.util.*;

public class p10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String color = sc.next();

        switch(color) {
            case "Red":
            case "red":
                System.out.println("Stop");
                break;

            case "Yellow":
            case "yellow":
                System.out.println("Ready");
                break;

            case "Green":
            case "green":
                System.out.println("Go");
                break;

            default:
                System.out.println("Invalid Color");
        }
    }
}