package edu.macalester.comp124.stringtransformer;

import java.lang.String;

/**
 * Created by KevinTang on 2/27/14.
 */
public class Capitalizer extends StringTransformer {
    @Override
    public String transform(String s) {
        if(s.equals("")){
            return "";
        }
        return s.substring(0,1).toUpperCase() + s.substring(1);
    }


    @Override
    public String toString() {
        return "First Letter Capitilized";
    }



}
