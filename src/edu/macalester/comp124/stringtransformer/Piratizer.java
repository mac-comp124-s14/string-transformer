package edu.macalester.comp124.stringtransformer;

import acm.util.RandomGenerator;

/**
 * Created by Monica on 2/27/14.
 */
public class Piratizer extends StringTransformer {



    @Override

    public String transform(String s) {
        int length = s.length();
        String addString = "";
        RandomGenerator randGen = RandomGenerator.getInstance();
        int randNum = randGen.nextInt(100);
        int randNum2 = randGen.nextInt(2);
        for (int i = 0; i < length; i++){
            addString = addString + s.charAt(i);
            if(s.charAt(i) == 'r'){
                addString = addString + "rr";
            }
            if (randNum <= 25){
                if (randNum2 == 1){
                    addString = addString + "Arr!";
                }
                if (randNum2 == 2){
                    addString = addString + "Ahoy!";
                }
            }
        }
        return addString;
    }

    @Override
    public String toString() {
        return "Pirates";
    }





}
