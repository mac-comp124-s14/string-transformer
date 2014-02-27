package edu.macalester.comp124.stringtransformer;

import acm.util.RandomGenerator;

import java.util.Scanner;

/**
 * Created by Barbara B on 2/27/14.
 */
public class Piratizer extends StringTransformer {


    public String finishSentence(String s) {
        RandomGenerator rgen = new RandomGenerator();
        int result = rgen.nextInt(1,8);


            switch(result) {
                case 1: return s + " Arrrrr!";
                case 2: return s + " Ahoy!";
                default: return s;
            }

    }


    @Override
    public String transformEachWord(String in) {
        Scanner wordScanner = new Scanner(in).useDelimiter("[.!?]");
        StringBuilder out = new StringBuilder();
        int prevEnd = 0;
        while(wordScanner.hasNext()) {
            String word = wordScanner.next();
            out.append(in.substring(prevEnd, wordScanner.match().start()));
            out.append(transform(word));
            prevEnd = wordScanner.match().end();
        }
        out.append(in.substring(prevEnd));
        return out.toString();
    }


    @Override
    public String transform(String s) {
        s = s.replaceAll("r", "rrr");
        s = finishSentence(s);

        return s;
    }

    @Override
    public String toString() {
        return "Piratized";
    }
}