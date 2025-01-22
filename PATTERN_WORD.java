import java.util.*;
class PATTERN_WORD
{
    char ch,ch1;
    int i,j,k,p;
    String str1="";
    PATTERN_WORD(String str)
    {
        for(i=str.length()-1;i>=0;i--)
        {
            ch1=str.charAt(i);
            str1+=ch1;
        }
    }
    void Total_Pattern(String str)
    {
        int m=str.length()-1;
        System.out.println("Total Pattern:");
        System.out.println("\nPattern 1\n");
        for(i=1;i<=str.length();i++)
        {
            ch=str.charAt(i-1);
            for(j=1;j<=m;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(ch+" ");
            System.out.println();
            m--;
        }
        m=1;
        for(i=str.length()-1;i>=1;i--)
        {
            ch=str.charAt(i-1);
            for(j=1;j<=m;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(ch+" ");
            System.out.println();
            m++;
        }
        m=str1.length()-1;
        System.out.println("\nPattern 2\n");
        for(i=1;i<=str1.length();i++)
        {
            ch=str1.charAt(i-1);
            for(j=1;j<=m;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(ch+" ");
            System.out.println();
            m--;
        }
        m=1;
        for(i=str1.length()-1;i>=1;i--)
        {
            ch=str1.charAt(i-1);
            for(j=1;j<=m;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(ch+" ");
            System.out.println();
            m++;
        }
    }
    void Upper_Pattern(String str)
    {
        int m=str.length()-1;
        System.out.println("Upper Pattern:");
        System.out.println("\nPattern 1\n");
        for(i=1;i<=str.length();i++)
        {
            ch=str.charAt(i-1);
            for(j=1;j<=m;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(ch+" ");
            System.out.println();
            m--;
        }
        m=str1.length()-1;
        System.out.println("\nPattern 2\n");
        for(i=1;i<=str1.length();i++)
        {
            ch=str1.charAt(i-1);
            for(j=1;j<=m;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(ch+" ");
            System.out.println();
            m--;
        }
    }
    void Lower_Pattern(String str)
    {
        int m=1;
        System.out.println("Lower Pattern:");
        System.out.println("\nPattern 1\n");
        for(i=str1.length();i>=1;i--)
        {
            ch=str1.charAt(i-1);
            for(j=1;j<=m;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(ch+" ");
            System.out.println();
            m++;
        }
        m=1;
        System.out.println("\nPattern 2\n");
        for(i=str.length();i>=1;i--)
        {
            ch=str.charAt(i-1);
            for(j=1;j<=m;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(ch+" ");
            System.out.println();
            m++;
        }
    }
    void Pattern_1(String str)
    {
        System.out.println("\nQuadrant 1:\n");
        System.out.println("\nPattern 1:\n");
        for(i=0;i<=str.length();i++)
        System.out.println(str.substring(0,i));
        System.out.println("\nPattern 2:\n");
        for(i=0;i<str.length();i++)
        {
            for(j=0;j<=i;j++)
            {
                ch=str.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println("\nPattern 3:\n");
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            for(j=0;j<=i;j++)
            System.out.print(ch);
            System.out.println();
        }
        System.out.println("\nPattern 4:\n");
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            for(j=0;j<=i;j++)
            System.out.print(ch+" ");
            System.out.println();
        }
        System.out.println("Pattern 5:\n");
        for(i=0;i<=str1.length();i++)
        System.out.println(str1.substring(0,i));
        System.out.println("\nPattern 6:\n");
        for(i=0;i<str1.length();i++)
        {
            for(j=0;j<=i;j++)
            {
                ch=str1.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println("\nPattern 7:\n");
        for(i=0;i<str1.length();i++)
        {
            ch=str1.charAt(i);
            for(j=0;j<=i;j++)
            System.out.print(ch);
            System.out.println();
        }
        System.out.println("\nPattern 8:\n");
        for(i=0;i<str1.length();i++)
        {
            ch=str1.charAt(i);
            for(j=0;j<=i;j++)
            System.out.print(ch+" ");
            System.out.println();
        }
    }
    /*void Pattern_2(String str)
    {
        System.out.println("Pattern 2:\n");
    }*/
    void Pattern_3(String str)
    {
        System.out.println("\nQuadrant 3:\n");
        System.out.println("\nPattern 1:\n");
        for(i=str.length();i>=0;i--)
        {
            for(p=1;p<=k;p++)
            System.out.print(" ");
            System.out.println(str.substring(0,i));
            k++;
        }
        k=0;
        System.out.println("\nPattern 2:\n");
        for(i=str1.length();i>=0;i--)
        {
            for(p=1;p<=k;p++)
            System.out.print(" ");
            System.out.println(str1.substring(0,i));
            k++;
        }
    }
    void Pattern_4(String str)
    {
        System.out.println("\nQuadrant 4:\n");
        System.out.println("\nPattern 1:\n");
        for(i=str.length();i>=0;i--)
        System.out.println(str.substring(0,i));
        System.out.println("\nPattern 2:\n");
        for(i=str.length()-1;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                ch=str.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        System.out.println("Pattern 3:\n");
        for(i=str1.length();i>=0;i--)
        System.out.println(str1.substring(0,i));
        System.out.println("\nPattern 4:\n");
        for(i=str1.length()-1;i>=0;i--)
        {
            for(j=0;j<=i;j++)
            {
                ch=str1.charAt(j);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("The Choices are: ");
        System.out.println("1. Total Pattern");
        System.out.println("2. Upper Pattern");
        System.out.println("3. Lower Pattern");
        System.out.println("4. 1st Quadrant");
        //System.out.println("5. 2nd Quadrant");
        System.out.println("6. 3rd Quadrant");
        System.out.println("7. 4th Quadrant");
        System.out.println("8. All Patterns");
        System.out.println("\nEnter your choice");
        int n=s.nextInt();
        System.out.println("Enter a word");
        String str=s.next();
        PATTERN_WORD ob=new PATTERN_WORD(str);
        switch(n)
        {
            case 1:
            ob.Total_Pattern(str);
            break;
            case 2:
            ob.Upper_Pattern(str);
            break;
            case 3:
            ob.Lower_Pattern(str);
            break;
            case 4:
            ob.Pattern_1(str);
            break;
            /*case 5:
            ob.Pattern_2(str);
            break;*/
            case 6:
            ob.Pattern_3(str);
            break;
            case 7:
            ob.Pattern_4(str);
            break;
            case 8:
            ob.Total_Pattern(str);
            ob.Upper_Pattern(str);
            ob.Lower_Pattern(str);
            ob.Pattern_1(str);
            //ob.Pattern_2(str);
            ob.Pattern_3(str);
            ob.Pattern_4(str);
            break;
            default:
            System.out.println("Wrong Choice!!!");
        }
    }
}