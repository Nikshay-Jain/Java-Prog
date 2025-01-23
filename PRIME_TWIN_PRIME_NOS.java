import java.util.Scanner;
class PRIME_TWIN_PRIME_NOS
{
    int Twin(int n)
    {
        int i,c=0,f=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        f=1;
        return f;
    }
    void Twisted_Prime(int tn)
    {
        int ta,tb=0,tb1=0,pt=tn;
        for(ta=1;ta<=tn;ta++)
        {
            if(tn%ta==0)
            tb++;
        }
        if(tb==2)
        {
        int rn=0,d=0,p=tn;
        while(tn!=0)
        {
            d=tn%10;
            rn=rn*10+d;
            tn/=10;
        }
        for(ta=1;ta<=rn;ta++)
        {
            if(rn%ta==0)
            tb1++;
        }
        if(tb1==2)
        System.out.println(pt+" is a Twisted Prime number");
        else
        System.out.println(pt+" is not a Twisted Prime number");
        }
        else
        System.out.println("It is not a Prime number.");
    }
    public static void main(String args[])
    {
        System.out.println("Two Prime nos with difference of 2 are called Twin Prime nos.\nEg. 11 and 13");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 Nos");
        int a=s.nextInt(),m=a;
        int b=s.nextInt(),n=b;
        PRIME_TWIN_PRIME_NOS ob=new PRIME_TWIN_PRIME_NOS();
        int x=ob.Twin(a);
        int y=ob.Twin(b);
        if(x==1)
        System.out.println("The no "+m+" is a Prime No and "+n+" is Composite");
        if(y==1)
        System.out.println("The no "+n+" is a Prime No and "+m+" is Composite");
        if((x==1&&y==1)&&(a-b==2||b-a==2))
        System.out.println("The 2 nos are Twin Prime Nos");
        else
        System.out.println("Both the nos are Composite");
        System.out.println("\nA Prime number is said to be a Twisted Prime number if the new\nnumber obtained after reversing the digits, is also a Prime number.\n");
        ob.Twisted_Prime(a);
        ob.Twisted_Prime(b);
    }
}