//package edu.macalester.comp124.stringtransformer;
//
//import java.util.Random;
//
//public class Scrambler extends StringTransformer {
//
//    @Override
//    public String transform(String s) {
//        int length = s.length();
//        String[] words = s.split(" ");
//        String scrambledString = "";
//        for (int j = 0; j<= words.length -1; j++){
//            String word = words[j];
//            String newWord = transformEachWord(word);
//            scrambledString += newWord;
//        }
//        System.out.print(scrambledString);
//     }
//
//    public String transformEachWord(String str){
//        int length = str.length();
//        char[] newStr = str.toCharArray();
//        int index;
//        index = Random.nextInt(length);
//        char[]
//        for (int i = 0; i < length; i++){
//            newStr
//
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "Scramble each word";
//    }
//}
