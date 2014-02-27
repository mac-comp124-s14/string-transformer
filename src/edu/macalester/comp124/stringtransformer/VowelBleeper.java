package edu.macalester.comp124.stringtransformer;

/**
 * Created by RLP on 2/27/14.
 */
public class VowelBleeper extends StringTransformer{
    @Override
    public String transform(String s){
        s = s.replace('e','*');
        s = s.replace('a','*');
        s = s.replace('i','*');
        s = s.replace('o','*');
        s = s.replace('u','*');
        s = s.replace('E','*');
        return s;
    }
    @Override
    public String toString(){
        return "VowelBleeper.";
    }
}
