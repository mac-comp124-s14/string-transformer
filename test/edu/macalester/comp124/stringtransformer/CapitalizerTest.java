package edu.macalester.comp124.stringtransformer;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CapitalizerTest {
    private final StringTransformer capitalize = new Capitalizer();

    @Test
    public void handlesEmptyString() {
        assertEquals("", capitalize.transform(""));
    }

    @Test
    public void capitalizeFirstLetter() {
        assertEquals("Act", capitalize.transform("act"));
        assertEquals("ZonGle", capitalize.transform("zonGle"));
    }
}
