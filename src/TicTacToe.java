import javax.swing.*;

public class TicTacToe {
	public static final int SIZE = 3;
	public static JFrame frame;
	public static void main(String[] args) {
		frame = new JFrame("Tic-Tac-Toe" + "                                          Player "
				+ TicTacToeController.player + " turn");
		frame.add(new TicTacToeGUI(SIZE, SIZE));
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
