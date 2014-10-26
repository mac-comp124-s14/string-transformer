package edu.macalester.comp124.stringtransformer;

import acm.util.RandomGenerator;

/**
 * Created by jyang4 on 2/27/14.
 */
public class Scrambler extends StringTransformer {

    @Override
    public String transform(String s) {
        RandomGenerator generator = new RandomGenerator();
        int len = s.length();
        //char randomChar = s.charAt(generator.nextInt(0,len-1));
        s = s.substring(0, s.charAt(generator.nextInt(0,len-1))) + s.substring(s.charAt(generator.nextInt(0,len-1)));

        return s.toUpperCase();
    }

    @Override
    public String toString() {
        return "Scrambler";
    }
}