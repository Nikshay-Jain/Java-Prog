public class Runtimeinput
{
	public static void main(String args[])
	{
		for(String s:args)
		{
			System.out.println(s+args[0]);
		}
	}
}

/*At time of execution:
PS C:\Users\Nikshay Jain\Desktop\NPTEL\Programming in Java> java Runtimeinput Hi Nikshay, IIT Madras
Hi
Nikshay
IIT
Madras*/