package edu.macalester.comp124.stringtransformer;

import acm.util.RandomGenerator;

import java.util.Random;

/**
 * Created by rberman on 2/27/14.
 *
 *
 */
public class Piratizer extends StringTransformer {
    @Override
    public String transform(String s) {
        String finalS = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'r') {
                finalS += "rr";
            }
            finalS += s.charAt(i);
            if (s.charAt(i) == '.') {
                int rand = randomArr();
                if (rand == 1) {
                    finalS += "Arrrrr!";
                }
                if (rand == 2) {
                    finalS += "Ahoy!";
                }
            }
        }
        return finalS;
    }

    @Override
    public String toString() {
        return "Piratizer";
    }

    public int randomArr(){
        Random generator = new Random();
        int a = generator.nextInt(8);
        return a;
    }

}


/*
All rs are changed to rrrs. 25% of sentences end with a random choice between Arrrrr! and Ahoy!.
 */