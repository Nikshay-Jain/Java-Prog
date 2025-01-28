import java.util.*;
class VERTICAL_WORDS
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a Word or Sentence ending with (.)");
        String str;
        int a=0;
        while(true)
        {
            str=s.next();
            System.out.println(str);
            if(str.equals("."))
            break;
        }
    }
}