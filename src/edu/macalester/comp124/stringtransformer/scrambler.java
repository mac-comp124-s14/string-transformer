package edu.macalester.comp124.stringtransformer;

//import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class Scrambler extends IdentityTransformer{
    private RandomGenerator rgen=RandomGenerator.getInstance();


    public String transform(String s) {
        int n=s.length();
        char[] word=s.toCharArray();
        for(int i=0; i<n-1;i++){
            int position=rgen.nextInt(n);
            word[i]=word[position];
            String newStr=new String(word);
            s=newStr;
        }
        return s;
    }

    @Override
    public String toString() {
        return "All scrambled!";
    }
}
