import java.util.*;
class EQUABLE_TRIANGLE
{
    public static void main(String args[])
    {
        System.out.println("A Triangle is said to be Equable if its area = its perimeter");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 1st side of Triangle");
        double a=s.nextDouble();
        System.out.println("Enter 2nd side of Triangle");
        double b=s.nextDouble();
        System.out.println("Enter 3rd side of Triangle");
        double c=s.nextDouble();
        double sp=(a+b+c)/2;
        double area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
        System.out.println("The Area = "+area);
        double per=a+b+c;
        System.out.println("The Perimeter = "+per);
        if(area==per)
        System.out.println("The Triangle is Equable");
        else
        System.out.println("The Triangle is not Equable");
    }
}