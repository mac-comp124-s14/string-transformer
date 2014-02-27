package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Barbara B on 2/27/14.
 */
public class VowelBleeperTest {

    private final StringTransformer vowelBleeper = new VowelBleeper();

    @Test
    public void handlesEmptyString() {
        assertEquals("", vowelBleeper.transform(""));
    }

    @Test
    public void capitalizesAll() {
        assertEquals("*", vowelBleeper.transform("A"));
        assertEquals("Z*NGL*", vowelBleeper.transform("ZONGLE"));
        assertEquals("b*bbl*", vowelBleeper.transform("bubble"));
    }
}
