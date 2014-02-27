package edu.macalester.comp124.stringtransformer;

public class Piratizer extends StringTransformer {

    @Override
    public String transform(String s) {
        return s.replaceAll("r", "rrr");
    }
    
    @Override
    public String toString() {
        return "Piratized";
    }
}
