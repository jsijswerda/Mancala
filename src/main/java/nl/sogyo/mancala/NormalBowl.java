package nl.sogyo.mancala;

public class NormalBowl extends Bowl{
	
	private final int STARTING_STONES = 4;
	
	
	//first bowl
	public NormalBowl() {
		Player player = new Player(true);
		numberOfStones = STARTING_STONES;
		owner = player;
		
		this.bowlNumber = 1;
		neighbour = new NormalBowl(player, ++bowlNumber, this);
	}
	
	//all other bowls
	public NormalBowl(Player player, int countBowls, Bowl startBowl) {
		numberOfStones = STARTING_STONES;
		owner = player;
		bowlNumber = countBowls;
		
				
		if (countBowls < 6) 
			neighbour = new NormalBowl(player,++countBowls,startBowl); 	
		else if (countBowls == 6) 
			neighbour = new Kalaha(player,++countBowls, startBowl);
		else if (countBowls > 6 && countBowls < 12)
			neighbour = new NormalBowl(player,++countBowls,startBowl);
		else if (countBowls == 12) 
			neighbour = new Kalaha(player, startBowl);
		
		
	}

	
	

	public int doMove() {
		int stonesToDistribute = this.numberOfStones;
		emptyBowl();
		getNeighbour().distributeStones(stonesToDistribute);
		return stonesToDistribute;
	}
	
	
	public void emptyBowl() {
		this.numberOfStones = 0;
	}
	

	
	public boolean checkIfEmptyBowl() {
		return this.numberOfStones == 0;
	}




	


}
