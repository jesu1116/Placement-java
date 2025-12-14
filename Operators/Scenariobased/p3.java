// Q3.Write a java Program to Split the Bill Among 3 Friends

import java.util.*;
public class p3 
{
    public static void main(String[] args) 
    {
        Scanner rs=new Scanner(System.in);
        int totalbill=rs.nextInt();
        int numberoffriends=rs.nextInt();
        int share=totalbill/numberoffriends;
        System.out.println(share);
    }
}
