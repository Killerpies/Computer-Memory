/**
 * Stores a list of 3 Cell objects which each contain a binary number
 * 
 * @author Justin Sanders
 * @version 20211020
 */
public class Memory {

    private Cell[] cellList; // array of 3 cell objects

    /**
     * Create a new Memory object.
     */
    public Memory() {
        this.cellList = new Cell[3];
        this.cellList[0] = new Cell();
        this.cellList[1] = new Cell();
        this.cellList[2] = new Cell();
    }


    /**
     * @return string - formated as <1,2,3>
     */
    public String toString() {
        // return integer version of binary # as String

        return String.format(
            "<%s,%s,%s>",
            Cell.toDecimal(this.fetch(0)),
            Cell.toDecimal(this.fetch(1)),
            Cell.toDecimal(this.fetch(2)));
        // return int version of binary #
    }


    /**
     * Checks if binary number is a valid number
     * 
     * @param index
     *            - index of cell
     * @param number
     *            - number you want to store
     * @return true or false - depending on result
     */
    public boolean store(int index, int number) {
        if (Cell.isValid(number) && index < cellList.length && index >= 0) {
            String numbString = Cell.toBinary(number);
            this.cellList[index].set(numbString);
            return true;
        }

        return false;

    }


    /**
     * fetch takes an index and determines if the index is between 0 and the
     * length of object list if so we return the binary number represented in a
     * string value
     * 
     * @param index
     *            - index is where in list you want to change
     * @return value / BADINDEX - value if passes tests; BADINDEX if false
     */
    public String fetch(int index) {
        if (index >= this.cellList.length || index <= -1) {
            return "BADINDEX";
        }
// if (Cell.isValid(cellList[index].get()) == false) {
// return "BADINDEX";
// }
        else {
            String value = this.cellList[index].get();
            return value;
        }

    }


    /**
     * main method for testing the class
     *
     * @param args
     *            - main args
     */
    public static void main(String[] args) {
        Memory s1 = new Memory();
        s1.store(0, 10);
// System.out.print(s1.store(0, 10));
        s1.store(1, 11);
        s1.store(2, 12);
// s1.store(-3, 20);
// System.out.println(s1.fetch(0));
// System.out.println(s1.fetch(1));
// System.out.println(s1.fetch(2));
        System.out.print(s1);

    }

}
