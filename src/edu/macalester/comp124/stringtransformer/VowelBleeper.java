package edu.macalester.comp124.stringtransformer;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Kim eng on 2/27/14.
 */
public class VowelBleeper extends StringTransformer{

    @Override
    public String transform(String s) {
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            List<Character> charList = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
            if (charList.contains(ch)) {
                s = s.replace(ch, '*');
            }
        }
        return s;
    }



    public String replace(char oldChar, char newChar) {return String.valueOf(newChar);}

    @Override
    public String toString() {
        return "Bleeps out all the vowels!";
    }
}
