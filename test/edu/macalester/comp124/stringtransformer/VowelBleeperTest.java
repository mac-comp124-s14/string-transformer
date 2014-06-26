package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelBleeperTest {
    
    private final StringTransformer censor = new VowelBleeper();
    
    @Test
    public void handlesEmptyString() {
        assertEquals("", censor.transform(""));
    }
    
    @Test
    public void capitalizesAll() {
        assertEquals("*****", censor.transform("aeiou"));
        assertEquals("*****", censor.transform("AEIOU"));
    }
}
