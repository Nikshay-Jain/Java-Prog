import java.util.*;
class FACTORS
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=s.nextInt();
        int i;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            System.out.println(i+" is a factor of "+n);
        }
    }
}