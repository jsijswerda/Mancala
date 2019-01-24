package nl.sogyo.mancala;

abstract class Bowl
{
	
	private int numberOfStones;
	protected Bowl neighbour;
	protected Player owner;
	protected int bowlNumber;
	
	public Bowl() {}
	
	public Bowl getNeighbour() {
		return neighbour;
	}
	
	public int getNumberOfStones() {
		return numberOfStones;
	}
	
	public void setNumberOfStones(int numberOfStones) {
		this.numberOfStones = numberOfStones;
	}
	
	public Bowl getBowlNumberX(int x) {
		if (x == 1)
			return this;
		else {
			return neighbour.getBowlNumberX(x-1);
		}
		
		
	}
	
	public boolean checkIfEmptyBowl() {
		return this.getNumberOfStones() == 0;
	}
	
	public boolean checkEndGame() {
		for (int i = 1;i<15;i++) {
			if (getBowlNumberX(i) instanceof NormalBowl && getBowlNumberX(i).owner.getHasTurn()) {
				if (!getBowlNumberX(i).checkIfEmptyBowl())
					return false;
			}
			
		}
		return true;
	}

	public abstract void distributeStones(int stonesToBePassed);
	



	
	
		
	
	
	
	

	

	






    
	
	
	
}
