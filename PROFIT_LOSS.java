import java.util.*;
class PROFIT_LOSS
{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter Cost Price");
        double cp=s.nextDouble();
        System.out.println("Enter Selling Price");
        double sp=s.nextDouble();
        if(sp>cp)
        {
            double p=sp-cp;
            double pp=(p/cp)*100;
            System.out.println("Profit = Rs. "+p);
            System.out.println("Profit Percentage = "+pp+"%");
        }
        else if(sp==cp)
        {
            System.out.println("Profit = Loss = Rs. 0");
            System.out.println("Profit Percentage = Loss Percentage = 0%");
        }
        else if(cp>sp)
        {
            double l=cp-sp;
            double lp=(l/cp)*100;
            System.out.println("Loss = Rs."+l);
            System.out.println("Loss Percentage = "+lp+"%");
        }
    }
}