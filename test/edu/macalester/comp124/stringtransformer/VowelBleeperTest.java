package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Kim eng on 2/27/14.
 */
public class VowelBleeperTest {
    private final StringTransformer capitalizer = new VowelBleeper();

    @Test
    public void handlesEmptyString() {
        assertEquals("", capitalizer.transform(""));
    }

    @Test
    public void capitalizesAll() {
        assertEquals("*", capitalizer.transform("a"));
        assertEquals("*", capitalizer.transform("A"));
    }
}
