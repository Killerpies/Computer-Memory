import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * fetch test for memory
 * 
 * @author justin
 * @version 10202021
 */
public class Asg2MemoryfetchTests {

    /**
     * No rules
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <"00001010">.fetch(0) == true
     */
    @Test
    public void fetch() {
        Memory o = Asg2States.state1();
        String actual = o.fetch(0);
        String expected = "00001010";
        assertEquals(expected, actual);
    }
}
