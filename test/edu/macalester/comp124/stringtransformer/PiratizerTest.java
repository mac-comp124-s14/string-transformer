package edu.macalester.comp124.stringtransformer;

import static org.junit.Assert.assertEquals;

/**
 * Created by Huichang on 2/27/14.
 */
public class PiratizerTest {

    private final StringTransformer Piratizer = new Piratizer();

    public void handlesEmptyString() {
        assertEquals("", Piratizer.transform(""));
    }


}
