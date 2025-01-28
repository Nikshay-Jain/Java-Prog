import java.util.*;
class VOLUME
{
    Scanner sc= new Scanner(System.in);
    void Sphere()
    {
        System.out.println("For Sphere : ");
        System.out.println("Enter Radius");
        double radius=sc.nextDouble();
        double ca=(4/3)*Math.PI*(radius*radius*radius);
        System.out.println("Volume = "+ca);
    }
    void Cone()
    {
        System.out.println("For Cone : ");
        System.out.println("Enter Base Radius");
        double base=sc.nextDouble();
        System.out.println("Enter Height");
        double height=sc.nextDouble();
        double ta=(1/3)*Math.PI*base*height;
        System.out.println("Volume = "+ta);
    }
    void Cuboid()
    {
        System.out.println("For Cuboid : ");
        System.out.println("Enter Length");
        double length=sc.nextDouble();
        System.out.println("Enter Breadth");
        double breadth=sc.nextDouble();
        System.out.println("Enter Height");
        double height=sc.nextDouble();
        double ra=length*breadth*height;
        System.out.println("Volume = "+ra);
    }
    void Cube()
    {
        System.out.println("For Cube : ");
        System.out.println("Enter Side");
        double side=sc.nextDouble();
        double sa=side*side*side;
        System.out.println("Volume = "+sa);
    }
    void Cylinder()
    {
        System.out.println("For Cylinder : ");
        System.out.println("Enter Base Radius");
        double base=sc.nextDouble();
        System.out.println("Enter Height");
        double height=sc.nextDouble();
        double cya=Math.PI*base*height;
        System.out.println("Volume = "+cya);
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        VOLUME v=new VOLUME();
        System.out.println("1. Sphere");
        System.out.println("2. Cone");
        System.out.println("3. Cuboid");
        System.out.println("4. Cube");
        System.out.println("5. Cylinder");
        System.out.println("Enter your Choise");
        int c=sc.nextInt();
        switch(c)
        {
            case 1:
            v.Sphere();
            break;
            case 2:
            v.Cone();
            break;
            case 3:
            v.Cuboid();
            break;
            case 4:
            v.Cube();
            break;
            case 5:
            v.Cylinder();
            break;
        }
    }
}