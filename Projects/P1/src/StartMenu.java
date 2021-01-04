import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class StartMenu extends JFrame implements ActionListener{
	JPanel panel;
	JButton btnNextFrame;

	public StartMenu() throws IOException{

		super("Main Frame");
		panel = new JPanel();
		btnNextFrame = new JButton("Start Game");
		panel.setBackground(Color.black);
		panel.setLayout(null);

		btnNextFrame.setBounds(220,500, 150,40);
		panel.add(btnNextFrame);
		btnNextFrame.addActionListener(this);
		
		JLabel welcome = new JLabel("PACMAN",SwingConstants.CENTER);
		welcome.setBounds(100, 200, 400, 50);
		
		welcome.setForeground(Color.YELLOW);
		welcome.setFont (welcome.getFont ().deriveFont (64.0f));
		panel.add(welcome);
		
		JLabel start = new JLabel("Click the Button below to Start!");
		start.setBounds(120, 300, 400, 50);
		start.setForeground(Color.CYAN);
		start.setFont (start.getFont ().deriveFont (24.0f));
		panel.add(start);
		
		 JLabel pacmanImage = new JLabel();
		 ImageIcon pacmanIcon = new ImageIcon(new ImageIcon("src/assets/pacman.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
		 pacmanImage.setIcon(pacmanIcon);	       
	     pacmanImage.setBounds(270, 100, 50, 50);
	     panel.add(pacmanImage);
	     
	     JLabel ghostImage = new JLabel();
		 ImageIcon ghostIcon = new ImageIcon(new ImageIcon("src/assets/ghost.jpg").getImage().getScaledInstance(260, 90, Image.SCALE_DEFAULT));
		 ghostImage.setIcon(ghostIcon);	       
	     ghostImage.setBounds(180, 370, 260, 90);
	     panel.add(ghostImage);
	     
	     
		getContentPane().add(panel);

		setBounds(100, 100, 600, 600);
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent evt){

		if(evt.getSource() == btnNextFrame){
	
			MainFrame mm;
			try {
				mm = new MainFrame();
				mm.initPlayers();
				mm.startGame();
				mm.setVisible(true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			this.setVisible(false);
		}
	}
	public static void main(String args[]) throws IOException{
		StartMenu mf = new StartMenu();
		mf.getContentPane().setBackground(Color.BLACK );
		mf.setTitle("Start Menu");
	}
}
