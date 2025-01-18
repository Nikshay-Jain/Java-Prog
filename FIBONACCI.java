import java.util.*;
class FIBONACCI
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no till which you want to see this series");
        int n=s.nextInt();
        int a=0,b=1,c=0,i=0;
        System.out.println("The Series is : ");
        System.out.println(a);
        System.out.println(b);
        while(i<=n)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            i++;
        }
    }
}