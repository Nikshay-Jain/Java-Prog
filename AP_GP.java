import java.util.*;
class AP_GP
{
    double tn,sn,i;
    void AP(double a,double d,int n)
    {
        System.out.println("The AP is:");
        for(i=a;i<=n;i++)
        {
            tn=a+(i-1)*d;
            System.out.print(tn+" ");
        }
        tn=a+(n-1)*d;
        sn=(n/2)*(a+tn);
        System.out.println("\nThe "+n+"th term of this AP is: "+tn);
        System.out.println("The Sum of "+n+" terms of this AP is: "+sn);
    }
    void GP(double a,double r,int n)
    {
        System.out.print("The GP is:\n"+a);
        for(i=a;i<=n;i++)
        {
            tn=a*(Math.pow(r,(i-1)));
            System.out.print(" "+tn);
        }
        tn=a*(Math.pow(r,(i-1)));
        if(r==1.0)
        sn=n*a;
        else if(r<1.0)
        sn=(a*(1-(Math.pow(r,n))))/(1-r);
        else
        sn=(a*(Math.pow(r,n)-1))/(r-1);
        System.out.println("\nThe "+n+"th term of this GP is: "+tn);
        System.out.println("The Sum of "+n+" terms of this GP is: "+sn);
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("1. Arithmetic Progression");
        System.out.println("2. Geometric Progression");
        System.out.println("Enter your choice:");
        int c=s.nextInt();
        System.out.println("Enter the first term");
        double a=s.nextDouble();
        System.out.println("Enter the term till which you want to see");
        int n=s.nextInt();
        AP_GP ob=new AP_GP();
        switch(c)
        {
            case 1:
            System.out.println("Enter the Common Difference");
            double d=s.nextDouble();
            ob.AP(a,d,n);
            break;
            case 2:
            System.out.println("Enter the Common Ratio");
            double r=s.nextDouble();
            ob.GP(a,r,n);
            break;
            default:
            System.out.println("Wrong Choice!!!");
        }
    }
}