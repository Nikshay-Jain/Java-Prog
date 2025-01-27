import java.util.*;
class TYPES_OF_CHARACTERS
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter few Words");
        String str=s.nextLine();
        int i=str.length();
        int a,uc=0,lc=0,sc=0,d=0;
        char c;
        for(a=0;a<i;a++)
        {
            c=str.charAt(a);
            if(Character.isUpperCase(c)==true)
            {
                uc=uc+1;
            }
            if(Character.isLowerCase(c)==true)
            {
                lc=lc+1;
            }
            if(Character.isDigit(c)==true)
            {
                d=d+1;
            }
            else
            {
                sc=sc+1;
            }
        }
        System.out.println("The Number of Uppercase Characters : "+uc);
        System.out.println("The Number of Lowercase Characters : "+lc);
        System.out.println("The Number of Digits : "+d);
        System.out.println("The Number of Special Characters : "+sc);
    }
}