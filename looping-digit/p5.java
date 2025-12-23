import java.util.*;
public class p5 
{
  public static void main(String[] args) 
      {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
               

        int prev = 10;    
        boolean ascending = true;

        while (n > 0) {
            int digit = n % 10;

            if (digit > prev) {
                ascending = false;
                break;
            }

            prev = digit;
            n /= 10;
        }

        if (ascending)
            System.out.println("Digits are in ascending order");
        else
            System.out.println("Digits are NOT in ascending order");
    }
}

      
  

