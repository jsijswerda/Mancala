package nl.sogyo.mancala;

import org.junit.Assert;
import org.junit.Test;

public class MancalaTest {

    @Test
    public void zeroBeadsinKalaha()
    {	Player player = new Player(true);
    	NormalBowl bowl = new NormalBowl();
        Bowl kalaha = new Kalaha(player, 1, bowl);
        Assert.assertEquals(0, kalaha.numberOfStones);
        
    }

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
    public void bowlsinChain() {
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertEquals(7,bowl1.getNeighbour().getNeighbour().getNeighbour().getNeighbour().getNeighbour().getNeighbour().bowlNumber);
    }
    
    @Test
    public void findKalaha() {
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertTrue(bowl1.getNeighbour().getNeighbour().getNeighbour().getNeighbour().
    			getNeighbour().getNeighbour() instanceof Kalaha);
    }
    
    @Test
    public void PlayerHasOpponent() {
    	Player player = new Player(true);
    	Assert.assertEquals(player.opponent.getOpponent(),player);
    }
    

 
}
