package edu.macalester.comp124.stringtransformer;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

/**
 * Created by rberman on 2/27/14.
 */
public class PiratizerTest {
    private final StringTransformer piratizer = new Piratizer();

    @Test
    public void handlesEmptyString() {
        assertEquals("", piratizer.transform(""));
    }

    @Test
    public void noSingleR() {
        assertEquals("rrr", piratizer.transform("r"));
        assertEquals("rrrobot", piratizer.transform("robot"));
    }

}
