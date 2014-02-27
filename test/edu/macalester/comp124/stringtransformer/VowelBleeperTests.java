package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tony on 2/27/14.
 */
public class VowelBleeperTests {

    private final StringTransformer ident = new VowelBleeper();

    @Test
    public void handlesEmptyString() {
        assertEquals("", ident.transform(""));
    }

    @Test
    public void leavesEverythingAlone() {
        assertEquals("*", ident.transform("a"));
        assertEquals("z*nGl*", ident.transform("zonGle"));
    }
}
