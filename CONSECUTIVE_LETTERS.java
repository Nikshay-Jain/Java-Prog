import java.util.*;
class CONSECUTIVE_LETTERS
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("It will give you the words which have Consecutive Letters. Eg. Modem");
        System.out.println("Enter a sentence");
        String str="";
        char ch,ch1;
        int i;
        while(str!=".")
        {
            str=s.next();
            for(i=0;i<str.length()-1;i++)
            {
                ch=str.charAt(i);
                ch1=str.charAt(i+1);
                if((int)ch+1==(int)ch1)
                System.out.println(str);
            }
            if(str.equals("."))
            break;
        }
    }
}
