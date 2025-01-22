import java.util.*;
class PALINDROME_WORD
{
    public static void main(String args[])
    {
        System.out.println("A Word is said to be Palindrome if the new Word obtained after\nreversing the letters, is same as the original one.");
        System.out.println();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Word");
        String str=s.next(),str1="";
        for(int i=str.length()-1;i>=0;i--)
        {
            char ch=str.charAt(i);
            str1=str1+ch;
        }
        if(str.equals(str1))
        System.out.println("It is a Palindrome Word");
        else
        {
            System.out.println("It is not a Palindrome Word");
            System.out.println(str+str1+" is a Palindrome Word");
        }
    }
}