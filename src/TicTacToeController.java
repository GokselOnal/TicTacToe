import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToeController extends MouseAdapter {
	private int row;
	private int col;
	private TicTacToeModel model;
	private boolean hasWinner;
	public static String player = "X";

	public TicTacToeController(int row, int col, TicTacToeModel model) {
		this.row = row;
		this.col = col;
		this.model = model;
		this.hasWinner = false;
	}

	public void mousePressed(MouseEvent e) {
		JButton button = this.model.buttons[this.row][this.col];
		if (button.getText().isEmpty() && hasWinner == false) {
			if (this.player.equals("X")) {
				button.setFont(new Font("Courier", Font.PLAIN, 60));
				button.setForeground(Color.DARK_GRAY);
			} else {
				button.setFont(new Font("Courier", Font.PLAIN, 60));
				button.setForeground(Color.WHITE);
			}
			button.setText(this.player);
			button.setFocusable(false);
			hasWinner();
			togglePlayer();
			TicTacToe.frame.setTitle("Tic-Tac-Toe" + "                                          Player "
					+ TicTacToeController.player + " turn");
		}
	}

	private void togglePlayer() {
		if (this.player.equals("X")) {
			this.player = "O";
		} else {
			this.player = "X";
		}
	}

	private void hasWinner() {
		if (this.model.buttons[0][0].getText().equals(this.player)
				&& (this.model.buttons[1][0].getText().equals(this.player))
				&& (this.model.buttons[2][0].getText().equals(this.player))) {
			this.hasWinner = true;
			JOptionPane.showMessageDialog(null, "Player " + this.player + " has won");
			System.exit(0);

		} else if (this.model.buttons[0][1].getText().equals(this.player)
				&& (this.model.buttons[1][1].getText().equals(this.player))
				&& (this.model.buttons[2][1].getText().equals(this.player))) {
			this.hasWinner = true;
			JOptionPane.showMessageDialog(null, "Player " + this.player + " has won");
			System.exit(0);

		} else if (this.model.buttons[0][2].getText().equals(this.player)
				&& (this.model.buttons[1][2].getText().equals(this.player))
				&& (this.model.buttons[2][2].getText().equals(this.player))) {
			this.hasWinner = true;
			JOptionPane.showMessageDialog(null, "Player " + this.player + " has won");
			System.exit(0);
		}

		else if (this.model.buttons[0][0].getText().equals(this.player)
				&& (this.model.buttons[0][1].getText().equals(this.player))
				&& (this.model.buttons[0][2].getText().equals(this.player))) {
			this.hasWinner = true;
			JOptionPane.showMessageDialog(null, "Player " + this.player + " has won");
			System.exit(0);
		} else if (this.model.buttons[1][0].getText().equals(this.player)
				&& (this.model.buttons[1][1].getText().equals(this.player))
				&& (this.model.buttons[1][2].getText().equals(this.player))) {
			this.hasWinner = true;
			JOptionPane.showMessageDialog(null, "Player " + this.player + " has won");
			System.exit(0);

		} else if (this.model.buttons[2][0].getText().equals(this.player)
				&& (this.model.buttons[2][1].getText().equals(this.player))
				&& (this.model.buttons[2][2].getText().equals(this.player))) {
			this.hasWinner = true;
			JOptionPane.showMessageDialog(null, "Player " + this.player + " has won");
			System.exit(0);
		} else if (this.model.buttons[0][0].getText().equals(this.player)
				&& (this.model.buttons[1][1].getText().equals(this.player))
				&& (this.model.buttons[2][2].getText().equals(this.player))) {
			this.hasWinner = true;
			JOptionPane.showMessageDialog(null, "Player " + this.player + " has won");
			System.exit(0);

		}

		else if (this.model.buttons[2][0].getText().equals(this.player)
				&& (this.model.buttons[1][1].getText().equals(this.player))
				&& (this.model.buttons[0][2].getText().equals(this.player))) {
			this.hasWinner = true;
			JOptionPane.showMessageDialog(null, "Player " + this.player + " has won");
			System.exit(0);

		} else if (allSelected() && hasWinner == false) {
			JOptionPane.showMessageDialog(null, "Draw");
			System.exit(0);
		}
	}

	private boolean allSelected() {
		for (int i = 0; i < this.model.buttons.length; i++) {
			for (int j = 0; j < this.model.buttons[0].length; j++) {
				if (this.model.buttons[i][j].getText().isEmpty()) {
					return false;
				}
			}
		}
		return true;
	}
}
