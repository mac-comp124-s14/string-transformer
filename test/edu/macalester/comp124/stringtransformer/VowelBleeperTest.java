package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by jgraham2 on 2/27/14.
 */
public class VowelBleeperTest {

    private final StringTransformer censorer = new VowelBleeper();

    @Test
    public void handlesEmptyString(){
        assertEquals("",censorer.transform(""));

    }

    @Test
    public void someExamples(){
        assertEquals("J*hn",censorer.transform("John"));
        assertEquals("J*hn",censorer.transform("JOhn"));

    }
}
