package nl.sogyo.mancala;

abstract class Bowl
{
	
	protected int NumberOfBeads;
	protected Bowl neighbour;
	private Bowl oppositeBowl;
	protected Player owner;
	
		
	
	
	
	

	
	public int getNumberOfBeads(){
		return NumberOfBeads;
	}
	
	
	public Player getPlayer() {
		return owner;
	}
	

	public Bowl getNeighbour() {
		return neighbour;
	}
	
	
	
	public Bowl getOppositeBowl() {
		oppositeBowl = neighbour.oppositeBowl;
		return oppositeBowl;
	}
	






    
	
	
	
}
