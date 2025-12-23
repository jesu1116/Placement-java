import java.util.Scanner;

public class p14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   
        int sum = 0;
        int count = 0;

        while (count < n) {
            int num = sc.nextInt();

            if (num > 0) {
                sum += num;
                count++;
            }
             
        }

        System.out.println("Sum = " + sum);
    }
}
