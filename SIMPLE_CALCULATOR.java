import java.io.*;
class SIMPLE_CALCULATOR
{
    static void Nikshay()throws IOException
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter First Number: ");
        int x = Integer.parseInt(br.readLine());
        System.out.println("Enter Second Number: ");
        int y = Integer.parseInt(br.readLine());
        int s=x+y;
        int d=x-y;
        int p=x*y;
        double q=x/y;
        int r=x%y;
        System.out.println("The Results Are: ");
        System.out.println("sum= "+s);
        System.out.println("difference= "+d);
        System.out.println("product= "+p);
        System.out.println("quotient= "+q);
        System.out.println("remainder= "+r);
    }
}