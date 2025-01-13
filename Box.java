class Box
{
	double w,h,d,a;
	double area()
	{
		a=(w*h+h*d+d*w)*2.0;
		return a;
	}
	double volume()
	{
		double v;
		v=w*h*d;
		return v;
	}
}