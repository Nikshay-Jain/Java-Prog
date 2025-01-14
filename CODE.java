import java.util.*;
class CODE
{
    public static void main(String args[])
    {
        System.out.println("It will Replace a Consonant with previous letter and if previous\nletter is a vowel then replace with the next one. Vowels would be\nunaffected.");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Few Words");
        String str=s.nextLine()+" ",str1="";
        char c,chr;
        for(int i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            str1=str1+c;
            if(c!='A'&&c!='E'&&c!='I'&&c!='O'&&c!='U'&&c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u')
            {
                chr=(char)(((int)c)-1);
                if(chr=='A'||chr=='E'||chr=='I'||chr=='O'||chr=='U'||chr=='a'||chr=='e'||chr=='i'||chr=='o'||chr=='u')
                chr=(char)(((int)c)+1);
                str1=str1+chr;
            }
            if(c==' ')
            str1=str1+" ";
        }
        System.out.println(str1);
    }
}