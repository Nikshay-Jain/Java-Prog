import java.util.*;
class REPEATED_LETTERS
{
    public static void main(String args[])
    {
        System.out.println("It will give the word/sentence after removing the Repeated Letters");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter few words");
        String str=s.nextLine()+" ", str1="";
        char ch;
        int t=0;
        for(int i=0;i<str.length()-1;i++)
        {
            ch=str.charAt(i);
            if(ch!=str.charAt(i+1))
            str1+=ch;
        }
        System.out.println("Sentence after removing the repeated letters is: \n"+str1);
    }
}