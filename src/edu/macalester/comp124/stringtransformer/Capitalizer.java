package edu.macalester.comp124.stringtransformer;

import java.lang.Character;
import java.lang.String;

/**
 * Created by lnorman on 2/27/14.
 */
public class Capitalizer extends StringTransformer {
    @Override
    public String transform(String s) {
        int len = s.length();
        if (len != 0) {

            char first = s.charAt(0);
            char firstUpper = Character.toUpperCase(first);
            String a = "";
            a = a + firstUpper;
            for (int i = 1; i < len; i++) {
                char add = s.charAt(i);
                a += add;

            }
            return a;


        }
        return s;


    }

    @Override
    public String toString() {
        return "Capitalizes first letter of each word.";
    }
}

