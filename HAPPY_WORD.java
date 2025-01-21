import java.util.*;
class HAPPY_WORD
{
    public static void main(String args[])
    {
        System.out.println("A Word whose letters are made numbers according to alphbetical\nseries as A=1, B=2..., Z=26 and their sum of square of all nos if\nhappen to be 1, the word is a Happy Word.");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a word in Uppercase");
        String str=s.next(),str1="";
        int i,no,h,d,sum=0;
        char ch;
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            no=(int) ch;
            h=no-64;
            str1=str1+h;
        }
        int n=Integer.parseInt(str1);
        int p=n;
        sum=n;
        do
        {
            n=sum;sum=0;
            do
            {
                d=n%10;
                sum=sum+d*d;
                n=n/10;
            }
            while(n>0);
        }
        while(sum>9);
        if(sum==1)
        System.out.println("It is a Happy Word");
        else
        System.out.println("It is not a Happy Word");
    }
}