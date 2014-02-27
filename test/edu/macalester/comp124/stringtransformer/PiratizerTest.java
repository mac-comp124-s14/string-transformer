package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PiratizerTest {
    
    private final StringTransformer pirate = new Piratizer();
    
    @Test
    public void handlesEmptyString() {
        assertEquals("", pirate.transform(""));
    }
    
    @Test
    public void capitalizesAll() {
        assertEquals("r", pirate.transform("rrr"));
    }
}
