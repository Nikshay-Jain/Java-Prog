import java.util.*;
class FREQUENCY
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("It will tell you the frequency of each Character in a sentence.");
        System.out.println("Enter a Sentence");
        String str=s.nextLine();
        str=str.toUpperCase();
        int t=0;
        char ch;
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<str.length();j++)
            {
                ch=str.charAt(j);
                if(ch==(char)i)
                t++;
            }
            if(t>0)
            System.out.println("The Frequency of "+(char)i+" is "+t);
            t=0;
        }
    }
}