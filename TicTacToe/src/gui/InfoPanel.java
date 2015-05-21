package gui;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InfoPanel extends JPanel {

	/** Serial Version UID */
	private static final long serialVersionUID = 1L;

	/** Username Label */
	private final JLabel usernameLabel;
	
	/** Player Label */
	private final JLabel playerLabel;
	
	/** Competitor Label */
	private final JLabel competitorLabel;
	
	/** Panel Height */
	static final int PANEL_HEIGHT = 50;
	
	/** Username */
	final String username;
	
	/** Player */
	final Player playAs;
	
	/** Competitor */
	final String competitor;
	
	
	/** Set up the InfoPanel
	 * @param username The player's username
	 * @param playAs Playing as X or O
	 * @param competitor The competitor's username
	 */
	public InfoPanel(String username, Player playAs, String competitor) {
		super();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		this.username = username;
		this.playAs = playAs;
		this.competitor = competitor;
		
		usernameLabel = new JLabel("Username: " + username);
		playerLabel = new JLabel("Playing as: " + playAs);
		competitorLabel = new JLabel("Competitor: " + competitor);
		
		add(usernameLabel);
		add(playerLabel);
		add(competitorLabel);
		
		setPreferredSize(new Dimension(TicTacToeGrid.TTT_PANEL_WIDTH, 
									   PANEL_HEIGHT));
	}
	
}
