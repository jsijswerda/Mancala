package nl.sogyo.mancala;

public class Player {
	
	protected Player Opponent;
	private boolean isItMyTurn;
	private boolean isWinner;
	
	public Player(){}
	
	public boolean isItMyTurn() {
		return false;
	}

	public void nextTurn() {}
	public void notNextTurn() {}
}
