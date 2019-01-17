package nl.sogyo.mancala;

import org.junit.Assert;
import org.junit.Test;

public class MancalaTest {

    @Test
    public void zeroBeadsinKalaha()
    {	Player player = new Player();
        Bowl kalaha = new Kalaha(player);
        Assert.assertEquals(0, kalaha.NumberOfBeads);
        
    }

    @Test
    public void fourBeadsinNormalBowl() {
    	Bowl normalbowl = new NormalBowl();
    	Assert.assertEquals(4, normalbowl.NumberOfBeads);
    }
    
    @Test
    public void checkEmptyBowl() {
    	NormalBowl normalBowl = new NormalBowl();
    	Assert.assertFalse(normalBowl.checkIfEmptyBowl());
    }
    
    @Test
    public void checkMove() {
    	NormalBowl bowl = new NormalBowl();

    	int n = bowl.doMove();
    	
    	Assert.assertEquals(4, n);
    	Assert.assertEquals(0, bowl.NumberOfBeads);
   
    }
    
    @Test
    public void checkStartPositions() {
    	Player player = new Player();
    	
    	NormalBowl playerbowl = new NormalBowl();

    	
    	Kalaha kalaha = new Kalaha(player);

    	
    	Assert.assertEquals(0, kalaha.NumberOfBeads);
    	Assert.assertEquals(4, playerbowl.NumberOfBeads);
    }
    @Test
    public void BowlKnowsNeighbour() {
    	Bowl bowl = new NormalBowl();
    	Bowl neighbour = bowl.getNeighbour();
    	Assert.assertEquals(bowl, neighbour.getNeighbour());
    		
    }
    
 
}
