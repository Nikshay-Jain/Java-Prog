import java.util.*;
class COMBINATIONS
{
    public static void main(String args[])
    {
        System.out.println("It will give you all the possible Combinations of a Word");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a 3 letter Word");
        String str=s.nextLine();
        char c;
        int i,j,k;
        for(i=0;i<str.length();i++)
        {
            for(j=0;j<str.length();j++)
            {
                for(k=0;k<str.length();k++)
                {
                    if(i!=j&&j!=k&&k!=i)
                    {
                        System.out.print(str.charAt(i)+""+str.charAt(j)+""+str.charAt(k));
                    }
                }
                System.out.println();
            }
        }
    }
}