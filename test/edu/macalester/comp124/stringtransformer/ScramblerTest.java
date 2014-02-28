package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Marcus Ulmer on 2/27/14.
 */
public class ScramblerTest {
    private final StringTransformer scrambler = new Scrambler();
    /*I ended up doing mostly manual testing in a console program environment:
    I had a bunch of errors with length vs. index of arrays, so that was more suited.
    Couldn't figure out how to use || with strings, so testing options were pretty limited
    due to randomness.*/
    @Test
    public void dealsWithCaps() {
        assertEquals(("A"), scrambler.transform("A"));
    }

    @Test
    public void preservesString() {
        assertEquals("a", scrambler.transform("a"));
    }
}
