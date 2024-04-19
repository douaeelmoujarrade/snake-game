package pack1;
import javax.swing.*;

public class Main {
	public static void main(String[] args) throws Exception{
		int boardwidth =600;
		int boardHeight= boardwidth;
		
		JFrame frame = new JFrame("Snake");
		frame.setVisible(true);
		frame.setSize(boardwidth, boardHeight);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		SnakeGame snakeGame = new SnakeGame(boardwidth, boardHeight);
		frame.add(snakeGame);
		frame.pack();
		snakeGame.requestFocus();
	}

}
