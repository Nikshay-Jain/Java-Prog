import java.util.*;
class ALPHABETICAL_ORDER
{
    public static void main(String args[])
    {
        System.out.println("It will Arrange the Letters of a Word in Alphabetical Order");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Word");
        String str=s.nextLine();
        for(int i=65;i<=90;i++)
        {
            for(int j=0;j<str.length();j++)
            {
                char ch=str.charAt(j);
                if(ch==(char)i||ch==(char)i+32)
                {
                    System.out.print(ch);
                }
            }
        }
    }
}