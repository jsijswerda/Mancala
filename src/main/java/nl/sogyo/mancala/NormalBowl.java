package nl.sogyo.mancala;

public class NormalBowl extends Bowl{
	
	private final int STARTING_BEADS = 4;
	
	//first bowl
	public NormalBowl() {
		Player player = new Player();
		NumberOfBeads = STARTING_BEADS;
		owner = player;
		int countBowls = 1;
		neighbour = new NormalBowl(player, countBowls);
	}
	
	public NormalBowl(Player player, int countBowls) {
		NumberOfBeads = STARTING_BEADS;
		owner = player;
		//neighbour = new NormalBowl(player,countBowls);
		
	}
	
	
	

	public int doMove() {
		int number = this.NumberOfBeads;
		this.NumberOfBeads = 0;
		return number;
	}
	
	public boolean checkIfEmptyBowl() {
		return this.NumberOfBeads == 0;
	}
	public void addAllBeads() {}
	public void steal() {}



	


}
