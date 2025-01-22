import java.util.*;
class PATTERN
{
    int i,j,p,k;
    void PATTERN_1(int l)
    {
        System.out.println("\nQuadrant 1:\n");
        System.out.println("Pattern 1:\n");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        System.out.println("\nPattern 2:\n");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print(i+" ");
            System.out.println();
        }
        System.out.println("\nPattern 3:\n");
        for(i=l;i>=1;i--)
        {
            for(j=l;j>=i;j--)
            System.out.print(i+" ");
            System.out.println();
        }
        System.out.println("\nPattern 4:\n");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        System.out.println("\nPattern l:\n");
        for(i=l;i>=1;i--)
        {
            for(j=l;j>=i;j--)
            System.out.print(j+" ");
            System.out.println();
        }
        System.out.println("\nPattern 6:\n");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=i;j++)
            {
                p=p+1;
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
    void PATTERN_2(int l)
    {
        System.out.println("\nQuadrant 2:\n");
        p=0;
        System.out.println("Pattern 1:\n");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=l;j++)
            {
                if(j>=(l+1)-i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\nPattern 2:\n");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=l;j++)
            {
                if(j>=(l+1)-i)
                System.out.print(i);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\nPattern 3:\n");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=l;j++)
            {
                if(j>=(l+1)-i)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("\nPattern 4:\n");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=l;j++)
            {
                if(j>=(l+1)-i)
                {
                    p=p+1;
                    System.out.print(p);
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void PATTERN_3(int l)
    {
        System.out.println("\nQuadrant 3:\n");
        p=1;
        System.out.println("Pattern 1:\n");
        for(i=l;i>=1;i--)
        {
            for(k=1;k<=p;k++)
            System.out.print(" ");
            for(j=i;j>=1;j--)
            System.out.print("*");
            System.out.println();
            p=p+1;
        }
        System.out.println("\nPattern 2:\n");
        p=1;
        for(i=l;i>=1;i--)
        {
            for(k=1;k<=p;k++)
            System.out.print(" ");
            for(j=i;j>=1;j--)
            System.out.print(p);
            System.out.println();
            p=p+1;
        }
        System.out.println("\nPattern 3:\n");
        p=1;
        for(i=l;i>=1;i--)
        {
            for(k=1;k<=p;k++)
            System.out.print(" ");
            for(j=i;j>=1;j--)
            System.out.print(i);
            System.out.println();
            p=p+1;
        }
        System.out.println("\nPattern 4:\n");
        p=1;
        for(i=l;i>=1;i--)
        {
            for(k=1;k<=p;k++)
            System.out.print(" ");
            for(j=i;j>=1;j--)
            System.out.print(j);
            System.out.println();
            p=p+1;
        }
    }
    void PATTERN_4(int l)
    {
        System.out.println("\nQuadrant 4:\n");
        System.out.println("Pattern 1:\n");
        for(i=l;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            System.out.print("* ");
            System.out.println();
        }
        System.out.println("\nPattern 2:\n");
        for(i=l;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            System.out.print(i+" ");
            System.out.println();
        }
        System.out.println("\nPattern 3:\n");
        for(i=l;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            System.out.print(j+" ");
            System.out.println();
        }
        System.out.println("\nPattern 4:\n");
        p=0;
        for(i=l;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                p=p+1;
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
    void PATTERN_LOWER(int l)
    {
        System.out.println("\nLower Quadrant:\n");
        p=1;
        System.out.println("Pattern 1\n");
        for(i=l;i>0;i--)
        {
            for(k=1;k<=p;k++)
            System.out.print(" ");
            for(j=i;j>0;j--)
            {
                System.out.print(p);
                System.out.print(" ");
            }
            System.out.println();
            p=p+1;
        }
        System.out.println("\nPattern 2\n");
        p=1;
        for(i=l;i>=1;i--)
        {
            for(k=1;k<=p;k++)
            System.out.print(" ");
            for(j=i;j>=1;j--)
            {
            System.out.print(i);
            System.out.print(" ");
            }
            System.out.println();
            p=p+1;
        }
        System.out.println("\nPattern 3\n");
        p=1;
        for(i=l;i>=1;i--)
        {
            for(k=1;k<=p;k++)
            System.out.print(" ");
            for(j=i;j>=1;j--)
            {
            System.out.print(j);
            System.out.print(" ");
            }
            System.out.println();
            p=p+1;
        }
    }
    void TOTAL_PATTERN(int l)
    {
        System.out.println("\nAll Quadrant:\n");
        int m=l;
        System.out.println("\nPattern 1\n");
        for(i=1;i<=l;i++)
        {
            for(j=1;j<=m;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(i+" ");
            System.out.println();
            m--;
        }
        m=2;
        for(i=l-1;i>=1;i--)
        {
            for(j=1;j<=m;j++)
            System.out.print(" ");
            for(k=1;k<=i;k++)
            System.out.print(i+" ");
            System.out.println();
            m++;
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("It will give you variations of Triangular Patterns");
        System.out.println("Enter the no till which you want the Pattern");
        int l=s.nextInt();
        PATTERN ob=new PATTERN();
        ob.PATTERN_1(l);
        ob.PATTERN_2(l);
        ob.PATTERN_3(l);
        ob.PATTERN_4(l);
        ob.PATTERN_LOWER(l);
        ob.TOTAL_PATTERN(l);
    }
}