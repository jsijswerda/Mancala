package nl.sogyo.mancala;

public class Kalaha extends Bowl {

	private final int STARTING_STONES = 0;
	
	
	public Kalaha(Player player, int countBowls, Bowl startingBowl) {
		numberOfStones = STARTING_STONES;
		this.owner = player;
		this.bowlNumber = countBowls;
		this.neighbour = new NormalBowl(player.getOpponent(),countBowls+1,startingBowl);
		
	}
	
	public Kalaha(Player player, Bowl startBowl) {
		numberOfStones = STARTING_STONES;
		this.owner = player;
		this.neighbour = startBowl;
		
	}
	
	public void distributeStones(int stonesToBePassed) {
		if (this.owner.getHasTurn() && stonesToBePassed > 1) {
			getNeighbour().numberOfStones++;
			stonesToBePassed--;
			getNeighbour().distributeStones(stonesToBePassed);
			
		}
	}
	


	

	

}
