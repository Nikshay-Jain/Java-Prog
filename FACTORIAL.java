import java.util.*;
class FACTORIAL
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Factorial is the multiplication of a number with the numbers\npreceding it");
        System.out.println("Enter a number");
        int n=s.nextInt();
        int f=1;
        while(n>1)
        {
            f=f*n;
            n--;
        }
        System.out.println("THE FACTORIAL OF THE ENTERED NUMBER "+" = "+f);
    }
}