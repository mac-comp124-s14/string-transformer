package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RLP on 2/27/14.
 */
public class L33tTest {
    @Test
    public void stringEval() {
        StringTransformer test = new L33t();
        assertEquals("Ev4l", test.transform("Eval"));
    }
}