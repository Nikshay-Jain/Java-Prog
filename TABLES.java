import java.util.*;
class TABLES
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        double t=s.nextDouble();
        double a=1;
        while(a<=10)
        {
            System.out.println(t+" x "+a+" = "+t*a);
            a=a+1;
        }
    }
}