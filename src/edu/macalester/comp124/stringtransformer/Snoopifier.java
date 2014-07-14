package edu.macalester.comp124.stringtransformer;

public class Snoopifier extends StringTransformer {



    @Override
    public String transform(String s) {
        if (s.length() >= 2 && s.charAt(1) == 'i'){
            char a  = s.charAt(0);
            s = "";
            s += a + "izzle";
        }
        else if (s.equals("he")){
            s = "";
            s += "homie";
        }
        else if (s.equals("were")){
            s = "";
            s = "was";
        }
        else if(s.equals("was")){
            s = "";
            s = "were";
        }
        return s;
    }
    
    @Override
    public String toString() {
        return "All capitalized";
    }


}
