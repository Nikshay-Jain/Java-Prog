import java.util.*;
class BMI
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("It will calculate your Body Mass Index and give you your status i.e\nunderweight/ normal/ overweight/ obese (class 1/2/3)");
        System.out.println("Enter your height in metres");
        double ht=s.nextDouble();
        System.out.println("Enter your weight in kilo-grams");
        double wt=s.nextDouble();
        double bmi=wt/(ht*ht);
        double iw1=18.5*ht*ht;
        double iw2=24.9*ht*ht;
        if(bmi<18.5)
        {
            System.out.println("You are UNDERWEIGHT. Your BMI being "+bmi);
            System.out.println("Your ideal weigth should be between "+iw1+" and "+iw2);
        }
        if(bmi>=18.5&&bmi<=24.9)
        {
            System.out.println("You are NORMAL. Your BMI being "+bmi);
            System.out.println("Your ideal weigth should be between "+iw1+" and "+iw2);
        }
        if(bmi>=25&&bmi<=29.9)
        {
            System.out.println("You are OVERWEIGHT. Your BMI being "+bmi);
            System.out.println("Your ideal weigth should be between "+iw1+" and "+iw2);
        }
        if(bmi>=30&&bmi<=34.9)
        {
            System.out.println("You are CLASS I OBESE. Your BMI being "+bmi);
            System.out.println("Your ideal weigth should be between "+iw1+" and "+iw2);
        }
        if(bmi>=35&&bmi<=39.9)
        {
            System.out.println("You are CLASS II OBESE. Your BMI being "+bmi);
            System.out.println("Your ideal weigth should be between "+iw1+" and "+iw2);
        }
        if(bmi>40)
        {
            System.out.println("You are CLASS III OBESE. Your BMI being "+bmi);
            System.out.println("Your ideal weigth should be between "+iw1+" and "+iw2);
        }
    }
}