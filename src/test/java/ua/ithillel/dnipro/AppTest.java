package ua.ithillel.dnipro;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Before;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    App vol;

    @Before
    public void setUp() throws Exception{
        vol = new App();
    }
//    @org.junit.Test
//    public void testVolume() throws Exception{
//        assertEquals(8.0, vol.volume(2));
//    }

    @org.junit.Test
    public void testVolume() throws Exception{
        assertEquals(24.0, vol.volume(2,3,4));
    }
}
