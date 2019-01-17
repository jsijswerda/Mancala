package nl.sogyo.mancala;

abstract class Bowl
{
	
	protected int NumberOfBeads;
	private Bowl nextBowl;
	private Bowl oppositeBowl = nextBowl.oppositeBowl;
	
	
	
	
	public void distribute(int n) {
		
	}
	
	




	public Bowl getNextBowl() {
		return nextBowl;
	}
	
	public Bowl getOppositeBowl() {
		return oppositeBowl;
	}





    
	
	
	
}
