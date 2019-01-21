package nl.sogyo.mancala;

public class Player {
	protected boolean hasTurn;
	protected Player opponent;



	
	public Player(boolean hasTurn){
		this.hasTurn = hasTurn;
		this.opponent = new Player(this);
	}
	
	public Player(Player otherPlayer) {
		this.hasTurn = false;
		this.opponent = otherPlayer;
		
	}
	
	public Player getOpponent() {
		return opponent;
	}
	


}
