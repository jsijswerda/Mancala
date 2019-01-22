package nl.sogyo.mancala;

import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
	
    @Test
    public void PlayersAreDifferent() {
    	NormalBowl bowl1 = new NormalBowl();
    	Assert.assertNotEquals("Players are the same", bowl1.getBowlNumberX(7).owner, bowl1.getBowlNumberX(8).owner);
    }
    
    @Test
    public void PlayerHasOpponent() {
    	Player player = new Player(true);
    	Assert.assertEquals(player.getOpponent().getOpponent(),player);
    }
    
    @Test
    public void ChangeTurns() {
    	Player player = new Player(true);
    	
    	player.changeTurn();
    	
    	Assert.assertFalse(player.getHasTurn());
    	Assert.assertTrue(player.getOpponent().getHasTurn());
    	
    }

}
