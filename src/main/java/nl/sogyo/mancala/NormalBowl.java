package nl.sogyo.mancala;

public class NormalBowl extends Bowl{
	
	private final int STARTING_STONES = 4;
	
	
	//first bowl
	public NormalBowl() {
		Player player = new Player(true);
		setNumberOfStones(STARTING_STONES);
		owner = player;
		bowlNumber = 1;
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
		else if (countBowls > 6 && countBowls < 13)
			neighbour = new NormalBowl(player,countBowls+1,startBowl);
		else if (countBowls == 13) 
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
	
	public int stepsToFindKalaha() {
		if (getNeighbour() instanceof Kalaha)
			return 1;
		else
			return 1 + ((NormalBowl) getNeighbour()).stepsToFindKalaha();
	
	}

	public boolean checkIfEmptyBowl() {
		return this.getNumberOfStones() == 0;
	}

	public void distributeStones(int stonesToBePassed) {
		
		if (stonesToBePassed > 1) {
			setNumberOfStones(getNumberOfStones()+1);
			stonesToBePassed--;
			getNeighbour().distributeStones(stonesToBePassed);
		}
				
		else if (stonesToBePassed == 1) {
			
			setNumberOfStones(getNumberOfStones()+1);
			stonesToBePassed--;
			if (this.getNumberOfStones() == 1 && this.owner.getHasTurn()) {
				steal();
			}
			owner.changeTurn();
		}
		
	}
	
	public Bowl getOppositeBowl() {
		int stepsToKalaha = stepsToFindKalaha();
		return getBowlNumberX(2*stepsToKalaha+1);
	}
	
	public void steal() {
		Bowl oppositeBowl = getOppositeBowl();
		int stolenStones = oppositeBowl.getNumberOfStones();
		oppositeBowl.setNumberOfStones(0);
		this.setNumberOfStones(getNumberOfStones() + stolenStones);
	}


	


}
