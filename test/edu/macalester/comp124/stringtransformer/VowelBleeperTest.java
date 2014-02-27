package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by RLP on 2/27/14.
 */
public class VowelBleeperTest {
    @Test
    public void stringEval() {
        StringTransformer test = new VowelBleeper();
        assertEquals("*v*l**t**n", test.transform("Evaluation"));
    }
}
