package nl.sogyo.mancala;

import org.junit.Assert;
import org.junit.Test;

public class MancalaTest {

    @Test
    public void NumberofBeadsinKalaha()
    {
        Bowl kalaha = new Kalaha();
        Assert.assertEquals(0, kalaha.NumberOfBeads);
        
    }

    @Test
    public void NumberofBeadsinNormalBowl() {
    	Bowl Normalbowl = new NormalBowl();
    	Assert.assertEquals(4, Normalbowl.NumberOfBeads);
    }
    
    @Test
    public void CheckEmptyBowl() {
    	Bowl normalbowl = new NormalBowl();
    	//Assert.assertFalse(normalbowl.CheckIfEmptyBowl());
    }


}
