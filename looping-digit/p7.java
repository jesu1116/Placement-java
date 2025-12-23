import java.util.*;
class p7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int last = n % 10;
        int first = n, p = 1;

        while (first >= 10)
        {
            first /= 10;
            p *= 10;
        }

        int middle = (n % p) / 10;
        int result = last * p + middle * 10 + first;

        System.out.println(result);
    }
}
