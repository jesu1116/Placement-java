import java.util.*;
public class p3alpha
{
    public static void main(String[] args)
    {
        Scanner rs=new Scanner (System.in);
        char js=rs.next().charAt(0);
        if(Character.isLetter(js))
        {
            System.out.println("Alphabet");
        }
        else
        {
            System.out.println("Not alphabet");
        }
    }
}
