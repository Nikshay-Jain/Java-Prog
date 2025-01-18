import java.util.*;
class GUESS_HOW_MANY
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Two players have to guess how many times '|' is shown on the screen,\nwho so ever will give a more accurate answer, will be the winner.\nIts best of 3. LETS START!!!");
        System.out.println("Enter name of 1st player");
        String player1=s.next();
        System.out.println("Enter name of 2nd player");
        String player2=s.next();
        int s1=0,s2=0,i;
        for(i=1;i<=3;i++)
        {
        int r=(int)((Math.random())*10000),j;
        for(j=1;j<=r;j++)
        System.out.print("|");
        System.out.println("/n"+player1+", enter your answer");
        int pl1=s.nextInt();
        System.out.println(player2+", enter your answer");
        int pl2=s.nextInt();
        int a1=Math.abs(r-pl1);
        int a2=Math.abs(r-pl2);
        if(a1<a2)
        {
            s1++;
            System.out.println("Congratulation "+player1+"!!! You are the winner!!!");
        }
        else if(a2<a1)
        {
            s2++;
            System.out.println("Congratulation "+player2+"!!! You are the winner!!!");
        }
        else
        {
            s1++;
            s2++;
            System.out.println("Oh, "+player1+" and "+player2+"!!! Both of you gave the same answer!!!");
        }
        System.out.println("The correct answer was: "+r+"\n\n\n\n\n");
        }
        if(s1>s2)
        System.out.println("Congratulation "+player1+"!!! You are the final winner!!!");
        else if(s2>s1)
        System.out.println("Congratulation "+player2+"!!! You are the final winner!!!");
        else
        System.out.println("Congratulation "+player1+" and "+player2+"!!! Both of you are the final winners!!!");
    }
}