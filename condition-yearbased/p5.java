import java.util.*;

class p5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();

        
        if (year <= 0 || month < 1 || month > 12) {
            System.out.println("Invalid Year or Month");
        } else {
            int days;

             
            boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

             
            if (month == 2) {
                days = leap ? 29 : 28;
            } else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                       month == 8 || month == 10 || month == 12) {
                days = 31;
            } else {
                days = 30;
            }

            System.out.println("Number of days: " + days);
        }
    }
}
