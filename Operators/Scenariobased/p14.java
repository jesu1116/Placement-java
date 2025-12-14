// Q14.Write a java Program to Pens Discount (Buy 5, Pay for 3) Find Total Amount need to pay


import java.util.Scanner;
public class p14 
{
    public static void main(String[] args) 
    {
        Scanner rs=new Scanner(System.in);
        int js1=rs.nextInt();
        int js2=rs.nextInt();
        int freepens=js1/5;
        int paypens=js1-freepens;
        int totalamount=paypens*js2;
        System.out.println(totalamount);
    }
}