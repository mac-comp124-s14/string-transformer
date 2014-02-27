package edu.macalester.comp124.stringtransformer;

import java.util.Random;

/**
 * Created by RLP on 2/27/14.
 */
public class Scrambler extends StringTransformer {
    private final Random rand = new Random();
    @Override
    public String transform(String s) {
        StringBuilder newStr = new StringBuilder();
        StringBuilder str = new StringBuilder(s);

        while (str.length() > 0) {
            int n = rand.nextInt(str.length());
            newStr.append(str.charAt(n));
            str.deleteCharAt(n);
        }
        return newStr.toString();
    }
    @Override
    public String toString(){
        return "Scrambled.";
    }
}
