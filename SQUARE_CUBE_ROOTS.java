import java.util.*;
class SQUARE_CUBE_ROOTS
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("It will give you the Square, Cube, Square Root, Cube Root of a no.");
        System.out.println("Enter a number");
        int n=s.nextInt();
        System.out.println("Square of "+n+" is "+n*n);
        System.out.println("Square Root of "+n+" is "+Math.sqrt(n));
        System.out.println("Cube of "+n+" is "+n*n*n);
        System.out.println("Cube Root of "+n+" is "+Math.cbrt(n));
    }
}