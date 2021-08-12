package tictactoe;


import model.Game.SIDE;

public interface Controller {

	public void boardClick(int x, int y);

	public void startButtonPressed(SIDE side);
}
	
