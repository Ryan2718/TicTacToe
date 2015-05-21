package gui;

import javax.swing.JFrame;

/** Play Tic Tac Toe with another player.
 * @author Ryan Forsyth (May 20, 2015)
 */
public class TicTacToe {

	/** Play the game
	 * @param args Unused Command Line Arguments
	 */
	public static void main(String[] args) {
		JFrame frame = new JFrame("Tic Tac Toe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TotalPanel());
		frame.pack();
		frame.setVisible(true);
	}

}
