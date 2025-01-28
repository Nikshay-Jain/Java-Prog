import java.util.*;
class UNIQUE_WORD
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("If no letter in a word is repeated, the word is said to be Unique.");
        System.out.println("Enter a word");
        String str=s.next();
        char ch;
        int t=0,i,j;
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            for(j=i+1;j<str.length();j++)
            if(ch==str.charAt(j))
            t=1;
        }
        if(t!=1)
        System.out.println("Unique String");
        else
        System.out.println("Not a unique String");
    }
}