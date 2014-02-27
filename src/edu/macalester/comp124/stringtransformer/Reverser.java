package edu.macalester.comp124.stringtransformer;

import java.util.List;
import java.util.Random;

public class Reverser extends StringTransformer {


    /**
     * Reverses the string.
     * @param s The input string.
     * @return The reverse of the input string
     */

    @Override
    public String transform(String s) {
        return new StringBuffer(s).reverse().toString();
     }

    /**
     * Returns a description of the Reverser class.
     * @return The description.
     */
    
    @Override
    public String toString() {
        return "Reverses each word in the string";
    }
}
