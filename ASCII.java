import java.util.*;
class ASCII
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("1.You want to Convert Character into its ASCII value");
        System.out.println("2.You want to Convert ASCII value to Character");
        System.out.println("3.You want to Convert each Character of Word into its ASCII value");
        System.out.println("4.You want to Convert each Character of Word into its Alphabet\nno. value");
        System.out.println("Enter your choise");
        int c=s.nextInt();
        switch(c)
        {
            case 1:
            System.out.println("Enter the Character which is to be Converted to ASCII value");
            char a=s.next().charAt(0);
            System.out.println("The Ascii value for it is : "+(int)a);
            break;
            case 2:
            System.out.println("Enter the ASCII value which is to be Converted to Character");
            int as=s.nextInt();
            System.out.println("The Character for it is : "+(char)as);
            break;
            case 3:
            System.out.println("Enter the Word which is to be Converted to ASCII value");
            String asc=s.next();
            char ch=' ';
            for(int i=0;i<asc.length();i++)
            {
            ch=asc.charAt(i);
            System.out.println("The Ascii value for "+ch+" is : "+(int)ch);
            }
            break;
            case 4:
            System.out.println("Enter a word in Uppercase");
            String str=s.next();
            for(int i=0;i<str.length();i++)
            {
            char chr=str.charAt(i);
            int ch2=((int)chr)-64;
            System.out.println(chr+" = "+ch2);
            }
        }
    }
}