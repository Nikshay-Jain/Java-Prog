import java.util.Scanner;
class TYPES_OF_NUMBERS
{
    int d,sum,x,i,t=0,k;
    void Special_Number(int n)
    {
        int f=1;
        sum=0;
        x=n;
        for(i=1;i<=n;i++)
        f*=i;
        while(f!=0)
        {
            d=f%10;
            sum+=d;
            f/=10;
        }
        if(sum==x)
        System.out.println("It is a Special number");
        else
        System.out.println("It is not a Special number");
    }
    void Neon_Number(int n)
    {
        x=n;
        while(n!=0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        }
        if(x==sum)
        System.out.println("It is a Neon number");
        else
        System.out.println("It is not a Neon number");
    }
    void Duck_Number(int n)
    {
        if(n==0)
            System.out.println("It is a Duck number.");
        else
        {
            while(n>0)
            {
                d=n%10;
                if(d==0)
                {
                    t=1;
                    break;
                }
                n=n/10;
            }
            if(t==1)
            System.out.println("It is a Duck number.");
            else
            System.out.println("It is not a Duck number.");
        }
    }
    void Niven_Number(int n)
    {
        x=n;
        while(n!=0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        }
        if(x%sum==0)
        System.out.println("It is a Niven number");
        else
        System.out.println("It is not a Niven number");
    }
    void Disarium_Number(int n)
    {
        x=n;
        k=n;
        while(n!=0)
        {
            n/=10;
            t++;
        }
        for(i=t;i>=1;i--)
        {
            d=k%10;
            sum+=Math.pow(d,i);
            k/=10;
        }
        if(sum==x)
        System.out.println("It is a Disarium number");
        else
        System.out.println("It is not a Disarium number");
    }
    void Armstrong_Number(int n)
    {
        x=n;
        while(n!=0)
        {
            d=n%10;
            sum+=d*d*d;
            n/=10;
        }
        if(x==sum)
        System.out.println("It is an Armstrong number");
        else
        System.out.println("It is not an Armstrong number");
    }
    void Palindrome_Number(int n)
    {
        x=n;
        while(n!=0)
        {
            d=n%10;
            sum=sum*10+d;
            n/=10;
        }
        if(x==sum)
        System.out.println("It is a Palindrome number.");
        else
        System.out.println("It is not a Palindrome number.");
    }
    void Buzz_Number(int n)
    {
        if(n%10==7||n%7==0)
        System.out.println("It is a Buzz number.");
        else
        System.out.println("It is not a Buzz number.");
    }
    void Automorphic_Number(int n)
    {
        k=n*n;
        while(k>0)
        {
            d=k%10;
            t++;
            k/=10;
        }
        if((n*n)%Math.pow(10,(t-1))==n)
        System.out.println("It is an Automorphic number.");
        else
        System.out.println("It is not an Automorphic number.");
    }
    void Perfect_Number(int n)
    {
        x=n;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            t+=i;
        }
        if(t==x)
        System.out.println("It is a Perfect number.");
        else
        System.out.println("It is not a Perfect number.");
    }
    void Happy_Number(int n)
    {
        sum=n;
        while(sum>9)
        {
            n=sum;sum=0;
            while(n>0)
            {
                d=n%10;
                sum+=d*d;
                n/=10;
            }
        }
        if(sum==1)
        System.out.println("It is a Happy number.");
        else
        System.out.println("It is not a Happy number.");
    }
    void Multiple_Harshad_Number(int n)
    {
        int num=n,nn;
        while(n!=0)
        {
            d=n%10;
            sum+=d;
            n/=10;
        }
        if(num%sum==0)
        {
            System.out.println("It is a Harshad number.");
            nn=num/sum;
            x=nn;
            sum=0;
            while(nn!=0)
            {
                d=nn%10;
                sum=sum+d;
                nn=nn/10;
            }
            if(x%sum==0)
            System.out.println("It is a Multiple Harshad number.");
            else
            System.out.println("It is not a Multiple Harshad number.");
        }
        else
        System.out.println("It is not a Harshad number.");
    }
    void Tech_Number(int n)
    {
        int fh,sh,t,c=0,d,x=n;
        while(x!=0)
        {
            d=x%10;
            c++;
            x/=10;
        }
        if(c%2==0)
        {
            fh=n/(int)(Math.pow(10.0,(c/2)));
            sh=n%(int)(Math.pow(10.0,(c/2)));
            t=(int)(Math.pow((fh+sh),2));
            if(t==n)
            System.out.println("It is a Tech number");
            else
            System.out.println("It is not a Tech number");
        }
        else
        System.out.println("It does not have even number of digits.");
    }
    void Sum_Product_Number(int n)
    {
        int d,sum=0,pro=1;
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            pro=pro*d;
            n=n/10;
        }
        if(sum==pro)
        System.out.println("Sum-Product number");
        else
        System.out.println("Not a Sum-Product number");
    }
    void Special_2_Digit_Number(int n)
    {
        int x=n,sum=0,pro=1,d=0,su=0;
        for(int i=1;i<=2;i++)
        {
            d=n%10;
            sum=sum+d;
            pro=pro*d;
            n=n/10;
        }
        if(pro+sum==x)
        System.out.println("It is a Special 2 digit no.");
        else
        System.out.println("It is not a Special 2 digit no.");
    }
    public static void main(String args[])
    {
        TYPES_OF_NUMBERS ob=new TYPES_OF_NUMBERS();
        Scanner s=new Scanner(System.in);
        System.out.println("1. SPECIAL NUMBER: A Special number is a number whose sum of digits\nof Factorial is the no itself. Eg. 2 => 2*1 = 2\n");
        System.out.println("2. NEON NUMBER: A Neon number is a number whose sum of the digits\nof the square of the number=the number itself. Eg.9=>9*9=81=>8+1=9");
        System.out.println("3. DUCK NUMBER: A Duck number is a number which contains 0 within it\nEg. 7025");
        System.out.println("4. NIVEN NUMBER: A Niven number is a number which is divisible by\nthe sum of its digits. Eg. 45: 4 + 5 = 9 => 45/9 = 5");
        System.out.println("5. DISARIUM NUMBER: A Disarium number is a number which is like -\n135: 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135");
        System.out.println("6. ARMSTRONG NUMBER: An Armstrong number is a number whose sum of\ncubes of digits = the original no itself.\nEg. 153:1^3 + 5^3 + 3^3=> 1 + 125 + 27 =>153");
        System.out.println("7. PALINDROME NUMBER: A number is Palindrome if the new number\nobtained after reversing the digits, is same as the original one.\nEg. 232 ");
        System.out.println("8. BUZZ NUMBER: A Buzz number is a number which is either divisible\nby 7 or ends with 7. Eg. 2587");
        System.out.println("9. AUTOMORPHIC NUMBER: A number which is contained in the last\ndigit(s) of its square is called Automorphic number.\nEg. 25*25 ==> 625.");
        System.out.println("10. PERFECT NUMBER: A number whose sum of factors = the number\nitself is a Perfect number. Eg. 6 ==> 1+2+3 = 6");
        System.out.println("11. HAPPY NUMBER: A number whose sum of squares of digits = 1.\nEg. 31: 3^2 + 1^2 ==> 10 ==>1 + 0 =>1");
        System.out.println("12. MULTIPLE HARSHAD NUMBER: A Harshad number is a number which\nwhen divided by sum of its digits, gives a whole number.\nA Multiple Harshad number is a Harshad number which when divided by\nsum of its digits, gives another Harshad number. This continues\ntill a single digit number is achieved.\nEg 6804: 6804/18 ==> 378/18 ==> 21/3 ==> 7");
        System.out.println("13. TECH NUMBER: A number with even no of digits and whose, square of sum of the two\nhalves is the no itself is called a Tech no. Eg 3025 - (30+25)^2\n==> 55^2 ==> 3025");
        System.out.println("14. SUM PRODUCT NUMBER: A no. whose sum and product of digits is equal. Eg. 22: 2+2 = 2*2");
        System.out.println("15. SPECIAL 2 DIGIT NUMBER: It is such that when the sum of its digits is\nadded to the product of its digits, we get the no itself.");
        
        System.out.println("\nEnter your choice:");
        byte choice=s.nextByte();
        System.out.println("Enter a number:");
        int a=s.nextInt();
        switch(choice)
        {
            case 1:
            ob.Special_Number(a);
            break;
            case 2:
            ob.Neon_Number(a);
            break;
            case 3:
            ob.Duck_Number(a);
            break;
            case 4:
            ob.Niven_Number(a);
            break;
            case 5:
            ob.Disarium_Number(a);
            break;
            case 6:
            ob.Armstrong_Number(a);
            break;
            case 7:
            ob.Palindrome_Number(a);
            break;
            case 8:
            ob.Buzz_Number(a);
            break;
            case 9:
            ob.Automorphic_Number(a);
            break;
            case 10:
            ob.Perfect_Number(a);
            break;
            case 11:
            ob.Happy_Number(a);
            break;
            case 12:
            ob.Multiple_Harshad_Number(a);
            break;
            case 13:
            ob.Tech_Number(a);
            break;
            case 14:
            ob.Sum_Product_Number(a);
            break;
            case 15:
            ob.Special_2_Digit_Number(a);
            break;
            default:
            System.out.println("Wrong choice!!!");
        }
    }
}