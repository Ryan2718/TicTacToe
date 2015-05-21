package images;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import gui.Player;
import gui.TicTacToeCell;

/** Load the images for Tic Tac Toe
 * @author Ryan Forsyth (May 20, 2015)
 */
public class ImageLoader {
	
	/** Image of X, from http://commons.wikimedia.org/wiki/File:Letter_x.svg */
	private final static File X = new File("X.png");
	
	/** Image of O, from http://commons.wikimedia.org/wiki/File:Letter_o.svg */
	private final static File O = new File("O.png");
	
	
	/** Upload an image
	 * @param cell The cell whose background is being changed to the image
	 * @param p The player (X or O)
	 * @return The image
	 * @throws IOException
	 */
	public static Image upload(TicTacToeCell cell, Player p) throws IOException {
		Image image = ImageIO.read(getFile(p));
		image = image.getScaledInstance(cell.getWidth(), cell.getHeight(),
										Image.SCALE_SMOOTH);
		return image;
	}
	
	/** Get the file associated with a player
	 * @param p The player (X or O)
	 * @return The file
	 */
	private static File getFile(Player p) {
		File image;
		
		if (p == Player.X) {
			image = X;
		} else if (p == Player.O) {
			image = O;
		} else {
			image = null;
		}
		
		return image;
	}
	
}
