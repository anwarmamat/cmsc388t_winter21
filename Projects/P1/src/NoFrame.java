import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;
/**
 * Main Frame for Pac Man Game
 * 
 * @author nandhinikrishnan
 *
 */
public class NoFrame {

	private PacMan pacman;
	private ArrayList <Ghost> ghosts = new ArrayList<Ghost>();
	private Color[] colors = {Color.red, Color.cyan, Color.pink, Color.orange};
	private String[] names = {"Blinky", "Inky", "Pinky", "Clyde"};
	private JLabel scoreboard;
	private JButton close;
	private Map myMap;
	public int scale = 20;
	public int dim = 30;
	private int score = 0;
		
	private boolean continueGame = true;
	
	public NoFrame() throws FileNotFoundException
	{
		
		myMap = new Map(dim);
	
		File text = new File("src/assets/Map.txt");
		Scanner scnr = new Scanner(text);
		int row = 0;
		while(scnr.hasNextLine()){
		    String line = scnr.nextLine();
		    for(int col = 0; col < line.length(); col++) {
		    	Location loc = new Location(row, col);
		   
			 	if(line.charAt(col) == '0') {
		    		WallComponent wall = new WallComponent(loc.x,loc.y,scale);
		    		myMap.add("wall", loc, wall, Map.Type.WALL);
					wall.setLocation(row, col);
		    	}
		    	else if (line.charAt(col) == '1') {
		    		CookieComponent tok = new CookieComponent(loc.x,loc.y,scale);
		    		myMap.add("tok_x"+row+"_y"+col, loc, tok, Map.Type.COOKIE);
					tok.setLocation(row, col);
		    	}
		    }
		    row++;
		} 
		
		scnr.close();
	}

	public PacMan addPacMan(Location loc) {
		pacman = new PacMan("pacman", loc, myMap);
		PacManComponent pc = new PacManComponent(loc.x,loc.y,scale);
		myMap.add("pacman", loc, pc, Map.Type.PACMAN);
		return pacman;
	}

	public Ghost addGhost(Location loc, String name, Color color) {
		Ghost ghost = new Ghost(name, loc, myMap);
		GhostComponent comp = new GhostComponent(loc.x, loc.y, color, scale);
		myMap.add(name, loc, comp, Map.Type.GHOST);
		ghosts.add(ghost);
		return ghost;
	}
	
	public void initPlayers() {
		addPacMan(new Location(1,1)); 

		int i = 0;
		for (Color color : colors) {
			int x = (int) (Math.random() * 2 + dim/2);
			int y = (int) (Math.random() * 2 + dim/2);
			Location loc = new Location(x, y);
			addGhost(loc, names[i++], color);
		}

	}
	public Map getMap() {
		return myMap;
	}
	
	public void startGame() {
		Timer timer = new Timer(100, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(continueGame) {
					pacman.move();
					JComponent temp = pacman.consume();

					for (Ghost ghost : ghosts){
						ghost.move();
						ghost.attack();
					}
				}
				
				if(myMap.isGameOver()) {
					continueGame = false;
					score = myMap.getCookies();
			        System.exit(0);
				}
			}}); 
		timer.start();
	}	

	public static void main(String[] args) throws FileNotFoundException
	{
		NoFrame myFrame = new NoFrame();
		myFrame.initPlayers();	
		myFrame.startGame();		
		
	}
}
