package edu.macalester.comp124.stringtransformer;

/**
 * Created by Barbara B on 2/27/14.
 */
public class VowelBleeper extends StringTransformer {

    @Override
    public String transform(String s) {
        return  s.replaceAll("[aeiouAEIOU]", "*");
    }

    @Override
    public String toString() {
        return "Vowel Bleeper";
    }
}
