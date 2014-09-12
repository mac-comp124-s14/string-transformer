package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by AustinKim on 2/27/14.
 */
public class SnoopifierTest {
    private final StringTransformer dawg=new Snoopifier();


    @Test
    public void handlesEmptyString() {
        assertEquals("", dawg.transform(""));
    }
    @Test
    public void snooopTest(){
        assertEquals("i", dawg.transform("i"));
        assertEquals("Mizzle", dawg.transform("Midas"));
        assertEquals("was", dawg.transform("were"));
        assertEquals("were", dawg.transform("was"));
    }
}
