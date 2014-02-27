package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by iangoodbar on 2/27/14.
 */
public class L33tTest {
    private final StringTransformer l33t = new L33t();

    @Test
    public void handlesEmptyString() {
        assertEquals("", l33t.transform(""));

    }
    @Test
    public void convertToL33t() {
        assertEquals("4", l33t.transform("A"));
        assertEquals("4", l33t.transform("a"));
        assertEquals("1337", l33t.transform("leet"));
        assertEquals("4pp13", l33t.transform("apple"));
        assertEquals("411y0ur84554r38310ng70u5", l33t.transform("allyourbassarebelongtous"));
    }
}
