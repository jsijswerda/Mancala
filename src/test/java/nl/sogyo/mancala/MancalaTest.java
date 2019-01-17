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
    	NormalBowl[] bowls = new NormalBowl[4];
    	for (int i=0;i<bowls.length;i++)
    		bowls[i] = new NormalBowl(); 
    	int n = bowls[0].doMove();
    	
    	Assert.assertEquals(4, n);
    	Assert.assertEquals(0, bowls[0].NumberOfBeads);
   
    }
    
    @Test
    public void checkStartPositions() {
    	Player player = new Player();
    	
    	NormalBowl[] playerbowls = new NormalBowl[12];
    	for (int i=0;i<playerbowls.length;i++)
    		playerbowls[i] = new NormalBowl();
    	
    	Kalaha[] kalahas = new Kalaha[2];
    	for (int i=0;i<kalahas.length;i++)
    		kalahas[i] = new Kalaha(player);
    	
    	Assert.assertEquals(0, kalahas[0].NumberOfBeads);
    	Assert.assertEquals(4, playerbowls[9].NumberOfBeads);
    }
    @Test
    public void BowlKnowsNeighbour() {
    	Bowl test = new NormalBowl();
    	Bowl neighbour = test.getNeighbour();
    	Assert.assertEquals(test, neighbour.getNeighbour());
    		
    }
    
    
    



}
