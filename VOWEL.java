import java.util.Scanner;
class VOWEL
{
    public static void main(String args[])
    {
        System.out.println("It will tell you the Vowels and total no. of them used in a word\nor Sentence.");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Word");
        String st=s.nextLine().toLowerCase(),str="";
        int l,a=0,e=0,i=0,o=0,u=0;
        char c;
        for(l=0;l<st.length();l++)
        {
            c=st.charAt(l);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                if(c=='a')
                a++;
                if(c=='e')
                e++;
                if(c=='i')
                i++;
                if(c=='o')
                o++;
                if(c=='u')
                u++;
            }
            else
                str=str+c;
        }
        System.out.println("The Frequency of 'a' are : "+a);
        System.out.println("The Frequency of 'e' are : "+e);
        System.out.println("The Frequency of 'i' are : "+i);
        System.out.println("The Frequency of 'o' are : "+o);
        System.out.println("The Frequency of 'u' are : "+u);
        System.out.println("The Word without Vowels are : "+str);
    }
}