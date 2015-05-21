package grid;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

/** A single cell on a grid
 * @author Ryan Forsyth (May 20, 2015)
 */
public class Cell extends JPanel {

	/** Serial Version UID */
	private static final long serialVersionUID = 1L;
	
	/** Border thickness */
	private static final int BORDER_THICKNESS = 1;
	
	
	/** Set up the cell */
	public Cell() {
		super();
		Border border = BorderFactory.createLineBorder(Color.BLACK, 
													   BORDER_THICKNESS);
		setBorder(border);
		setBackground(Color.WHITE);
	}
	
}
