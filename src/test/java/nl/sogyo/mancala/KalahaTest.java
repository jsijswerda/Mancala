package nl.sogyo.mancala;

import org.junit.Assert;
import org.junit.Test;

public class KalahaTest {
	
    @Test
    public void zeroBeadsinKalaha()
    {	Player player = new Player(true);
    	NormalBowl bowl = new NormalBowl();
        Bowl kalaha = new Kalaha(player, 1, bowl);
        Assert.assertEquals(0, kalaha.numberOfStones);
        
    }
    
    @Test
    public void findKalaha() {
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertTrue(bowl1.getNeighbour().getNeighbour().getNeighbour().getNeighbour().
    			getNeighbour().getNeighbour() instanceof Kalaha);
    }

}
