import java.util.*;
class POPULATION
{
    Scanner sc=new Scanner(System.in);
    float p,r,s;
    int t;
    POPULATION()
    {
        p=0;
        r=0;
        t=0;
    }
    void COMPUTE()
    {
        System.out.println("Enter the Original Population");
        p=sc.nextFloat();
        System.out.println("Enter the Growth Rate");
        r=sc.nextFloat();
        System.out.println("Enter the Year");
        t=sc.nextInt();
        for(int i=1;i<=7;i++)
        {
            s=p*(1+r/100);
            p=p+s;
            t=t+1;
            System.out.println("The population after end of year "+t+" is "+p);
        }
    }
    public static void main(String args[])
    {
        POPULATION pop=new POPULATION();
        pop.COMPUTE();
    }
}