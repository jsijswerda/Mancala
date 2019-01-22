package nl.sogyo.mancala;

import org.junit.Assert;
import org.junit.Test;

public class NormalBowlTest {
	

    @Test
    public void fourBeadsinNormalBowl() {
    	Bowl normalbowl = new NormalBowl();
    	Assert.assertEquals(4, normalbowl.numberOfStones);
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
    	Assert.assertEquals(0, bowl.numberOfStones);
   
    }
    
    @Test
    public void hasNeighbour() {
    	
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertEquals(2,bowl1.getNeighbour().bowlNumber);
    	
    }
    
    @Test
    public void bowlsAreinChain() {
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertEquals(7,bowl1.getNeighbour().getNeighbour().getNeighbour().
    			getNeighbour().getNeighbour().getNeighbour().bowlNumber);
    }
    

    
    @Test
    public void kalahaKnowsFirstBowl () {
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertEquals(bowl1.getNeighbour().getNeighbour().getNeighbour().getNeighbour().
    			getNeighbour().getNeighbour().getNeighbour().getNeighbour().getNeighbour()
    			.getNeighbour().getNeighbour().getNeighbour().getNeighbour(), bowl1);
    }
    
    @Test
    public void kalahaKnowsFirstBowl_X () {
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertEquals(bowl1.getBowlNumberX(14), bowl1);
    }
    
    @Test
    public void findNextNormalBowlAfterKalaha() {
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertTrue(bowl1.getNeighbour().getNeighbour().getNeighbour().getNeighbour().
    			getNeighbour().getNeighbour().getNeighbour() instanceof NormalBowl);
    }
    
    @Test
    public void distributeStones() {
    	NormalBowl bowl1 = new NormalBowl();
    	Bowl bowl2 = bowl1.getBowlNumberX(2);
    	((NormalBowl) bowl2).doMove();
    	Assert.assertEquals(0, bowl2.numberOfStones);
    	Assert.assertEquals(5, bowl1.getBowlNumberX(3).numberOfStones);
    	Assert.assertEquals(5, bowl1.getBowlNumberX(4).numberOfStones);
    	Assert.assertEquals(5, bowl1.getBowlNumberX(5).numberOfStones);
    	Assert.assertEquals(5, bowl1.getBowlNumberX(6).numberOfStones);
    }
    
    @Test
    public void distributeStonesEndinKalaha() {
    	NormalBowl bowl1 = new NormalBowl();
    	Bowl bowl3 = bowl1.getBowlNumberX(3);
    	((NormalBowl) bowl3).doMove();
    	Assert.assertEquals(0, bowl3.numberOfStones);
    	Assert.assertEquals(5, bowl1.getBowlNumberX(4).numberOfStones);
    	Assert.assertEquals(5, bowl1.getBowlNumberX(5).numberOfStones);
    	Assert.assertEquals(5, bowl1.getBowlNumberX(6).numberOfStones);
    	Assert.assertEquals(1, bowl1.getBowlNumberX(7).numberOfStones);
    }

}
