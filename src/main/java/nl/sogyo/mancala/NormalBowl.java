package nl.sogyo.mancala;

public class NormalBowl extends Bowl{
	
	private final int STARTING_STONES = 4;
	
	
	//first bowl
	public NormalBowl() {
		Player player = new Player(true);
		setNumberOfStones(STARTING_STONES);
		owner = player;
		
		this.bowlNumber = 1;
		neighbour = new NormalBowl(player, bowlNumber+1, this);
	}
	
	//all other bowls
	public NormalBowl(Player player, int countBowls, Bowl startBowl) {
		setNumberOfStones(STARTING_STONES);
		owner = player;
		bowlNumber = countBowls;
		
				
		if (countBowls < 6) 
			neighbour = new NormalBowl(player,countBowls+1,startBowl); 	
		else if (countBowls == 6) 
			neighbour = new Kalaha(player,countBowls+1, startBowl);
		else if (countBowls > 6 && countBowls < 12)
			neighbour = new NormalBowl(player,countBowls+1,startBowl);
		else if (countBowls == 12) 
			neighbour = new Kalaha(player, startBowl);
		
		
	}

	
	

	public int doMove() throws Exception {
		if (this.owner.getHasTurn()) {
			int stonesToDistribute = this.getNumberOfStones();
			emptyBowl();
			getNeighbour().distributeStones(stonesToDistribute);
			return stonesToDistribute;
		}
		else {
			throw new Exception("You can't do a move from this bowl");
		}
	}
	
	
	public void emptyBowl() {
		this.setNumberOfStones(0);
	}
	

	
	public boolean checkIfEmptyBowl() {
		return this.getNumberOfStones() == 0;
	}




	


}
