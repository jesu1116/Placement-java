// Q6.Write a java program to check pass/fail based on marks (marks ≥ 35 = pass).

import java.util.*;
public class p6
{
    public static void main(String[] args)
    {
        Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        if(js>=35)
        {
            System.out.println("pass");
        }
        else
        {
           System.out.println("fail");
        }
    }
}
