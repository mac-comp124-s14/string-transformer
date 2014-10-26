package edu.macalester.comp124.stringtransformer;

import acm.util.RandomGenerator;

/**
 * Created by jyang4 on 2/27/14.
 */
public class IMIfier extends StringTransformer {

    @Override
    public String transform(String s) {
        //int len = s.length();
        //String resultString = "";
        //for(int i = 0; i < )
        RandomGenerator generator = new RandomGenerator();
        s = s.replaceAll("[aeiou]", "");
        int addAPhrase = generator.nextInt(1,5);

        if (addAPhrase == 5) {
            int phraseSelector = generator.nextInt(1,5);

            if (phraseSelector ==1) {
                s += " lol";
            }
            if (phraseSelector ==2) {
                s += " lmao";

            }
            if (phraseSelector ==3) {
                s += " omg";

            }
            if (phraseSelector ==4) {
                s += " jk";

            }
            if (phraseSelector ==5) {
                s += " rofl";

            }

        }

        return s;

    }



    @Override
    public String toString() {
        return "IMIfier";
    }

}
