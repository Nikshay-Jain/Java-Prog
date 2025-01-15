class Circle2
{
	double x,y,r;
	Circle2(double r)
	{
		x=0;y=0;this.r=r;
	}
	Circle2(Circle2 c)
	{
		x=c.x;y=c.y;r=c.r;
	}
	Circle2(double x,double y,double r)
	{
		this.x=x;this.y=y;this.r=r;
	}
	Circle2() //Default Constructor
	{
		x=0;y=0;r=1.0;
	}
	double circum()
	{
		return 2*Math.PI*r;
	}
	double area()
	{
		return Math.PI*r*r;
	}
}