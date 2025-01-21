class Multiclass
{
	public static void main(String args[])
	{
		Circle c=new Circle();
		Box b=new Box();
		c.x=3.0;
		c.y=4.0;
		c.r=5.0;
		b.w=10.0;
		b.h=20.0;
		b.d=30.0;
		System.out.println("Circum: "+c.circum());
		System.out.println("Area: "+c.area());
		System.out.println("Surface Area: "+b.area());
		System.out.println("Volume of box: "+b.volume());
	}
}