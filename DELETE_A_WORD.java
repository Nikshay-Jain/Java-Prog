import java.util.*;
class DELETE_A_WORD
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word to Delete");
        String str2=s.nextLine(),str3="";
        System.out.println("Enter Some Words one by one and to terminate, press (.)");
        while(true)
        {
            String str=s.next();
            if(str.equals(str2))
            continue;
            if(str.equals("."))
            break;
            str3=str3+" "+str;
        }
        System.out.println(str3);
    }
}