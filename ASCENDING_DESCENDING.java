import java.util.Scanner;
class ASCENDING_DESCENDING
{
    public static void main(String args[])
    {
        System.out.println("It will arrange the nos in their Ascending and Descending order");
        Scanner s=new Scanner(System.in);
        int i,j,min;
        int m[]=new int[10],t;
        System.out.println("Enter 10 nos");
        for(i=0;i<10;i++)
            m[i]=s.nextInt();
        for(i=0;i<10;i++)
        {
            min=i;
            for(j=i+1;j<10;j++)
            {
                if(m[j]<m[min])
                min=j;
            }
            t=m[i];
            m[i]=m[min];
            m[min]=t;
        }
        System.out.println("The nos in their Ascending order are :");
        for(i=0;i<10;i++)
        System.out.println(m[i]);
        System.out.println("The nos in their Descending order are :");
        for(i=9;i>=0;i--)
        System.out.println(m[i]);
    }
}