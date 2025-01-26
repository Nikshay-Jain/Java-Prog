import java.util.*;
class SECTION_MIDPOINT_DISTANCE_FORMULA
{
    void SECTION_FORMULA(double x1,double y1,double x2,double y2,double m,double n)
    {
        double x3=((m*x2)+(n*x1))/(m+n);
        double y3=((m*y2)+(n*y1))/(m+n);
        System.out.println("The Coordinates of Point of Division are = ("+x3+","+y3+")");
    }
    void MIDPOINT_FORMULA(double mx1,double my1,double mx2,double my2)
    {
        double mx3=(mx1+mx2)/2;
        double my3=(my1+my2)/2;
        System.out.println("The Coordinates of MidPoint = ("+mx3+","+my3+")");
    }
    void DISTANCE_FORMULA(double x1,double y1,double x2,double y2)
    {
        double d=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("The distance between the given points is: "+d+" units");
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 'x' Coordinate of First Point");
        double x1=s.nextDouble();
        System.out.println("Enter 'y' Coordinate of First Point");
        double y1=s.nextDouble();
        System.out.println("Enter 'x' Coordinate of Second Point");
        double x2=s.nextDouble();
        System.out.println("Enter 'y' Coordinate of Second Point");
        double y2=s.nextDouble();
        System.out.println("Enter the 'm' of Ratio of Division");
        double m=s.nextDouble();
        System.out.println("Enter the 'n' of Ratio of Division");
        double n=s.nextDouble();
        double mx1=x1,my1=y1,mx2=x2,my2=y2;
        SECTION_MIDPOINT_DISTANCE_FORMULA ob=new SECTION_MIDPOINT_DISTANCE_FORMULA();
        ob.SECTION_FORMULA(x1,y1,x2,y2,m,n);
        ob.MIDPOINT_FORMULA(mx1,my1,mx2,my2);
        ob.DISTANCE_FORMULA(x1,y1,x2,y2);
    }
}