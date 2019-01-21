package nl.sogyo.mancala;

public class NormalBowl extends Bowl{
	
	private final int STARTING_STONES = 4;
	
	
	//first bowl
	public NormalBowl() {
		Player player = new Player(true);
		numberOfStones = STARTING_STONES;
		owner = player;
		
		this.bowlNumber = 1;
		neighbour = new NormalBowl(player, bowlNumber+1, this);
	}
	
	//all other bowls
	public NormalBowl(Player player, int countBowls, Bowl startingBowl) {
		numberOfStones = STARTING_STONES;
		owner = player;
		bowlNumber = countBowls;
		
				
		if (countBowls < 6) 
			neighbour = new NormalBowl(player,countBowls+1,startingBowl); 	
		
		else if (countBowls == 6) 
			neighbour = new Kalaha(player,countBowls+1, startingBowl);
		else if (countBowls > 6 && countBowls < 12)
			neighbour = new NormalBowl(player,countBowls+1,startingBowl);
		else if (countBowls == 12) 
			neighbour = new Kalaha(player, startingBowl);
		
		
	}

	
	

	public int doMove() {
		int number = this.numberOfStones;
		this.numberOfStones = 0;
		return number;
	}
	
	public boolean checkIfEmptyBowl() {
		return this.numberOfStones == 0;
	}




	


}
