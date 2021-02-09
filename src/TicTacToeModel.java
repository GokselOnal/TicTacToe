import javax.swing.*;

public class TicTacToeModel {
	public JButton[][] buttons;

	public TicTacToeModel(int row, int col) {
		this.buttons = new JButton[row][col];
		initializeBoard();
	}

	public void initializeBoard() {
		for (int i = 0; i < this.buttons.length; i++) {
			for (int j = 0; j < this.buttons[0].length; j++) {
				this.buttons[i][j] = new JButton(" ");
			}
		}
	}
}
