import java.util.*;
class REPEAT
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("It will count the number of times, a word is repeated");
        System.out.println("Enter the word that you want to count");
        String str1=s.next();
        int n=0;
        System.out.println("Enter a sentence ending with a (.).Only 1 word in one line");
        while(true)
        {
            String str=s.nextLine();
            if(str.equals(str1))
            n++;
            if(str.equals("."))
            break;
        }
        System.out.println("The word "+str1+" is repeated "+n+" number of times");
    }
}