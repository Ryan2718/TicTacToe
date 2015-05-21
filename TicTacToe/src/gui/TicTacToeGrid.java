package gui;

import grid.Cell;
import grid.Grid;

/** Grid designed for Tic Tac Toe
 * @author Ryan Forsyth (May 20, 2015)
 */
public class TicTacToeGrid extends Grid {
	
	/** Serial Version UID */
	private static final long serialVersionUID = 1L;
	
	/** The associated InfoPanel */
	private final InfoPanel INFO_PANEL;
	
	/** Panel height */
	static final int TTT_PANEL_HEIGHT = 400;
	
	/** Panel width */
	static final int TTT_PANEL_WIDTH = 400;
	
	/** Grid size */
	private static final int SIZE = 3;

	
	/** Set up the Tic Tac Toe Grid
	 * @param infoPanel The InfoPanel that provides information
	 * 	      about the game being played
	 */
	public TicTacToeGrid(InfoPanel infoPanel) {
		super(TTT_PANEL_HEIGHT, TTT_PANEL_WIDTH, SIZE, SIZE, 
				new Cell[SIZE][SIZE]);
		
		INFO_PANEL = infoPanel;
		
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				cells[row][col] = new TicTacToeCell(INFO_PANEL.playAs);
			}
		}
		
		addCells();
	}
	
}
