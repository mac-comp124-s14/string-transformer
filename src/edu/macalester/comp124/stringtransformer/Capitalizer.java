package edu.macalester.comp124.stringtransformer;

public class Capitalizer extends StringTransformer {
    @Override
    public String transform(String s) {
        String newS = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (i == 0) {
                char upper = Character.toUpperCase(s.charAt(i));
                newS += upper;
            } else {
                newS += s.charAt(i);
            }
        }
        return newS;
    }

    @Override
    public String toString() {
        return "--Reversed--";
    }
}
