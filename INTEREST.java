import java.util.*;
class INTEREST
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Principal Amount");
        double p=s.nextDouble();
        System.out.println("Enter The Rate Of Interest");
        double r=s.nextDouble();
        System.out.println("Enter The Time In Years");
        double t=s.nextDouble();
        double si=p*r*t/100.0;
        double sa=si+p;
        System.out.println("Simple Interest:");
        System.out.println("Simple Interest for Rs. "+p+" at Rate "+r+" for time "+t+" Years\nis Rs. "+si);
        System.out.println("Total Amount to pay by Simple Interest is Rs. "+sa);
        double ca=p*Math.pow(1+r/100,t);
        double ci=ca-p;
        double da=ca-sa;
        System.out.println("\nCompound Interest:");
        System.out.println("Compound Interest for Rs. "+p+" at Rate "+r+" for time "+t+" Years\nis Rs. "+ci);
        System.out.println("Total Amount to pay by Compound Interest is Rs. "+ca);
        System.out.println("\nThe difference between the two interests is: "+da);
    }
}