import java.util.*;
class TEMPERATURE
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the unit of Temperature");
        char u=s.next().charAt(0);
        System.out.println("Enter the Magnitude of Temperature");
        double t=s.nextDouble();
        switch(u)
        {
            case 'C':
            double f=(1.8*t)+32.0;
            System.out.println("The temperature in Fahrenheit = "+f);
            break;
            case 'F':
            double c=(5.0/9.0)*(t-32.0);
            System.out.println("The temperature in Celsius = "+c);
            break;
        }
    }
}