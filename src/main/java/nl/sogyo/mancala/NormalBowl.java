package nl.sogyo.mancala;

public class NormalBowl extends Bowl{
	
	private final int STARTING_STONES = 4;
	
	
	//first bowl
	public NormalBowl() {
		Player player = new Player();
		numberOfStones = STARTING_STONES;
		owner = player;
		
		this.bowlNumber = 1;
		neighbour = new NormalBowl(player, bowlNumber++);
	}
	
	//all other bowls
	public NormalBowl(Player player, int countBowls) {
		numberOfStones = STARTING_STONES;
		owner = player;
		bowlNumber = countBowls;
				
		while (countBowls++<6)
			neighbour = new NormalBowl(player,countBowls);
	}
	@Override
	public Bowl getNeighbour() {
		return neighbour;
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
