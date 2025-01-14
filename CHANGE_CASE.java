import java.util.*;
class CHANGE_CASE
{
    public static void main(String args[])
    {
        System.out.println("It will return the words after Changing the Case");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Some Words");
        String str=s.nextLine(),str1="";
        char ch,ch1;
        int i=0,n=0;
        while(i<str.length()&&n<str.length())
        {
            ch=str.charAt(n);
            if(Character.isLetterOrDigit(ch)==false)
            {
                str1+=" ";
                n++;
                continue;
            }
            else
            {
                if(i%2==0)
                {
                    ch1=Character.toUpperCase(ch);
                    str1+=ch1;
                    n++;
                }
                else
                {
                    ch1=Character.toLowerCase(ch);
                    str1+=ch1;
                    n++;
                }
            }
            i++;
        }
        System.out.println("The new Words are: \n"+str1);
    }
}