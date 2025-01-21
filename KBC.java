import java.util.*;
class KBC
{
    public static void main(String args[])
    {
        int i=1;
        System.out.println("Enter Your Answers By Writing The Option Alphabet");
        Scanner s=new Scanner(System.in);
        System.out.println("For Rs.5000");
        System.out.println("Q1. Who became the first viceroy of India in the British Rule ?");
        System.out.println("a. Lord Canning         "+"b. Lord Dalhousie\n"+"c. Lord Wellesly\t"+"d. Lord Cornwallis");
        char q1=s.next().charAt(0);
        switch(q1)
        {
            case 'a':
            System.out.println("Correct Answer");
            System.out.println("You Won Rs.5000");
            break;
            case 'b':
            for(i=1;i>=1;i++)
            {
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option a");
            }
            break;
            case 'c':
            for(i=1;i>=1;i++)
            {
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option a");
            }
            break;
            case 'd':
            for(i=1;i>=1;i++)
            {
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option a");
            }
            break;        
        }
        System.out.println("For Rs.10,000");
        System.out.println("Q2. What happenes on combining all the 7 colours of a rainbow ?");
        System.out.println("a. Black colour is formed\t"+"b. They remain as they are\n"+"c. White colour is formed\t"+"d. The rainbow becomes a laser");
        char q2=s.next().charAt(0);
        switch(q2)
        {
            case 'a':
            for(i=1;i>=1;i++)
            {
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option c");
            }
            break;
            case 'b':
            for(i=1;i>=1;i++)
            {
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option c");
            }
            break;
            case 'c':
            System.out.println("Correct Answer");
            System.out.println("You Won Rs.10,000");
            break;
            case 'd':
            for(i=1;i>=1;i++)
            {
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option c");
            }
            break;
        }
        System.out.println("For Rs.20,000");
        System.out.println("Q3. Which state of India declared that there would be no shortage\n of cow slaughter so as to feed beef to the foreigners ?");
        System.out.println("a. Maharashtra\t"+"b. Goa \n"+"c. Tamil Nadu\t"+"d. Uttar Pradesh");
        char q3=s.next().charAt(0);
        switch(q3)
        {
            case 'a':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'b':
            System.out.println("Correct Answer");
            System.out.println("You Won Rs.20,000");
            break;
            case 'c':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'd':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
        }
        System.out.println("For Rs.40,000");
        System.out.println("Q4. What was the original name of the warrior Karn in the\n epic Mahabharat ?");
        System.out.println("a. Karutya \t"+"b. Vasusen \n"+"c. Gandivdhari \t"+"d. Dhanurdhar ");
        char q4=s.next().charAt(0);
        switch(q4)
        {
            case 'a':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'c':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'b':
            System.out.println("Correct Answer");
            System.out.println("You Won Rs.40,000");
            break;
            case 'd':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
        }
        System.out.println("For Rs.80,000");
        System.out.println("Q5. Which of the following animal cannot be affected by\n cancer and is being studied for that ?");
        System.out.println("a. Elephant Seal \t"+"b. Paramecium \n"+"c. Lemon Shark \t"+"d. Naked Mole Rat ");
        char q5=s.next().charAt(0);
        switch(q5)
        {
            case 'a':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option d");
            break;
            case 'b':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option d");
            break;
            case 'c':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option d");
            break;
            case 'd':
            System.out.println("Correct Answer");
            System.out.println("You Won Rs.80,000");
            break;
        }
        System.out.println("For Rs.1,60,000");
        System.out.println("Q6. Which Indian player represnts India both in cricket\n and chess ?");
        System.out.println("a. Viswanathan Anand \t"+"b. Yuzvendra Chahal\n"+"c. Virendra Sehwag \t"+"d. Surya Shekhar Ganguly ");
        char q6=s.next().charAt(0);
        switch(q6)
        {
            case 'a':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'd':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'c':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'b':
            System.out.println("Correct Answer");
            System.out.println("You Won Rs.1,60,000");
            break;
        }
        System.out.println("For Rs.3,20,000");
        System.out.println("Q7. Which was the First Asian country to reach Mars ?");
        System.out.println("a. China \t"+"b. India\n"+"c. Russia \t"+"d. Japan ");
        char q7=s.next().charAt(0);
        switch(q7)
        {
            case 'a':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'd':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'c':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'b':
            System.out.println("Correct Answer");
            System.out.println("You Won Rs.3,20,000");
            break;
        }
        System.out.println("For Rs.6,40,000");
        System.out.println("Q7. Which was the First Sailing Ship of the Indian Navy to\nCircumnavigate the globe ?");
        System.out.println("a. INS Tarangini \t"+"b. INSV Tarini\n"+"c. INS Jaldhara \t"+"d. INSV Shrishti ");
        char q8=s.next().charAt(0);
        switch(q8)
        {
            case 'b':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'd':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'c':
            System.out.println("Sorry, This The Wrong Answer");
            System.out.println("The Correct Answer is Option b");
            break;
            case 'a':
            System.out.println("Correct Answer");
            System.out.println("You Won Rs.6,40,000");
            break;
        }
        
    }
}