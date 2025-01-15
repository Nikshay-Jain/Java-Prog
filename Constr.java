class Constr
{
	public static void main(String args[])
	{
		Circle2 c1=new Circle2(3.0,4.0,5.0);
		Circle2 c2=new Circle2(5.0);
		Circle2 c3=new Circle2();
		Circle2 c4=new Circle2(c1);
		System.out.println("Circum of 1: "+c1.circum());
		System.out.println("Area of 1: "+c1.area());
		System.out.println("Circum of 2: "+c2.circum());
		System.out.println("Area of 2: "+c2.area());
		System.out.println("Circum of 3: "+c3.circum());
		System.out.println("Area of 3: "+c3.area());
		System.out.println("Circum of 4: "+c4.circum());
		System.out.println("Area of 4: "+c4.area());
	}
}