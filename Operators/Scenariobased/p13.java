// Q13.Write a java Program to Mangoes Discount (Buy 3 Get 1 Free) Find Total Amount need to pay


import java.util.Scanner;
public class p13 
{
    public static void main(String[] args) 
    { 
        Scanner rs=new Scanner(System.in);
        int js1=rs.nextInt();
        int js2=rs.nextInt();
        int freemango=js1/4;
        int paymango=js1-freemango;
        int totamout=paymango*js2;
        System.out.println(totamout);


    }
}
