package nl.sogyo.mancala;

import org.junit.Assert;
import org.junit.Test;

public class NormalBowlTest {
	

    @Test
    public void fourBeadsinNormalBowl() {
    	Bowl normalbowl = new NormalBowl();
    	Assert.assertEquals(4, normalbowl.getNumberOfStones());
    }
    
    @Test
    public void checkEmptyBowl() {
    	NormalBowl normalBowl = new NormalBowl();
    	Assert.assertFalse(normalBowl.checkIfEmptyBowl());
    }
    
    @Test
    public void checkMove() throws Exception {
    	NormalBowl bowl = new NormalBowl();

    	int n = bowl.doMove();
    	
    	Assert.assertEquals(4, n);
    	Assert.assertEquals(0, bowl.getNumberOfStones());
   
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
    			.getNeighbour().getNeighbour().getNeighbour().getNeighbour().getNeighbour(), bowl1);
    }
    
    @Test
    public void kalahaKnowsFirstBowl_X () {
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertEquals(bowl1.getBowlNumberX(14).getNeighbour(), bowl1);
    }
    
    @Test
    public void findNextNormalBowlAfterKalaha() {
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertTrue(bowl1.getNeighbour().getNeighbour().getNeighbour().getNeighbour().
    			getNeighbour().getNeighbour().getNeighbour() instanceof NormalBowl);
    }
    
    @Test
    public void distributeStones() throws Exception {
    	NormalBowl bowl1 = new NormalBowl();
    	Bowl bowl2 = bowl1.getBowlNumberX(2);
    	((NormalBowl) bowl2).doMove();
    	Assert.assertEquals(0, bowl2.getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(3).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(4).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(5).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(6).getNumberOfStones());
    	Assert.assertEquals(0, bowl1.getBowlNumberX(7).getNumberOfStones());
    }
    
    @Test
    public void distributeStonesEndinKalaha() throws Exception {
    	NormalBowl bowl1 = new NormalBowl();
    	Bowl bowl3 = bowl1.getBowlNumberX(3);
    	((NormalBowl) bowl3).doMove();
    	Assert.assertEquals(0, bowl3.getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(4).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(5).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(6).getNumberOfStones());
    	Assert.assertEquals(1, bowl1.getBowlNumberX(7).getNumberOfStones());
    	Assert.assertTrue(bowl1.owner.getHasTurn());
    	Assert.assertFalse(bowl1.owner.getOpponent().getHasTurn());
    	
    }

    @Test
    public void distributeStonesEndinBowlOtherPlayer() throws Exception {
    	NormalBowl bowl1 = new NormalBowl();
    	Bowl bowl5 = bowl1.getBowlNumberX(5);
    	((NormalBowl) bowl5).doMove();
    	Assert.assertEquals(0, bowl5.getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(6).getNumberOfStones());
    	Assert.assertEquals(1, bowl1.getBowlNumberX(7).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(8).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(9).getNumberOfStones());
    	Assert.assertFalse(bowl1.owner.getHasTurn());
    	Assert.assertTrue(bowl1.owner.getOpponent().getHasTurn());
    }
    
    @Test(expected = Exception.class)
    public void testException() throws Exception {
    	NormalBowl bowl1 = new NormalBowl();
    	Bowl bowl9 = bowl1.getBowlNumberX(9);
    	((NormalBowl) bowl9).doMove();
    	
    	
    }
    
    @Test
    public void bowlFindsKalaha() {
    	NormalBowl bowl1 = new NormalBowl();
    	int steps = bowl1.stepsToFindKalaha();
    	Assert.assertEquals(6, steps);
    			
    }
    
    @Test
    public void findOppositeBowl() {
    	NormalBowl bowl1 = new NormalBowl();
    	Bowl bowl13 = bowl1.getOppositeBowl();
    	Assert.assertEquals(bowl1.getBowlNumberX(13), bowl13);
    }
    
    @Test
    public void checkSteal() throws Exception {
    	NormalBowl bowl1 = new NormalBowl();
    	Bowl bowl6 = bowl1.getBowlNumberX(6);
    	bowl1.setNumberOfStones(0);
    	bowl6.setNumberOfStones(8); 
    	((NormalBowl) bowl6).doMove();
    	Assert.assertEquals(1, bowl1.getBowlNumberX(7).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(8).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(9).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(10).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(11).getNumberOfStones());
    	Assert.assertEquals(5, bowl1.getBowlNumberX(12).getNumberOfStones());
    	Assert.assertEquals(0, bowl1.getBowlNumberX(13).getNumberOfStones());
    	Assert.assertEquals(0, bowl1.getBowlNumberX(14).getNumberOfStones());
    	Assert.assertEquals(6, bowl1.getNumberOfStones());
    	}
    	
    @Test
    public void testAllBeginStones() {
    	Bowl bowl1 = new NormalBowl();
    	Bowl bowl13 = bowl1.getBowlNumberX(13);
    	Assert.assertEquals(4, bowl13.getNumberOfStones());
    	
    } 
    	

    
    	
    	
}
    

