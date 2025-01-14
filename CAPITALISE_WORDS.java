import java.util.*;
class CAPITALISE_WORDS
{
    public static void main(String args[])
    {
        System.out.println("It will Capitalise the Initials of a Sentence.");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Word");
        String str=" "+s.nextLine(), str1="";
        char ch1=' ';
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                ch1=str.charAt(i+1);
                str1=str1+" "+Character.toUpperCase(ch1);
                i=i+1;
            }
            else
            str1=str1+ch;
        }
        System.out.println(str1);
    }
}