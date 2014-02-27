package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverserTest {
    
    private final StringTransformer reverser = new Reverser();
    
    @Test
    public void handlesEmptyString() {
        assertEquals("", reverser.transform(""));
    }
    
    @Test
    public void scrablesAll() {
        assertEquals("pleH", reverser.transform("Help"));
        assertEquals("haaaalb", reverser.transform("blaaaah"));
    }
}
