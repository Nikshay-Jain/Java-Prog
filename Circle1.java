class Circle1
{
	public static void main(String args[])
	{
		Circle c1=new Circle();
		Circle c2=new Circle();
		c1.x=3.0;
		c1.y=4.0;
		c1.r=5.0;
		c2.x=-3.0;
		c2.y=-4.0;
		c2.r=10.0;
		System.out.println("Circum of 1: "+c1.circum());
		System.out.println("Area of 1: "+c1.area());
		System.out.println("Circum of 2: "+c2.circum());
		System.out.println("Area of 2: "+c2.area());
	}
}