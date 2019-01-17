package nl.sogyo.mancala;

abstract class Bowl
{
	
	protected int NumberOfBeads;
	protected Bowl neighbour;
	private Bowl oppositeBowl;
	protected Player owner;
	
	
	
	
	
	
	public void distributeBeads(int n) {
		Bowl next = getNeighbour();
		next.NumberOfBeads += 1;
	}
	
	public int getNumberOfBeads(){
		return NumberOfBeads;
	}
	
	
	public Player getPlayer() {
		return owner;
	}
	
	public void setNeighbour (Bowl neighbour) {
		this.neighbour = neighbour;
	}

	public Bowl getNeighbour() {
		return neighbour;
	}
	
	
	
	public Bowl getOppositeBowl() {
		oppositeBowl = neighbour.oppositeBowl;
		return oppositeBowl;
	}
	






    
	
	
	
}
