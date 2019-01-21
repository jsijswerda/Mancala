package nl.sogyo.mancala;

abstract class Bowl
{
	
	protected int numberOfStones;
	protected Bowl neighbour;
	
	protected Player owner;
	protected int bowlNumber;
	
	public Bowl() {}
	
	public Bowl getNeighbour() {
		return neighbour;
	}
	
	public Bowl getBowlNumberX(int x) {
		if (x == 1)
			return this;
		else {
			x--;
			return getBowlNumberX(x);
		}
	}
	
	
	
	
		
	
	
	
	

	

	






    
	
	
	
}
