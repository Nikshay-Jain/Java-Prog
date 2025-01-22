import java.util.*;
class PIG_LATIN_FORM
{
    public static void main(String args[])
    {
        System.out.println("It will give you the word by placing the word after the Vowel in\nbeginning, then the rest of the word followed by 'ay' at last");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Word");
        String str=s.nextLine(),str1,str2;
        int i;
        for(i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            break;
        }
        str1=str.substring(i,str.length());
        str2=str.substring(0,i);
        System.out.println(str1+str2+"ay");
    }
}