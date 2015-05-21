package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/** The panel that holds the entire user interface.
 * @author Ryan Forsyth (May 20, 2015)
 */
public class TotalPanel extends JPanel {
	
	/** Serial version UID */
	private static final long serialVersionUID = 1L;
	
	/** Forest Green */
	private static final Color FOREST_GREEN = new Color(34, 139, 34);
	
	/** The background color of the total panel */
	public static final Color BACKGROUND = FOREST_GREEN;
	
	/** Panel height */
	private static final int PANEL_HEIGHT =  TicTacToeGrid.TTT_PANEL_HEIGHT +
											InfoPanel.PANEL_HEIGHT;
	
	/** Panel width */
	private static final int PANEL_WIDTH = TicTacToeGrid.TTT_PANEL_WIDTH;
	
	
	/** Set up the total panel */
	public TotalPanel() {
		super();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(BACKGROUND);
		
		String username = JOptionPane.showInputDialog("Username");
		Player playAs =  Player.X; // Replace by connecting to server; let server decide who gets what letter
		String competitor = "Player 2"; // Again, replace by connecting to server
		
		InfoPanel infoPanel = new InfoPanel(username, playAs, competitor);
		TicTacToeGrid grid = new TicTacToeGrid(infoPanel);
		
		infoPanel.setBackground(BACKGROUND);
		
		add(infoPanel);
		add(grid);
		
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}
	
}
