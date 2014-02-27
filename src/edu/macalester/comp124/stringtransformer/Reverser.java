package edu.macalester.comp124.stringtransformer;

/**
 * Created by bpolonsk on 2/27/14.
 */
public class Reverser extends StringTransformer {

    @Override
    public String transform(String s) {
        int l = s.length();
        String rev = "";

        for (int count = 1 ; count <= l; count++){
            rev += s.charAt(l - count);
        }

        return (rev);
    }

    @Override
    public String toString() {
        return "Reverse!";
    }
}

