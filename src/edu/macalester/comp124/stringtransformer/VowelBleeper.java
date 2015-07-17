package edu.macalester.comp124.stringtransformer;

/**
 * Created by jgraham2 on 2/27/14.
 */
public class VowelBleeper extends StringTransformer {

    @Override
    public String transform(String s){
        int length = s.length();
        String bleeped = "";
        for (int pos = 0; pos < length; pos++){
            if (s.charAt(pos) == 'a'  || s.charAt(pos) == 'e'  || s.charAt(pos) == 'i'  || s.charAt(pos) == 'o'  || s.charAt(pos) == 'u' || s.charAt(pos) == 'A'  || s.charAt(pos) == 'E'  || s.charAt(pos) == 'I'  || s.charAt(pos) == 'O'  || s.charAt(pos) == 'U'){
                bleeped += "*";
            } else {
                bleeped += s.charAt(pos);
            }
        }
    return bleeped;
    }

    @Override
    public String toString(){
        return "C*ns*r Th*t!";
    }
}
