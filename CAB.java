import java.util.*;
class CAB
{
    Scanner s=new Scanner(System.in);
    float d,f;
    int otp,otp1;
    CAB()
    {
        System.out.println("It will give you the total fare for travelling in a Cab for some\ndistance with Rs 50 as base charge.");
        System.out.println("Please Enter your Travelling Choise");
        System.out.println("1. Micro");
        System.out.println("2. Mini");
        System.out.println("3. Sedan");
        System.out.println("4. Luxury");
        System.out.println("5. Ultra Luxury");
        System.out.println("6. Air Travel");
        otp=0;
        otp1=0;
        d=0.0f;
        f=50.0f;
    }
    void MICRO()
    {
        System.out.println("It has Cabs like Datsun Ready-Go, Hyundia Eon, Maruti Swift");
        System.out.println("It has Fare Rate as: Rs.6/km");
        System.out.println("Enter Travel Distance in km(s)");
        d=s.nextFloat();
        f+=(d*6);
        System.out.println("Your Total fare is: Rs "+f);
        otp=(int)((Math.random())*10000);
        System.out.println("The OTP is: "+otp);
        System.out.println("Enter The OTP");
        otp1=s.nextInt();
        if((int)otp==otp1)
        System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
        else
        {
            while(otp!=otp1)
            {
            System.out.println("Wrong OTP!!!\nPlease Re-enter it");
            otp1=s.nextInt();
            if((int)otp==otp1)
            {
            System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
            break;
            }
            else
            continue;
            }
        }
    }
    void MINI()
    {
        System.out.println("It has Cabs like Tata Indica, Maruti Swift Dzire, Honda Jazz");
        System.out.println("It has Fare Rate as: Rs.10/km");
        System.out.println("Enter Travel Distance in km(s)");
        d=s.nextFloat();
        f+=(d*10);
        System.out.println("Your Total fare is: Rs "+f);
        otp=(int)((Math.random())*10000);
        System.out.println("The OTP is: "+otp);
        System.out.println("Enter The OTP");
        otp1=s.nextInt();
        if((int)otp==otp1)
        System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
        else
        {
            while(otp!=otp1)
            {
            System.out.println("Wrong OTP!!!\nPlease Re-enter it");
            otp1=s.nextInt();
            if((int)otp==otp1)
            {
            System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
            break;
            }
            else
            continue;
            }
        }
    }
    void SEDAN()
    {
        System.out.println("It has Cabs like Maruti Ciaz, Honda City, Hyundia Verna");
        System.out.println("It has Fare Rate as: Rs.30/km");
        System.out.println("Enter Travel Distance in km(s)");
        double d=s.nextFloat();
        f+=(d*30);
        System.out.println("Your Total fare is: Rs "+f);
        otp=(int)((Math.random())*10000);
        System.out.println("The OTP is: "+otp);
        System.out.println("Enter The OTP");
        otp1=s.nextInt();
        if((int)otp==otp1)
        System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
        else
        {
            while(otp!=otp1)
            {
            System.out.println("Wrong OTP!!!\nPlease Re-enter it");
            otp1=s.nextInt();
            if((int)otp==otp1)
            {
            System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
            break;
            }
            else
            continue;
            }
        }
    }
    void LUXURY()
    {
        System.out.println("It has Cabs like Audi, Mercedes, BMW");
        System.out.println("It has Fare Rate as: Rs.100/km");
        System.out.println("Enter Travel Distance in km(s)");
        double d=s.nextFloat();
        f+=(d*100);
        System.out.println("Your Total fare is: Rs "+f);
        otp=(int)((Math.random())*10000);
        System.out.println("The OTP is: "+otp);
        System.out.println("Enter The OTP");
        otp1=s.nextInt();
        if((int)otp==otp1)
        System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
        else
        {
            while(otp!=otp1)
            {
            System.out.println("Wrong OTP!!!\nPlease Re-enter it");
            otp1=s.nextInt();
            if((int)otp==otp1)
            {
            System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
            break;
            }
            else
            continue;
            }
        }
    }
    void ULTRA_LUXURY()
    {
        System.out.println("It has Cabs like Porche, Jaguar, Ferrari");
        System.out.println("It has Fare Rate as: Rs.500/km");
        System.out.println("Enter Travel Distance in km(s)");
        double d=s.nextFloat();
        f+=(d*500);
        System.out.println("Your Total fare is: Rs "+f);
        otp=(int)((Math.random())*10000);
        System.out.println("The OTP is: "+otp);
        System.out.println("Enter The OTP");
        otp1=s.nextInt();
        if((int)otp==otp1)
        System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
        else
        {
            while(otp!=otp1)
            {
            System.out.println("Wrong OTP!!!\nPlease Re-enter it");
            otp1=s.nextInt();
            if((int)otp==otp1)
            {
            System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
            break;
            }
            else
            continue;
            }
        }
    }
    void AIR_TRAVEL()
    {
        System.out.println("It has Air Cabs like Helicopter, Private Jets, etc");
        System.out.println("It has Fare Rate as: Rs.5000/km");
        System.out.println("Enter Travel Distance in km(s)");
        double d=s.nextFloat();
        f+=(d*5000);
        System.out.println("Your Total fare is: Rs "+f);
        otp=(int)((Math.random())*10000);
        System.out.println("The OTP is: "+otp);
        System.out.println("Enter The OTP");
        otp1=s.nextInt();
        if((int)otp==otp1)
        System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
        else
        {
            while(otp!=otp1)
            {
            System.out.println("Wrong OTP!!!\nPlease Re-enter it");
            otp1=s.nextInt();
            if((int)otp==otp1)
            {
            System.out.println("Connecting.........Starting Ride.........\nRide Started Successfully!!!\nHappy Journey");
            break;
            }
            else
            continue;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        CAB cab=new CAB();
        int c=s.nextInt();
        switch(c)
        {
            case 1:
            cab.MICRO();
            break;
            case 2:
            cab.MINI();
            break;
            case 3:
            cab.SEDAN();
            break;
            case 4:
            cab.LUXURY();
            break;
            case 5:
            cab.ULTRA_LUXURY();
            break;
            case 6:
            cab.AIR_TRAVEL();
            break;
        }
    }
}