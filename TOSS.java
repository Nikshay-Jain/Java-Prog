import java.util.*;
class TOSS
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("How many times do you want to toss?");
        int n=s.nextInt(),i;
        int h=0,t=0,c;
        for(i=1;i<=n;i++)
        {
            c=(int)(Math.random()*2);
        if(c==1)
        {
            System.out.println("Head");
            h++;
        }
        else if(c==0)
        {
            System.out.println("Tail");
            t++;
        }
        }
        if(h>t)
            System.out.println("Head is the winner with score: "+h);
        else if(h<t)
            System.out.println("Tail is the winner with score: "+t);
        else
            System.out.println("Both Head and Tail are winners with score: "+h);
    }
}