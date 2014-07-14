package edu.macalester.comp124.stringtransformer;

/**
 * Created by twakin on 2/27/14.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnoopifierTest {

    private final StringTransformer snoopifier = new Snoopifier();

    @Test
    public void handlesEmptyString() {
        assertEquals("", snoopifier.transform(""));
    }

    @Test
    public void snoopifiesAll() {
        assertEquals("mizzle", snoopifier.transform("midas"));
        assertEquals("homie", snoopifier.transform("he"));
        assertEquals("was", snoopifier.transform("were"));
        assertEquals("were", snoopifier.transform("was"));
    }
}