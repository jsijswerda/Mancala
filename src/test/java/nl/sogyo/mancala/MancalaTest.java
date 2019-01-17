package nl.sogyo.mancala;

import org.junit.Assert;
import org.junit.Test;

public class MancalaTest {

    @Test
    public void zeroBeadsinKalaha()
    {
        Bowl kalaha = new Kalaha();
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
    	NormalBowl[] bowls = new NormalBowl[4];
    	for (int i=0;i<bowls.length;i++)
    		bowls[i] = new NormalBowl(); 
    	int n = bowls[0].doMove();
    	
    	Assert.assertEquals(4, n);
    	Assert.assertEquals(0, bowls[0].NumberOfBeads);
   
    }
    
    @Test
    public void checkStartPositions() {
    	NormalBowl[] playerbowls = new NormalBowl[12];
    	for (int i=0;i<playerbowls.length;i++)
    		playerbowls[i] = new NormalBowl();
    	
    	Kalaha[] kalahas = new Kalaha[2];
    	for (int i=0;i<kalahas.length;i++)
    		kalahas[i] = new Kalaha();
    	
    	Assert.assertEquals(0, kalahas[0].NumberOfBeads);
    	Assert.assertEquals(4, playerbowls[7].NumberOfBeads);
    }
    @Test
    public void KnowsNeighbour() {
    	Bowl test = new NormalBowl();
    	Bowl firstcup = test.getNeighbour();
    	
    	
    }
    
    
/*    @Test
    public void checkDistribute() {
    	NormalBowl[] bowls = new NormalBowl[4];
    	for (int i=0;i<bowls.length;i++)
    		bowls[i] = new NormalBowl(); 
    	int n = bowls[0].doMove();
  	

    	bowls[0].distributeBeads(n);
    	Assert.assertEquals(5, bowls[1].NumberOfBeads);
    	
    }*/


}
