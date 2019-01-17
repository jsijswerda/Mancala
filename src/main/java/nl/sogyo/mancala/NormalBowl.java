package nl.sogyo.mancala;

public class NormalBowl extends Bowl{
	
	private final int STARTING_BEADS = 4;
	
	
	public NormalBowl() {
		Player player = new Player();
		NumberOfBeads = STARTING_BEADS;
		this.owner = player;
		//this.neighbour = new NormalBowl();
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
