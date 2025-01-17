import java.util.Scanner;
class Epsilon_Delta
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Dimention for Kroneckar Delta Function");
        int n=s.nextInt();
        int e[][][]=new int[3][3][3],i,j,k;
        int d[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                d[i][j]=1;
                else
                d[i][j]=0;
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(d[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                {
                    if(i==j||j==k||k==i)
                    e[i][j][k]=0;
                }
            }
        }
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                for(k=0;k<3;k++)
                System.out.print(e[i][j][k]);
                System.out.println();
            }
            System.out.println();
        }
        int arr[]={0,1,2,3,4,5};
        i=7;
        for(int b=5;b>2;b-=2)
        {
            System.out.println(arr[--b]);
            System.out.println(--i*7);
        }
    }
}