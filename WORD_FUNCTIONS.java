import java.util.Scanner;
class WORD_FUNCTIONS
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your choice to Check");
        System.out.println("1. The Length of the Word ?");
        System.out.println("2. Get a letter from the Word ?");
        System.out.println("3. To get the position (starting from 0) of a letter  ?");
        System.out.println("4. To get the position of the Last Occurrence of a letter  ?");
        System.out.println("5. To get only a Part of a Word after a Certain letter's position ?");
        System.out.println("6. To Convert a Word to Uppercase ?");
        System.out.println("7. To Convert a Word to Lowercase ?");
        System.out.println("8. To Replace a Certain Letter with Another?");
        System.out.println("9. To Join Two Words ?");
        System.out.println("10. If 2 Words are same (Including Case) ?");
        System.out.println("11. If 2 Words are same (Without Including Case) ?");
        System.out.println("12. If a Word comes before or after another Word according to\n    Ascending or Decending Order or is same as previous Word ?");
        System.out.println("13. To remove all the Blanks before and after a Word ?");
        System.out.println("14. If a Sentence or a Word Starts with a Word or a Letter ?");
        System.out.println("15. If a Sentence or a Word Ends with a Word or a Letter ?\n");
        System.out.println("Enter Your choice");
        int a=s.nextInt();
        switch(a)
        {
            case 1:
            System.out.println("1. Normally");
            System.out.println("2. After a Removing all the Vowels");
            System.out.println("Please Enter Your choice :");
            int eyc2=s.nextInt();
            switch(eyc2)
            {
                case 2:
                System.out.println("Now, Enter a Word");
                String w2=s.next();
                int n=0;
                char c=' ';
                for(int i=0;i<w2.length();i++)
                {
                c=w2.charAt(i);
                if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                continue;
                else
                n=n+1;
                }
                System.out.println("The Length of the Word without Vowels is "+n);
                break;
                case 1:
                System.out.println("Now, Enter a Word");
                String w1=s.next();
                int l=w1.length();
                System.out.println("The Length of the Word is "+l);
                break;
            }
            break;
            case 2:
            System.out.println("Now, Enter a Word");
            String w2=s.next();
            System.out.println("Enter the Position Number");
            int pn=s.nextInt();
            char c2=w2.charAt(pn);
            System.out.println("The Letter of the Word is "+c2);
            break;
            
            case 3:
            System.out.println("1. Normally");
            System.out.println("2. After a certain Position Number");
            System.out.println("Please Enter Your choice :");
            int eyc3=s.nextInt();
            switch(eyc3)
            {
                case 1:
                System.out.println("Now, Enter a Word");
                String w3=s.next();
                System.out.println("Enter the Letter of the Word");
                char c3=s.next().charAt(0);
                int pn3=w3.indexOf(c3);
                System.out.println("The Position Number of the Letter is "+pn3);
                break;
                
                case 2:
                System.out.println("Now, Enter a Word");
                String w32=s.next();
                System.out.println("Enter the Position Number after which you want to Start the Search");
                int pna3=s.nextInt();
                System.out.println("Enter the Letter of the Word");
                char c32=s.next().charAt(0);
                int pn32=w32.indexOf(c32,pna3);
                System.out.println("The Position Number of the Letter is "+pn32);
                break;
                default:
                System.out.println("Wrong choice");
            }
            break;
            
            case 4:
            System.out.println("Now, Enter a Word");
            String w4=s.next();
            System.out.println("Enter the Letter of the Word");
            char c4=s.next().charAt(0);
            int pn4=w4.lastIndexOf(c4);
            System.out.println("The Position Number of the Letter is "+pn4);
            break;
            
            case 5:
            System.out.println("1. Normally");
            System.out.println("2. From a certain, To a certain Position Number");
            System.out.println("Please Enter Your choice :");
            int eyc5=s.nextInt();
            switch(eyc5)
            {
                case 1:
                System.out.println("Now, Enter a Word");
                String w5=s.next();
                System.out.println("Enter the Position Number from which you want the part of the Word");
                int pn5=s.nextInt();
                String ss5=w5.substring(pn5);
                System.out.println("The Part of the Word is "+ss5);
                break;
                
                case 2:
                System.out.println("Now, Enter a Word");
                String w52=s.next();
                System.out.println("Enter the Position Number from which you want the Word");
                int pn52=s.nextInt();
                System.out.println("Enter the Position Number till which you want the Word");
                int pn522=s.nextInt();
                String ss52=w52.substring(pn52,pn522);
                System.out.println("The Part of the Word is "+ss52);
                break;
                default:
                System.out.println("Wrong choice");
            }
            break;
            
            case 6:
            System.out.println("Now, Enter a Word");
            String w6=s.next();
            String lc6=w6.toLowerCase();
            System.out.println("The Word is "+lc6);
            break;
            
            case 7:
            System.out.println("Now, Enter a Word");
            String w7=s.next();
            String uc7=w7.toUpperCase();
            System.out.println("The Word is "+uc7);
            break;
            
            case 8:
            System.out.println("Now, Enter a Word");
            String w81=s.next();
            System.out.println("Enter the letter you want to Replace");
            char c81=s.next().charAt(0);
            System.out.println("Enter the letter with which you want to Replace");
            char c82=s.next().charAt(0);
            String w82=w81.replace(c81,c82);
            System.out.println("The Word is "+w82);
            break;
            
            case 9:
            System.out.println("1. Join 2 Words");
            System.out.println("2. Join more than 2 Words");
            System.out.println("Please Enter Your choice :");
            int eyc9=s.nextInt();
            switch(eyc9)
            {
                case 1:
                System.out.println("Enter a Word");
                String w91=s.next();
                System.out.println("Enter another Word");
                String w92=s.next();
                String w93=w91.concat(w92);
                System.out.println("The Joined Word is "+w93);
                break;
                
                case 2:
                System.out.println("How many Words do you want to Enter ?");
                int n=s.nextInt();
                int i9;
                String w922="";
                for(i9=1;i9<=n;i9++)
                {
                    System.out.println("Enter a Word");
                    String w912=s.next();
                    w922=w922+w912;
                }
                System.out.println("The Joined Words are "+w922);
                break;
            }
            break;
            
            case 10:
            System.out.println("Enter a Word");
            String w101=s.next();
            System.out.println("Enter another Word");
            String w102=s.next();
            if(w101.equals(w102))
            System.out.println("The 2 Words are Exactly the Same");
            else
            System.out.println("The 2 Words are Different");
            break;
            
            case 11:
            System.out.println("Enter a Word");
            String w111=s.next();
            System.out.println("Enter another Word");
            String w112=s.next();
            if(w111.equalsIgnoreCase(w112))
            System.out.println("The 2 Words are the Same");
            else
            System.out.println("The 2 Words are Different");
            break;
            
            case 12:
            System.out.println("Enter a Word");
            String w121=s.next();
            System.out.println("Enter another Word");
            String w122=s.next();
            int n=w121.compareTo(w122);
            if(n==0)
            System.out.println("Both Words are Same");
            if(n>0)
            System.out.println("1st Word is Greater");
            if(n<0)
            System.out.println("2nd Word is Greater");
            break;
            
            case 13:
            System.out.println("Enter a Word");
            String w13=s.next();
            String t=w13.trim();
            System.out.println("The Word after Tuncation is "+w13);
            break;
            
            case 14:
            System.out.println("Enter a Word");
            String w141=s.next();
            System.out.println("Enter a Part of the Word");
            String w142=s.next();
            if(w141.startsWith(w142)==true)
            System.out.println("Yes, the 1st Word Starts with the 2nd Word");
            else
            System.out.println("No, the 1st Word does not starts with the 2nd Word");
            break;
            case 15:
            System.out.println("Enter a Word");
            String w151=s.next();
            System.out.println("Enter a Part of the Word");
            String w152=s.next();
            if(w151.endsWith(w152)==true)
            System.out.println("Yes, the 1st Word Ends with the 2nd Word");
            else
            System.out.println("No, the 1st Word does not ends with the 2nd Word");
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}