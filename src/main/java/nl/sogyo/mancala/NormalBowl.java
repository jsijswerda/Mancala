package nl.sogyo.mancala;

public class NormalBowl extends Bowl{
	
	
	
	public NormalBowl() {
		
		NumberOfBeads = 4;
		
	}
	
	
	
	public boolean isFinished(NormalBowl[] bowls) {
		for (NormalBowl bowl : bowls) 
			if (bowl.NumberOfBeads == 0) 
				return true;
			
		
		return false;
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
