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
			return neighbour.getBowlNumberX(--x);
		}
		
		
	}
	
	public void distributeStones(int stonesToBePassed) {
		
		if (stonesToBePassed > 1) {
			numberOfStones++;
			stonesToBePassed--;
			getNeighbour().distributeStones(stonesToBePassed);
		}
				
		else {
			numberOfStones++;
			stonesToBePassed--;
		}
		
	}
	
	
		
	
	
	
	

	

	






    
	
	
	
}
