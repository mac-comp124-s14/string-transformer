package edu.macalester.comp124.stringtransformer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by KevinTang on 2/27/14.
 */
public class CapitalizerTest {
        private final StringTransformer firstlettercapitalizer = new Capitalizer();

        @Test
        public void handlesEmptyString() {
            assertEquals("", firstlettercapitalizer.transform(""));
        }

        @Test
        public void firstlettercapitalized() {
            assertEquals("Zongle", firstlettercapitalizer.transform("zongle"));
            assertEquals("There", firstlettercapitalizer.transform("there"));
        }
    }
