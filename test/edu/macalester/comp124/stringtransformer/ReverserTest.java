package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ReverserTest {

    private final StringTransformer reverse = new Reverser();

    @Test
    public void handlesEmptyString() {
        assertEquals("", reverse.transform(""));
    }

    @Test
    public void reversesString() {
        assertEquals("tca", reverse.transform("act"));
        assertEquals("elGnoz", reverse.transform("zonGle"));
    }
}

