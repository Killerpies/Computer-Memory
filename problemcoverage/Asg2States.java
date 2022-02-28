import java.lang.annotation.*;

/**
 * states to tests memory java class
 * 
 * @author Justin Sanders
 * @version 10232021
 */
public class Asg2States {

    /**
     * states class for program
     * 
     * @author justinsanders
     * @version 10232021
     */
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface State {

        /**
         * Sets states of the object to values
         * 
         * @return o this is an object
         */
        public String state() default "";
    }

    /**
     * Sets states of the object to values
     * 
     * @return o this is an object
     */
    @State(state = "<10,11,12>")
    public static Memory state0() {
        Memory o = new Memory();
        o.store(0, 10);
        o.store(1, 11);
        o.store(2, 12);
        // TODO Set initial state, if applicable
        return o;
    }


    /**
     * Sets states of the object to values
     * 
     * @return o this is an object
     */
    @State(state = "<10,11,12>")
    public static Memory state1() {
        Memory o = new Memory();
        o.store(0, 10);
        o.store(1, 11);
        o.store(2, 12);
// Cell o = new Cell();
// TODO Set initial state, if applicable
        return o;
    }


    /**
     * Sets states of the object to values
     * 
     * @return o this is an object
     */
    @State(state = "null")
    public static Memory state2() {
        Memory o = new Memory();
        o.store(0, 10);
        o.store(1, 11);
        o.store(2, 12);
        // TODO Set initial state, if applicable
        return o;
    }
}
