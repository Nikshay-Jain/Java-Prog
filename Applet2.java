import java.applet.Applet;
import java.awt.Graphics;
public class Applet2 extends Applet
{
    public void init()
    {
	    resize(500,500);
	}

	public void paint(Graphics g)
	{
		g.drawString("Hello Nikshay!!!",300,300);
	}
}