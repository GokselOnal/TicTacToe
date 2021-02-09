import javax.swing.*;
import java.awt.*;

public class TicTacToeGUI extends JPanel {
	private TicTacToeModel model;

	public TicTacToeGUI(int row, int col) {
		this.model = new TicTacToeModel(row, col);
		this.setLayout(new GridLayout(row, col));
		for (int i = 0; i < TicTacToe.SIZE; ++i) {
			for (int j = 0; j < TicTacToe.SIZE; ++j) {
				JButton button = new JButton();
				this.add(button);
				this.model.buttons[i][j] = button;
				button.setBackground(Color.pink);
				button.addMouseListener(new TicTacToeController(i, j, this.model));
			}
		}
	}
}
