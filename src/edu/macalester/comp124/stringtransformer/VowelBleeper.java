package edu.macalester.comp124.stringtransformer;

public class VowelBleeper extends StringTransformer {

    @Override
    public String transform(String s) {
        return s.replaceAll("[aeiouAEIOU]", "*");
    }
    
    @Override
    public String toString() {
        return "Censor Vowels";
    }
}
