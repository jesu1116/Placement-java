import java.util.*;

public class p17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int temp = i;
            int digits = 0;

            // count digits
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = i;
            int sum = 0;

            // calculate Armstrong sum
            while (temp > 0) {
                int d = temp % 10;
                sum += Math.pow(d, digits);
                temp /= 10;
            }

            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
}

