package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by bpolonsk on 2/27/14.
 */
public class ReverserTest {
    private final StringTransformer reverser = new Reverser();

    @Test
    public void handlesEmptyString() {
        assertEquals("", reverser.transform(""));
    }

    @Test
    public void reversesAll() {
        assertEquals("Aaa", reverser.transform("aaA"));
        assertEquals("ZONGLE", reverser.transform("ELGNOZ"));
        assertEquals("SATORROTAS", reverser.transform("SATORROTAS"));
    }
}
