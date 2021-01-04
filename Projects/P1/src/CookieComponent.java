import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;

public class CookieComponent extends JComponent{
	
	private Color color = new Color(218, 165, 32);;	
	private int scale;

	public CookieComponent(int x, int y, int s){
		setLocation(x,y);
		setSize(20,40);
		this.scale = s; 
		
	}

	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
	
		Ellipse2D.Double wall = new Ellipse2D.Double(0, 0, this.scale/2, this.scale/2);
		g2.setColor(color);
		g2.fill(wall);
		
	}
	public void setLocation(int x, int y) {
		super.setLocation(scale*x+scale/4, scale*y+scale/4);
	} 
	
}
