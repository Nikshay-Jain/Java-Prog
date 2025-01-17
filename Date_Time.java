import java.text.SimpleDateFormat;
import java.util.*;
class Date_Time
{
    public static void main(String args[])
    {
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date datetime=new Date();
        System.out.print(df.format(datetime));
    }
}