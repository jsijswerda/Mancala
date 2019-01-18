package nl.sogyo.mancala;

public class NormalBowl extends Bowl{
	
	private final int STARTING_STONES = 4;
	protected int bowlNumber;
	
	//first bowl
	public NormalBowl() {
		Player player = new Player();
		numberOfStones = STARTING_STONES;
		owner = player;
		int countBowls = 1;
		bowlNumber = countBowls;
		neighbour = new NormalBowl(player, countBowls);
	}
	
	public NormalBowl(Player player, int countBowls) {
		numberOfStones = STARTING_STONES;
		owner = player;
		int count = countBowls;
		bowlNumber = countBowls;
		
		while (count++<6)
			neighbour = new NormalBowl(player,count);
		
		
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
