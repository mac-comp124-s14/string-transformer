package edu.macalester.comp124.stringtransformer;

public class Reverser extends StringTransformer {

    @Override
    public String transform(String s) {
        String newS = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            newS += s.charAt(i);
        }
        return newS;
    }
    @Override
    public String toString() {
        return "--Reversed--";
    }
}
