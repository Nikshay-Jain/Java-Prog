import java.util.*;
class SIMILIAR_TRIANGLE
{
    public static void main(String args[])
    {
        System.out.println("Two Triangle are said to be Similiar if their ratio of Corresponding\nsides are equal");
        Scanner s=new Scanner(System.in);
        System.out.println("For 1st Triangle");
        System.out.println("Enter 1st side of Triangle");
        double a=s.nextDouble();
        System.out.println("Enter 2nd side of Triangle");
        double b=s.nextDouble();
        System.out.println("Enter 3rd side of Triangle");
        double c=s.nextDouble();
        System.out.println("For 2nd Triangle");
        System.out.println("Enter 1st side of Triangle");
        double a1=s.nextDouble();
        System.out.println("Enter 2nd side of Triangle");
        double b1=s.nextDouble();
        System.out.println("Enter 3rd side of Triangle");
        double c1=s.nextDouble();
        double a2=a/a1;
        double b2=b/b1;
        double c2=c/c1;
        if(a+b>c&&b+c>a&&a+c>b)
        {
            if(a2==b2||b2==c2||a2==c2)
            {
                System.out.println("The 2 Triangles are Similiar");
            }
            else
            System.out.println("The 2 Triangles are not Similiar");
        }
        else
        System.out.println("The triangles are not possible");
    }
}