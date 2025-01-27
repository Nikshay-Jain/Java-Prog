import java.util.*;
class TRIANGLE_SIDES_ANGLES
{
    public static void main(String args[])
    {
        System.out.println("It will tell you if a triangle of entered sides is possible or not");
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 1st side of a Triangle");
        double a=s.nextDouble();
        System.out.println("Enter 2nd side of a Triangle");
        double b=s.nextDouble();
        System.out.println("Enter 3rd side of a Triangle");
        double c=s.nextDouble();
        System.out.println("Enter 1st angle of a Triangle");
        double aa=s.nextDouble();
        System.out.println("Enter 2nd angle of a Triangle");
        double ab=s.nextDouble();
        System.out.println("Enter 3rd angle of a Triangle");
        double ac=s.nextDouble();
        if((a+b>c&&b+c>a&&a+c>b)&&(aa+ab+ac==180))
        {
            System.out.println("Triangle is possible");
            if(a==b&&b==c&&a==c)
            System.out.println("Triangle is Equilateral");
            if(a==b||b==c||c==a)
            System.out.println("Triangle is Isosceles");
            if(a!=b&&b!=c&&c!=a)
            System.out.println("Triangle is Scalene");
            if(aa<90&&ab<90&&ac<90)
            System.out.println("Triangle is Acute-Angled");
            if(aa>90||ab>90||ac>90)
            System.out.println("Triangle is Obtuse-Angled");
            if(aa==90||ab==90||ac==90)
            System.out.println("Triangle is Right Angled");
        }
        else
        System.out.println("Triangle is not possible");
    }
}