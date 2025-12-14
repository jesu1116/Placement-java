// Q15.Write a java Program to Currency Notes from ATM


import java.util.*;
public class p15 
{
  public static void main(String[] args)
  {
      Scanner rs=new Scanner(System.in);
        int js=rs.nextInt();
        int js1=js/2000;
          js%=2000;
        int js2=js/500;
            js%=500;
        int js3=js/200;
            js%=200;
        int js4=js/100;
            js%=100;
        int js5=js/50;
            js%=50;
        int js6=js/20;
            js%=20;
        int js7=js/10;
            js%=10;
        int js8=js/5;
            js%=5;
        int js9=js/2;
            js%=2;
        int js10=js/1;
        System.out.println("2000:"+js1+"\n500:"+js2+"\n200:"+js3+"\n100:"+js4+"\n50:"+js5+"\n20:"+js6+"\n10:"+js7+"\n5:"+js8+"\n2:"+js9+"\n1:"+js10);
         
  }  
}
