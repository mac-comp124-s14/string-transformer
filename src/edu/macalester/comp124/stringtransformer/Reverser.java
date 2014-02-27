package edu.macalester.comp124.stringtransformer;
// reference: http://docs.oracle.com/javase/7/docs/api/
public class Reverser extends StringTransformer {

    @Override
    public String transform(String s) {
        StringBuffer reverseS = new StringBuffer(s).reverse();
        return reverseS.toString() ;
     }
    
    @Override
    public String toString() {
        return "All reversed";
    }
}
