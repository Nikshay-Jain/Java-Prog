import java.util.*;
class AREA
{
    Scanner sc= new Scanner(System.in);
    void Circle()
    {
        System.out.println("For Circle : ");
        System.out.println("Enter Radius");
        double radius=sc.nextDouble();
        double ca=Math.PI*(radius*radius);
        System.out.println("Area = "+ca);
    }
    void Triangle()
    {
        System.out.println("For Triangle : ");
        System.out.println("1. Equilateral Triangle");
        System.out.println("2. Isosceles Triangle");
        System.out.println("3. Scalene Triangle");
        System.out.println("Enter your choice");
        int t=sc.nextInt();
        switch(t)
        {
            case 1:
            System.out.println("Enter side of Equilateral Triangle");
            double side=sc.nextDouble();
            double eta=((Math.sqrt(3.0))/4.0)*side;
            System.out.println("Area of Equilateral Triangle = "+eta);
            break;

            case 2:
            System.out.println("Enter side of Isosceles Triangle");
            double iside=sc.nextDouble();
            System.out.println("Enter base of Isosceles Triangle");
            double ibase=sc.nextDouble();
            double ita=(1.0/4.0)*ibase*(Math.sqrt((4.0*iside*iside)-ibase*ibase));
            System.out.println("Area of Isosceles Triangle = "+ita);
            break;

            case 3:
            System.out.println("Enter 1st side of Scalene Triangle");
            double a=sc.nextDouble();
            System.out.println("Enter 2nd side of Scalene Triangle");
            double b=sc.nextDouble();
            System.out.println("Enter 3rd side of Scalene Triangle");
            double c=sc.nextDouble();
            double sp=(a+b+c)/2.0;
            double sta=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
            System.out.println("Area of Scalene Triangle = "+sta);
            break;
            
            default:
            System.out.println("Wrong Choise");
        }
    }
    void Rectangle()
    {
        System.out.println("For Rectangle : ");
        System.out.println("Enter Length");
        double length=sc.nextDouble();
        System.out.println("Enter Breadth");
        double breadth=sc.nextDouble();
        double ra=length*breadth;
        System.out.println("Area = "+ra);
    }
    void Square()
    {
        System.out.println("For Square : ");
        System.out.println("Enter Side");
        double side=sc.nextDouble();
        double sa=side*side;
        System.out.println("Area = "+sa);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Rectangle");
        System.out.println("4. Square");
        System.out.println("Enter your choise:");
        int ch=sc.nextInt();
        AREA ar=new AREA();
        switch(ch)
        {
            case 1:
            ar.Circle();
            break;
            case 2:
            ar.Triangle();
            break;
            case 3:
            ar.Rectangle();
            break;
            case 4:
            ar.Square();
            break;
            default:
            System.out.println("Wrong choise!!!");
        }
    }
}