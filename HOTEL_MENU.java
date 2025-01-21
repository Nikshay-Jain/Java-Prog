import java.text.SimpleDateFormat;
import java.util.*;
class HOTEL_MENU
{
    Scanner s=new Scanner(System.in);
    int food;
    double bill;
    String str,str2,str3;
    HOTEL_MENU()
    {
        food=0;
        bill=0.0;
        str="";
        str2="";
        str3="";
    }
    void STARTERS()
    {
        System.out.println("THE RANGE OF STARTERS ARE : \n");
        System.out.println("1. TOMATO SOUP              Rs. 60");
        System.out.println("2. PANEER GRILL SANDWHICH   Rs. 100");
        System.out.println("3. PANEER TIKKA             Rs. 150");
        System.out.println("4. SPRING ROLL              Rs. 140");
        System.out.println("5. VEG. CUTLET              Rs. 60");
        System.out.println("6. GREEN SALAD              Rs. 50");
        System.out.println("7. PAPAD                    Rs. 20");
        System.out.println("IF YOU WANT NOTHING, PRESS 'n'.\nPLEASE ENTER YOUR CHOICE");
    }
    void MAIN_COURSE()
    {
        System.out.println("THE RANGE OF MAIN COURSE ARE : \n");
        System.out.println("1. PAV BHAJI                Rs. 120");
        System.out.println("2. MASALA DOSA              Rs. 100");
        System.out.println("3. PANEER BUTTER MASALA     Rs. 160");
        System.out.println("4. KADAI PANEER             Rs. 150");
        System.out.println("5. CHANA MASALA             Rs. 160");
        System.out.println("6. STUFFED TOMATO           Rs. 120");
        System.out.println("7. MALIA KOFTA              Rs. 160");
        System.out.println("8. NAVRATAN KORMA           Rs. 120");
        System.out.println("9. METHI MATAR MALAI        Rs. 140");
        System.out.println("10. MIX VEG.                Rs. 120");
        System.out.println("11. DAL MAKHANI             Rs. 150");
        System.out.println("12. DAL FRY                 Rs. 150");
        System.out.println("13. ROTI                    Rs. 20");
        System.out.println("14. CURD RICE               Rs. 150");
        System.out.println("15. STEAM RICE              Rs. 120");
        System.out.println("IF YOU WANT NOTHING, PRESS 'n'.\nPLEASE ENTER YOUR CHOICE");                
    }
    void DESSERTS()
    {
        System.out.println("THE RANGE OF DESSERT ARE : \n");
        System.out.println("1. RASGULLA                 Rs.130");
        System.out.println("2. GULAB JAMUN              Rs.130");
        System.out.println("3. FALOODA                  Rs.120");
        System.out.println("4. ICE CREAM                Rs.50");
        System.out.println("5. MILKSHAKE                Rs.140");
        System.out.println("6. MALAI RAJBHOG            Rs.200");
        System.out.println("IF YOU WANT NOTHING, PRESS 'n'.\nPLEASE ENTER YOUR CHOICE");
    }
    double OPERATE()
    {
        HOTEL_MENU ob=new HOTEL_MENU();
        Scanner s=new Scanner(System.in);
        System.out.println("WELCOME TO OUR GRAND HOTEL - TAJ MAHAL PALACE");
        System.out.println("PLEASE PLACE YOUR ORDER\n");
        System.out.println("1. STARTERS");
        System.out.println("2. MAIN COURSE");
        System.out.println("3. DESSERT");
        food=s.nextInt();
        bill=0;
        int q;
        char choice;
        switch(food)
        {
            case 1:
            ob.STARTERS();
            str=s.next();
            if(str=="n")
            break;
            else
            {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN STARTERS?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
            }
            switch(str)
            {
                case "1":
                bill=bill+(q*60);
                while(choice=='Y')
                {
                ob.STARTERS();
                str=s.next();
                if(str=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN STARTERS?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "2":
                bill=bill+(q*100);
                while(choice=='Y')
                {
                ob.STARTERS();
                str=s.next();
                if(str=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN STARTERS?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "3":
                bill=bill+(q*150);
                while(choice=='Y')
                {
                ob.STARTERS();
                str=s.next();
                if(str=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN STARTERS?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "4":
                bill=bill+(q*140);
                while(choice=='Y')
                {
                ob.STARTERS();
                str=s.next();
                if(str=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN STARTERS?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "5":
                bill=bill+(q*60);
                while(choice=='Y')
                {
                ob.STARTERS();
                str=s.next();
                if(str=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN STARTERS?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "6":
                bill=bill+(q*50);
                while(choice=='Y')
                {
                ob.STARTERS();
                str=s.next();
                if(str=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN STARTERS?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "7":
                bill=bill+(q*20);
                while(choice=='Y')
                {
                ob.STARTERS();
                str=s.next();
                if(str=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN STARTERS?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "n":
                break;
                default:
                System.out.println("WRONG choice !!!");
            }
            case 2:
            ob.MAIN_COURSE();
            str2=s.next();
            if(str2=="n")
            break;
            else
            {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
            }
            switch(str2)
            {
                case "1":
                bill=bill+(q*120);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "2":
                bill=bill+(q*100);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "3":
                bill=bill+(q*160);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "4":
                bill=bill+(q*150);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "5":
                bill=bill+(q*160);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "6":
                bill=bill+(q*120);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "7":
                bill=bill+(q*160);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "8":
                bill=bill+(q*120);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "9":
                bill=bill+(q*140);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "10":
                bill=bill+(q*120);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "11":
                bill=bill+(q*150);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "12":
                bill=bill+(q*150);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "13":
                bill=bill+(q*20);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "14":
                bill=bill+(q*150);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                case "15":
                bill=bill+(q*120);
                while(choice=='Y')
                {
                ob.MAIN_COURSE();
                str2=s.next();
                if(str2=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "n":
                break;
                default:
                System.out.println("WRONG choice !!!");
            }
            case 3:
            ob.DESSERTS();
            str3=s.next();
            if(str3=="n")
            break;
            else
            {
            System.out.println("PLEASE ENTER QUANTITY");
            q=s.nextInt();
            System.out.println("DO YOU WANT TO PLACE MORE ORDER IN MAIN COURSE?");
            System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
            choice=s.next().charAt(0);
            }
            switch(str3)
            {
                case "1":
                bill=bill+(q*130);
                while(choice=='Y')
                {
                ob.DESSERTS();
                str3=s.next();
                if(str3=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN DESSERT?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "2":
                bill=bill+(q*130);
                while(choice=='Y')
                {
                ob.DESSERTS();
                str3=s.next();
                if(str3=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN DESSERT?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "3":
                bill=bill+(q*120);
                while(choice=='Y')
                {
                ob.DESSERTS();
                str3=s.next();
                if(str3=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN DESSERT?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "4":
                bill=bill+(q*50);
                while(choice=='Y')
                {
                ob.DESSERTS();
                str3=s.next();
                if(str3=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN DESSERT?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "5":
                bill=bill+(q*140);
                while(choice=='Y')
                {
                ob.DESSERTS();
                str3=s.next();
                if(str3=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN DESSERT?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "6":
                bill=bill+(q*200);
                while(choice=='Y')
                {
                ob.DESSERTS();
                str3=s.next();
                if(str3=="n")
                break;
                else
                {
                System.out.println("PLEASE ENTER QUANTITY");
                q=s.nextInt();
                System.out.println("DO YOU WANT TO PLACE MORE ORDER IN DESSERT?");
                System.out.println("PRESS 'Y' FOR YES OR 'N' FOR NO");
                choice=s.next().charAt(0);
                }
                }
                break;
                case "n":
                break;
                default:
                System.out.println("WRONG choice !!!");
            }
            break;
        }
        System.out.println("YOUR TOTAL BILL AMOUNT = Rs."+bill);
        bill=bill+((10.0/100.0)*bill);
        System.out.println("YOUR TOTAL BILL AMOUNT + GST (10%) = Rs."+bill);
        return (int)bill;
    }
    void BILL()
    {
        System.out.println("PLEASE SELECT YOUR PAYMENT METHOD:");
        System.out.println("1: CASH");
        System.out.println("2: CREDIT CARD");
        System.out.println("3: PAYTM");
        int pay=s.nextInt(),amt,amt1,pin,otp1,t=0;
        long mno;
        double otp;
        int arr[]={1,2,3};
        switch(pay)
        {
            case 1:
            System.out.println("PLEASE PAY THE BILL AMOUNT TO THE CASHIER");
            amt=s.nextInt();
            amt1=(int)bill-amt;
            while(amt!=bill)
            {
                if(amt1<bill)
                {
                if(amt1<0)
                {
                amt1=amt1+((amt1)*(-2));
                System.out.println("PLEASE RECEIVE A CHANGE OF RS. "+amt1);
                break;
                }
                else
                {
                System.out.println("PLEASE PAY RS. "+amt1);
                amt=s.nextInt();
                amt1=amt1-amt;
                }
                if(amt1==0)
                break;
                }
            }
            break;
            case 2:
            System.out.println("PLEASE ENTER YOUR 4-DIGIT PIN TO PAY RS. "+bill);
            pin=s.nextInt();
            System.out.println("****");
            System.out.println("CONNECTING.........RECEIVING.........\nTRANSACTION SUCCESSFUL!!!");
            break;
            case 3:
            System.out.println("PLEASE ENTER YOUR 10-DIGIT MOBILE NO. AND SCAN THE QR CODE");
            mno=s.nextLong();
            System.out.println("QR CODE SCANED SUCCESSFULLY");
            System.out.println("WE HAVE SENT AN OTP TO THIS MOBILE NO");
            otp=(Math.random())*10000;
            System.out.println("OTP: "+(int)otp);
            System.out.println("PLEASE ENTER THE OTP TO BE VERIFIED");
            otp1=s.nextInt();
            if((int)otp==otp1)
            System.out.println("CONNECTING.........RECEIVING.........\nTRANSACTION SUCCESSFUL!!!");
            else
            {
            while(otp!=otp1)
            {
            System.out.println("LETS RESTART THE PROCESS AGAIN");
            System.out.println("PLEASE ENTER YOUR 10-DIGIT MOBILE NO. AND SCAN THE QR CODE");
            mno=s.nextLong();
            System.out.println("QR CODE SCANED SUCCESSFULLY");
            System.out.println("WE HAVE SENT AN OTP TO THIS MOBILE NO");
            otp=(Math.random())*10000;
            System.out.println("OTP: "+(int)otp);
            System.out.println("PLEASE ENTER THE OTP TO BE VERIFIED");
            otp1=s.nextInt();
            if((int)otp==otp1)
            System.out.println("CONNECTING.........RECEIVING.........\nTRANSACTION SUCCESSFUL!!!");
            break;
            }
            }
            break;
            default:
            while(t!=1&&t!=2&&t!=3)
            {
            System.out.println("WRONG choice\nLETS RESTART THE PROCESS AGAIN\n");
            System.out.println("YOUR TOTAL BILL = Rs."+bill);
            System.out.println("PLEASE SELECT YOUR PAYMENT METHOD:");
            System.out.println("1: CASH");
            System.out.println("2: CREDIT CARD");
            System.out.println("3: PAYTM");
            pay=s.nextInt();
            for(int i=0;i<3;i++)
            {
                if(arr[i]==pay)
                t=1;
            }
            switch(pay)
            {
            case 1:
            System.out.println("PLEASE PAY THE BILL AMOUNT TO THE CASHIER");
            amt=s.nextInt();
            amt1=(int)bill-amt;
            while(amt!=bill)
            {
                if(amt1<bill)
                {
                if(amt1<0)
                {
                amt1=amt1+((amt1)*(-2));
                System.out.println("PLEASE RECEIVE A CHANGE OF RS. "+amt1);
                break;
                }
                else
                {
                System.out.println("PLEASE PAY RS. "+amt1);
                amt=s.nextInt();
                amt1=amt1-amt;
                }
                if(amt1==0)
                break;
                }
                }
            break;
            case 2:
            System.out.println("PLEASE ENTER YOUR 4-DIGIT PIN TO PAY RS. "+bill);
            pin=s.nextInt();
            System.out.println("****");
            System.out.println("CONNECTING.........RECEIVING.........\nTRANSACTION SUCCESSFUL!!!");
            break;
            case 3:
            System.out.println("PLEASE ENTER YOUR 10-DIGIT MOBILE NO. AND SCAN THE QR CODE");
            mno=s.nextLong();
            System.out.println("QR CODE SCANED SUCCESSFULLY");
            System.out.println("WE HAVE SENT AN OTP TO THIS MOBILE NO");
            otp=(Math.random())*10000;
            System.out.println("OTP: "+(int)otp);
            System.out.println("PLEASE ENTER THE OTP TO BE VERIFIED");
            otp1=s.nextInt();
            if((int)otp==otp1)
            System.out.println("CONNECTING.........RECEIVING.........\nTRANSACTION SUCCESSFUL!!!");
            else
            {
            while(otp!=otp1)
            {
            System.out.println("LETS RESTART THE PROCESS AGAIN");
            System.out.println("PLEASE ENTER YOUR 10-DIGIT MOBILE NO. AND SCAN THE QR CODE");
            mno=s.nextLong();
            System.out.println("QR CODE SCANED SUCCESSFULLY");
            System.out.println("WE HAVE SENT AN OTP TO THIS MOBILE NO");
            otp=(Math.random())*10000;
            System.out.println("OTP: "+(int)otp);
            System.out.println("PLEASE ENTER THE OTP TO BE VERIFIED");
            otp1=s.nextInt();
            if((int)otp==otp1)
            System.out.println("CONNECTING.........RECEIVING.........\nTRANSACTION SUCCESSFUL!!!");
            break;
            }
            }
            break;
            }
            }
        }
        System.out.println("PLEASE RATE OUT HOTEL (OUT OF 5 STARS)");
        int star=s.nextInt();
        System.out.println("THANKS FOR YOUR RATING!!!\nPLEASE ENTER A FEEDBACK FOR US");
        String fdbk=s.next();
        System.out.println("THANK YOU FOR YOUR VALUABLE FEEDBACK.\nIT WILL SURELY BE LOOKED UPON BY OUR TEAM");
        System.out.println("THANK YOU!!!\nPLEASE VISIT AGAIN!!!");
    }
    public static void main(String args[])
    {
        HOTEL_MENU ob=new HOTEL_MENU();
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date datetime=new Date();
        System.out.println("THE CURRENT DATE AND TIME ARE:\n");
        System.out.println(df.format(datetime)+"\n");
        ob.OPERATE();
        ob.BILL();
    }
}