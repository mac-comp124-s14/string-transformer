package edu.macalester.comp124.stringtransformer;

import java.util.Random;

/**
 * Created by Huichang on 2/27/14.
 */
public class Piratizer extends StringTransformer {

    public String transform(String s) {

        String rev = "";
        int l = s.length();

        for (int i = 0; i < l; i++) {
            char now = s.charAt(i);
            if (now == 'r') {
                rev = rev + "rrr";
                continue;
            }
            if (now < 'a') {
                int change = new Random().nextInt(5);
                if (change == 4) {
                    rev += " Arrrr! " + now;
                }
                else {
                    if (change == 2) {
                        rev += " Ahoy! "+ now;
                    }
                }
            }
            else {
                rev += now;
            }
        }
        return rev;
    }

    public String toString() {
        return "Pirate!";
    }
}
