import java.util.Scanner;
class QUADRATIC
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a, b & c of a Quadratic Equation");
        double a=s.nextDouble();
        double b=s.nextDouble();
        double c=s.nextDouble();
        double d=Math.sqrt((b*b)-(4*a*c));
        if(d>0||d==0)
        {
            double r1=(-b+d)/2*a;
            double r2=(-b-d)/2*a;
            System.out.println("Roots are real");
            System.out.println("The roots are "+r1+" "+r2);
        }
        else
        {
            System.out.println("Roots are imaginary");
        }
    }
}