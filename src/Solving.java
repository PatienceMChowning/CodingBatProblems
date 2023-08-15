/**
 * This is a class that will display simple solutions 
 * to codingbat.com problems
 * Date: 08/10/2023
 * @author Patience Chowning
 */

public class Solving {
    //----------------------------------Problem 1-------------------------------
    /** 
     * The parameter weekday is true if it is a weekday, and the parameter
     * vacation is true if we are on vacation. We sleep in ifit is not a 
     * weekday or we're on vacation. Return true if we sleep in.
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     */
    
    //Another solution for the above method would be to use a ternary operator:
    // --> return (!weekday || vacation) ? true : false;
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }
    //----------------------------------Problem 2-------------------------------
    /** 
     * Given two int values, return their sum. Unless the two values are the
     * same, then return double their sum.
     * sumDouble(1, 2) → 3 
     * sumDouble(3, 2) → 5 
     * sumDouble(2, 2) → 8 
     */
    
    //I could do the same thing with a ternary operator for the sake of line
    //space, however this is a more readable option. 
    public static int sumDouble(int a, int b) {
        if (a != b) {
            return a + b;
        }
        return (a + b) * 2;
    }

    //----------------------------------Problem 3-------------------------------
    /**
     * Given an int n, return the absolute difference between n and 21, except
     * return double the absolute difference if n is over 21. 
     * diff21(19) → 2
     * diff21(10) → 11
     * diff21(21) → 0
     * diff21(-1) → 20
     */
    //Decided to use Math.abs to cover any negatives that might be tested. 
    public static int diff21(int n) {
        if (n <= 21) {
            return (21 - Math.abs((n)));
        }
        return ((21 - n) * 2);
    }
    
    //A main method to test operations
    public static void main(String[] args) {
        //Testing problem 1
        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));
        System.out.println("-".repeat(10));
        //Testing problem 2
        System.out.println(sumDouble(1, 2));
        System.out.println(sumDouble(3, 2));
        System.out.println(sumDouble(2, 2));
        System.out.println("-".repeat(10));
        //Testing problem 3
        System.out.println(diff21(19));
        System.out.println(diff21(10));
        System.out.println(diff21(21));
        System.out.println(diff21(-1));
        System.out.println("-".repeat(10));
    } 
} //End of class
