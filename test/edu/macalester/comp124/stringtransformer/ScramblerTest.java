package edu.macalester.comp124.stringtransformer;
import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertTrue;

/**
 * Created by RLP on 2/27/14.
 */
public class ScramblerTest {
    @Test
    public void stringTest() {
        StringTransformer test = new Scrambler();
        String[] symbols = {"Eva","vEa","vaE","avE"};
        assertTrue(Arrays.asList(symbols).contains(test.transform("Eva")));
    }
}
