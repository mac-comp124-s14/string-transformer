package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Barbara B on 2/27/14.
 */

public class PiratizerTest {

    private final StringTransformer piratizer = new Piratizer();


    @Test
    public void piratizes() {
        assertEquals("errra", piratizer.transform("era"));
        assertEquals("pirrrate", piratizer.transform("pirate"));
    }
}
