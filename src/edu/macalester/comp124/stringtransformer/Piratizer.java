package edu.macalester.comp124.stringtransformer;

/**
 * Created by Barbara B on 2/27/14.
 */
public class Piratizer extends StringTransformer {

    @Override
    public String transform(String s) {
        
        return s.toUpperCase();
    }

    @Override
    public String toString() {
        return "All capitalized";
    }
}