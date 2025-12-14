package basic;
public class p19greatest3 
{
    public static void main(String[] args) 
    {
        java.util.Scanner rs=new java.util.Scanner(System.in);
        int js=rs.nextInt();
        int jsrs=rs.nextInt();
        int jsr=rs.nextInt();
        int greatest=(js>jsrs)?(js>jsr?js:jsr):(jsrs>jsr?jsrs:jsr);
        System.out.println(greatest);
    }
}
