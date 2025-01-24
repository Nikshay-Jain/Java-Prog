import java.util.*;
class REVERSE
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Few Words");
        String str=s.nextLine()+" ",str1="",st="",st1="";
        int i;
        for(i=0;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            str1=ch+str1;
        }
        System.out.println("Total sentence reversed:\n"+str1.trim());
        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                st1=st1+" "+st;
                st="";
            }
            else
            st=ch+st;
        }
        System.out.println("Each word of sentence reversed:\n"+st1.trim());
    }
}