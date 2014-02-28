package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Monica on 2/27/14.
 */
public class PiratizerTest {
    private final StringTransformer pirates = new Piratizer();

    @Test
    public void handlesEmptyString() {
        assertEquals("", pirates.transform(""));
    }

    @Test
    public void testRRRs(){
        assertEquals("Herrre arrre rrrs.", pirates.transform("Here are rs."));
    }
}
