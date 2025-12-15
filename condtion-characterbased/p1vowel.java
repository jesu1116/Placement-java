import java.util.*;
public class p1vowel 
{
       public static void main(String[] args) 
           {
            Scanner rs=new Scanner(System.in);
            char js=rs.next().charAt(0);
            if(js=='a'||js=='e'||js=='i'||js=='o'||js=='u'||js=='A'||js=='E'||js=='I'||js=='O'||js=='U')
            {
                System.out.println("Vowels");
            }

            else
            {
                System.out.println("Consonants");
            }
           }
    
}
