package edu.macalester.comp124.stringtransformer;

import java.util.Random;
/**
 * Created by aronthomas on 2/27/14.
 */
public class IMifier extends StringTransformer {
    private final Random rand = new Random();
    @Override
    public String transform(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[aeiou]", "");
        int number = rand.nextInt(5);
        if (number == 4){
            int phraseSelector = rand.nextInt(5);
            if (phraseSelector==0){
                s+= " lol";
            }
            if (phraseSelector==1){
                s+= " lmao";
            }
            if (phraseSelector==2){
                s+= " omg";
            }
            if (phraseSelector==3){
                s+= " jk";
            }
            if (phraseSelector==4){
                s+= " rofl";
            }
        }
        return s;
    }

    @Override
    public String toString() {
        return "IMified";
    }
}
