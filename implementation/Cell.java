/**
 * Various conversions of decimal numbers to binary
 * 
 * @author Justin Sanders
 * @version 20211020
 */

public class Cell {

    /**
     * Cell class does things
     */

    private String binarynumber;

    /**
     * Create a new Cell object.
     */
    public Cell() {
        this.binarynumber = "00000000";
    }


    /**
     * To string takes the binary number stored inside cell and returns it like
     * so <number>
     * 
     * @return string formated as <number>
     */
    public String toString() {
        return "<" + this.binarynumber + ">";
    }


    /**
     * This returns the binary number that was already stored as a string.
     * 
     * @return binarynumber - number recieved from user
     */
    public String get() {
        return this.binarynumber;
    }


    /**
     * Determines if number is valid binary string needs to be at least 8
     * characters long and only 1's and 0's
     * 
     * @param number
     *            - String that you want to test
     * @return true/false - if number is correct
     */
    public static boolean isValid(String number) {
        if (number.length() != 8) {
            return false;
        }

        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != '1' && number.charAt(i) != '0') {
                return false;
            }

        }
        return true;

    }


    /**
     * Determines if number is valid binary string needs to be at least 8
     * characters long and only 1's and 0's
     * 
     * @param number
     *            - String that you want to test
     * @return true/false - if number is correct
     */
    public static boolean isValid(int number) {
        return !(number >= 256 || number < 0);
    }


    /**
     * converts integer to binary string if it is an acceptable size (doesnt
     * make binary longer than 8 characters) if binary number is not the right
     * size (8 digits long), determines extra space and adds 0's in front
     * 
     * @param number
     *            - integer number you want to convert
     * @return binary - converted binary string
     */
    public static String toBinary(int number) {
        if (!Cell.isValid(number)) {
            return "OVERFLOW";
        }
        String binary = Integer.toBinaryString(number);
        // built in function converts int to binary string
        String end = String.format("%8s", binary).replaceAll(" ", "0");
        return end;
    }


    /**
     * isValid - checks if string length is 8. returns false using isValid -
     * checks if numbers are either 0 or 1. if not returns false if first 2
     * checks are passed then sets binarynumber == to new number and returns
     * true
     * 
     * @param number
     *            - integer wanting to change to binary
     * @return true/false - depending on if the number was valid or not
     */
    public Boolean set(String number) {
        if (isValid(number)) {

            this.binarynumber = number;
            return true;
        }
        return false;
    }


    /**
     * takes a String representing a binary number isValid - checks if the
     * number is appropriate if so, converts binary number back to an integer
     * 
     * @param binary
     *            - the binary number wanted to convert
     * @return result / -1 result is returned if a successful conversion
     *         happens; -1 if not
     */
    public static int toDecimal(String binary) {
        if (isValid(binary)) {

            char[] numbers = binary.toCharArray();
            int result = 0;
            for (int i = numbers.length - 1; i >= 0; i--) {
                if (numbers[i] == '1') {
                    result += Math.pow(2, (numbers.length - i - 1));
                }
            }
            return result;
        }
        return -1;
    }


    public static void main(String args[]) {
        Cell p1 = new Cell();
        System.out.println("Initialized class, printing cell object p1: " + p1);
        p1.set("01010101");
        System.out.println("Set Method: " + p1);
        System.out.println("Get Method: " + p1.get());
        System.out.println("To Binary #35: " + p1.toBinary(35));
        System.out.println("To Decimal 00001111: " + p1.toDecimal("00001111"));
        System.out
            .println("isValid (String) 00001111: " + p1.isValid("00001111"));
        System.out.println(
            "isValid (String) Should not be valid 111111111111: "
                + p1.isValid("111111111111"));
        System.out.println("isValid (INT) 15: " + p1.isValid(15));
        System.out.println(
            "isValid (INT) Should not be valid 2000: " + p1.isValid(2000));

    }

}
