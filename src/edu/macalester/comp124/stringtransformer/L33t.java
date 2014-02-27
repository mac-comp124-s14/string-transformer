package edu.macalester.comp124.stringtransformer;


/**
 * Created by iangoodbar on 2/27/14.
 */
public class L33t extends StringTransformer {

    @Override
    public String transform(String s) {
        s = s.replace('o', '0');
        s = s.replace('l', '1');
        s = s.replace('e', '3');
        s = s.replace('a', '4');
        s = s.replace('s', '5');
        s = s.replace('t', '7');
        s = s.replace('b', '8');
        s = s.replace('O', '0');
        s = s.replace('L', '1');
        s = s.replace('E', '3');
        s = s.replace('A', '4');
        s = s.replace('S', '5');
        s = s.replace('T', '7');
        s = s.replace('B', '8');
        return s;
    }
    @Override
    public String toString() {
        return "Haxxd";
    }
}