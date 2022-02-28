import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
 * Memory tests
 * 
 * @author Justin Sanders
 * @version 10232021
 */
public class Asg2MemorystoreTests {

    /**
     * Give correct answer rule
     */
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    /**
     * null.store(0, 10) == true
     */
    @Test
    public void storetest() {
        Memory o = Asg2States.state2();
        boolean actual = o.store(0, 10);
        boolean expected = true;
        assertEquals(expected, actual);
    }
}
