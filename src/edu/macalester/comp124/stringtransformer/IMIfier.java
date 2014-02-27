package edu.macalester.comp124.stringtransformer;

import java.util.Random;

/**
 * Created by willkentdaggett on 2/27/14.
 */
public class IMIfier extends StringTransformer {
    private final Random rand = new Random();
    private enum PHRASE {
        LOL, LMAO, OMG, JK, ROFL
    }

    private String randomPhrase() {
        int pick = new Random().nextInt(PHRASE.values().length);
        PHRASE phrase = PHRASE.values()[pick];
        return " " + phrase.toString().toLowerCase() + " ";
    }

    @Override
    public String transform(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[aeiou]", "");

        int count = rand.nextInt(5);
        if (count == 4) {
            s+= randomPhrase();
        }

        return s;
    }

    @Override
    public String toString() {
        return "IMIfied";
    }
}
