import java.util.Scanner;
public class FibonacciNPTEL { 

public static void main(String args[]){ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter n");
	int n=sc.nextInt();
System.out.println(fib(n)); 
}
//Template code:
static int fib(int n) { 
if(n==0)
  return 0;
else if(n==1)
  return 1;
else
  return(fib(n-1)+fib(n-2));
  }
}