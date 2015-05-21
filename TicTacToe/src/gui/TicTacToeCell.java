package gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import images.ImageLoader;
import grid.Cell;

/** Grid cell specifically designed for Tic Tac Toe
 * @author Ryan Forsyth (May 20, 2015)
 */
public class TicTacToeCell extends Cell {

	/** Serial Version UID */
	private static final long serialVersionUID = 1L;
	
	/** Background image */
	private Image image;
	
	/** Play as */
	private final Player playAs;
	
	/** Set up the cell
	 * @param playAs The player (X or O)
	 */
	public TicTacToeCell(Player playAs) {
		super();
		this.playAs = playAs;
		addMouseListener(new CellListener());
	}
	
	/** Listen for a cell to be clicked.
	 * @author Ryan Forsyth (May 20, 2015)
	 */
	private class CellListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			if (image == null) {
				setBackgroundImage(playAs);
			} // Else : The other player is already in that spot!
		}
		public void mousePressed(MouseEvent e) {}
		public void mouseReleased(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	/** Set the background image
	 * @param p The player (X or O)
	 */
	private void setBackgroundImage(Player p) {
		try {
			image = ImageLoader.upload(this, p);
		} catch (IOException e) {
			image = null;
			e.printStackTrace();
		}
		repaint();
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		page.drawImage(image, 0, 0, null);
	}

	
}
