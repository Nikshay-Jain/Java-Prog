import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
public class Applet3 extends Applet
{
	public void init()
	{
		setBackground(Color.RED);
		resize(400,400);
	}
	public void paint(Graphics g)
	{
		g.drawString("BG Color eg Red",0,50);
	}
}