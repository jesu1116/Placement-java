import java.util.*;
public class p10 
{
        public static void main(String [] args)
        {
            Scanner sc=new Scanner(System.in);
            char ch=sc.next().charAt(0);
            char ch2=sc.next().charAt(0);

            for(char c=ch;c<=ch2;c++)
            {
               System.out.print(Character.toLowerCase(c)+" ");
            }
        }
}
