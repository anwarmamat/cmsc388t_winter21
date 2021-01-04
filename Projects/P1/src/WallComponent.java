import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComponent;

import java.awt.geom.Rectangle2D;
import java.awt.Graphics2D;
import java.awt.Color;

public class WallComponent extends JComponent{
	

	private Color color = Color.blue;	
	private int scale;

	public WallComponent(int x, int y, int s){
		setLocation(x,y);
		setSize(20,40);
		this.scale = s; 
		
	}

	public void paintComponent(Graphics g)
	{
		//Image image=new ImageIcon("pacman.png").getImage();
        //g.drawImage(image,3,4,this);
		Graphics2D g2 = (Graphics2D) g;
	
		Rectangle2D.Double wall = new Rectangle2D.Double(0, 0, this.scale, this.scale);
		g2.setColor(color);
		g2.fill(wall);
		
	}
	public void setLocation(int x, int y) {
		super.setLocation(scale*x, scale*y);
	} 
	
}
