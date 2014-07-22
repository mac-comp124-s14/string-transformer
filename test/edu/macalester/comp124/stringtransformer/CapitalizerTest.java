package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lnorman on 2/27/14.
 */
public class CapitalizerTest {
    private final StringTransformer capitalizer = new Capitalizer();

    @Test
    public void handlesEmptyString() {
        assertEquals("", capitalizer.transform(""));
    }

    @Test
    public void capitalizesAll() {
        assertEquals("A", capitalizer.transform("a"));
        assertEquals("Zongle", capitalizer.transform("zongle"));
    }
}


