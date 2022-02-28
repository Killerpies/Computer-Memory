import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * memory to string tests
 * 
 * @author Justin Sanders
 * @version 10232021
 */
public class Asg2MemorytoStringTests {

    /**
     * Give correct answer rule
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * <"00001010","00001011","00001100">.toString() == "<10,11,12>"
     */
    @Test
    public void stringtest() {
        Memory o = Asg2States.state0();
        String actual = o.toString();
        String expected = "<10,11,12>";
        assertEquals(expected, actual);
    }
}
