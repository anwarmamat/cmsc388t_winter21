import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.Color;

public class GhostComponent extends JComponent{
	

	private Color color = Color.red;	
	private int scale;

	public GhostComponent(int x, int y, int scale)
	{
		setLocation(x,y);
		setSize(20,40);
		this.scale = scale;
	}
	
	public GhostComponent(int x, int y, Color col, int scale)
	{
		setLocation(x,y);
		setSize(20,40);
		color = col;
		this.scale = scale;
	}

	public void paintComponent(Graphics g)
	{
		//Image image=new ImageIcon("pacman.png").getImage();
        //g.drawImage(image,3,4,this);
		Graphics2D g2 = (Graphics2D) g;
		Ellipse2D.Double ball = new Ellipse2D.Double(0, 0, scale, scale);
		g2.setColor(color);
		g2.fill(ball);
		
	}
	public void setLocation(int x, int y) {
		super.setLocation(scale*x, scale*y);
	} 
	
}
