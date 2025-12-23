import java.util.*;

public class p16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        while (count < n) {
            int factor = 0;

            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    factor++;
                }
            }

            if (factor == 2) {
                System.out.print(num + " ");
                count++;
            }

            num++;
        }
    }
}
