// Q17.Write a java program to assign different ticket prices based on day of the week (weekday/weekend).



import java.util.*;

public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        int price;

        switch(day) {  // Convert input to lowercase for consistency
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                price = 100;
                System.out.println(price);
                break;

            case "saturday":
            case "sunday":
                price = 150;
                 System.out.println(price);
                break;

            default:
                price = 0;
                System.out.println("Invalid Day");
        }

         
    }
}
