package edu.macalester.comp124.stringtransformer;

import acm.util.RandomGenerator;

/**
 * Created by Marcus Ulmer on 2/27/14.
 */
public class Scrambler extends StringTransformer{
    @Override
    public String transform(String s) {
        //deals with caps
        boolean wordHasLeadingCap = false;
        if (Character.isUpperCase(s.charAt(0))){
            wordHasLeadingCap = true;
        }
        s= s.toLowerCase();
        RandomGenerator generator = new RandomGenerator();
        char[] wordArray;
        wordArray = new char[s.length()]; //following pattern from JavaDoc for array
        char[] scrambled;
        scrambled = new char[s.length()];
        //puts s into an array
        for(int i=0; i < s.length();i++){
            wordArray[i] = s.charAt(i);
        }
        //picks characters at random and puts them in the new array,
        //then puts them at the end of their array and doesn't scan that far.
        for(int i=0; i < s.length();i++){
            int place = generator.nextInt(0,wordArray.length - (i+1));
            scrambled[i] = wordArray[place];
            //code based on template from <http://stackoverflow.com/questions/13766209/effective-swapping-of-elements-of-an-array-in-java>
            char temp = wordArray[place]; //intended idea here is to put the used letters at the end of the string and then not read them -
            wordArray[place] = wordArray[wordArray.length - (i+1)];
            wordArray[wordArray.length - 1] = temp;
        }
        String scrambledWord = "";
        for (int i=0; i < scrambled.length; i++){
            scrambledWord += scrambled[i];
            //checks if the word should be capitalised
            if (wordHasLeadingCap && i == 0){
                scrambledWord = scrambledWord.toUpperCase();
            }
        }

        return scrambledWord;
    }
    @Override
    public String toString() {
        return "All scrambled.";
    }
}
