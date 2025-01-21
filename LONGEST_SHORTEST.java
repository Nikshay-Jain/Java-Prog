import java.util.*;
class LONGEST_SHORTEST
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("It will give you the longest and shaorest word of a sentence.");
        System.out.println("Enter a sentence");
        String str=s.nextLine()+"",str1="",maxw="",minw="";
        int maxl=0,minl=str.length(),i,l=0;
        char ch;
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch!=' ')
            str1+=ch;
            else
            {
                l=str1.length();
                if(l>maxl)
                {
                    maxl=l;
                    maxw=str1;
                }
                if(l<minl)
                {
                    minl=l;
                    minw=str1;
                }
                str1="";
            }
        }
        System.out.println("The longest word is: "+maxw+" with length: "+maxl);
        System.out.println("The shortest word is: "+minw+" with length: "+minl);
    }
}