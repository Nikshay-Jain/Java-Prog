import java.util.*;
class CHARACTER_FUNCTIONS
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Choise to Check");
        System.out.println("1. If Character is a Letter ?");
        System.out.println("2. If Character is a Number ?");
        System.out.println("3. If Character is a Letter or a Number ?");
        System.out.println("4. If There is a Blank ?");
        System.out.println("5. If Character is in Uppercase and you want to Convert it to\n   Lowercase ?");
        System.out.println("6. If Character is in Lowercase and you want to Convert it to\n   Uppercase ?\n");
        System.out.println("Enter Your Choise");
        int a=s.nextInt();
        System.out.println("Now, Enter a Character");
        char c=s.next().charAt(0);
        switch(a)
        {
            case 1:
            if(Character.isLetter(c)==true)
            System.out.println("It is a Letter");
            else
            System.out.println("It is not a Letter");
            break;
            
            case 2:
            if(Character.isDigit(c)==true)
            System.out.println("It is a Number");
            else
            System.out.println("It is not a Number");
            break;
            
            case 3:
            if(Character.isLetterOrDigit(c)==true)
            System.out.println("It is a Letter or a Number");
            else
            System.out.println("It is not a Letter or a Number");
            break;
            
            case 4:
            if(Character.isWhitespace(c)==true)
            System.out.println("It is a Blank");
            else
            System.out.println("It is not a Blank");
            break;
            
            case 5:
            if(Character.isUpperCase(c)==true)
            {
            System.out.println("It is a Capital Letter");
            char b7=Character.toLowerCase(c);
            System.out.println("The letter is "+b7);
            }
            else
            System.out.println("It is not a Capital Letter");
            break;
            
            case 6:
            if(Character.isLowerCase(c)==true)
            {
            System.out.println("It is a Small letter");
            char b8=Character.toUpperCase(c);
            System.out.println("The letter is "+b8);
            }
            else
            System.out.println("It is not a Small Letter");
            break;
            default:
            System.out.println("Wrong Choise Entered");
        }
    }
}