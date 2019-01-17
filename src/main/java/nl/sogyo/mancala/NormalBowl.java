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
	public int Move(NormalBowl bowl) {
		int number = bowl.NumberOfBeads;
		bowl.NumberOfBeads = 0;
		return number;
	}
	
	public boolean CheckIfEmptyBowl() {
		return this.NumberOfBeads == 0;
	}
	public void AddAllBeads() {}
	public void Steal() {}

}
