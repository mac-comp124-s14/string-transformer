package edu.macalester.comp124.stringtransformer;
//Snoopdoggify your shizzle

public class Snoopifier extends StringTransformer {
    @Override
    public String transform(String s) {
        String s2="";
        if(s.length()>=2&&s.charAt(1)=='i'){
            s2 = s.substring(0,2)+"zzle";

        }else {
            s2=s;
        }
        if(s2.equals("were")){
            s2="was";
        }else if(s2.equals("was")){
        s2="were";
        }
        return s2;
    }

    @Override
    public String toString() {
        return "I heard you like Snoop Dogg";
    }
}
