package grid;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JPanel;

/** 2D Grid
 * @author Ryan Forsyth (May 20, 2015)
 */
public class Grid extends JPanel {

	/** Serial Version UID */
	private static final long serialVersionUID = 1L;
	
	/** Panel Height */
	private final int PANEL_HEIGHT;
	
	/** Panel Width */
	private final int PANEL_WIDTH;
	
	/** Number of rows */
	private final int NUM_ROWS;
	
	/** Number of columns */
	private final int NUM_COLS;
	
	/** The 2D array of cells */
	protected Cell[][] cells;
	
	
	/** Set up the grid
	 * @param panelHeight The height of the panel
	 * @param panelWidth The width of the panel
	 * @param numRows The number of rows
	 * @param numCols The number of columns
	 */
	public Grid(int panelHeight, int panelWidth, int numRows, int numCols) {
		this(panelHeight, panelWidth, numRows, numCols, null);
		
		cells = new Cell[numRows][numCols];
		for (int row = 0; row < NUM_ROWS; row++) {
			for (int col = 0; col < NUM_COLS; col++) {
				cells[row][col] = new Cell();
				add(cells[row][col]);
			}
		}
		
	}
	
	/** Set up the grid
	 * @param panelHeight The height of the panel
	 * @param panelWidth The width of the panel
	 * @param numRows The number of rows
	 * @param numCols The number of columns 
	 * @param cells The 2D array of cells
	 */
	protected Grid(int panelHeight, int panelWidth, int numRows, int numCols,
				Cell[][] cells) {
		super(new GridLayout(numRows, numCols));
		
		PANEL_HEIGHT = panelHeight;
		PANEL_WIDTH = panelWidth;
		NUM_ROWS = numRows;
		NUM_COLS = numCols;
		this.cells = cells;
		
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}
	
	/** Add the cells to the grid */
	protected void addCells() {
		for (int row = 0; row < NUM_ROWS; row++) {
			for (int col = 0; col < NUM_COLS; col++) {
				add(cells[row][col]);
			}
		}
	}
	
}
