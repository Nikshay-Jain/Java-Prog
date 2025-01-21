import java.util.*;
class HCF_LCM
{
    public static void main(String args[])
    {
        System.out.println("It will give you the Lowest Common Multiple & Highest Common Factor");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 nos");
        int a=s.nextInt();
        int b=s.nextInt();
        int i=1,p=a*b,g=0;
        for(i=1;i<p;i++)
        {
            if(a%i==0&&b%i==0)
            g=i;
        }
        System.out.println("The Highest Common Factor of "+a+" and "+b+" = "+g);
        System.out.println("The Lowest Common Multiple of "+a+" and "+b+" = "+(p/g));
    }
}