import java.util.Scanner;
class Delta
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
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
	}
}