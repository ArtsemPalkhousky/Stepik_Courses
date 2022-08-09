/**
 * Checks if given <code>value</code> is a power of two.
 *
 * @param value any number
 * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
 */

public static boolean isPowerOfTwo(int number) {
    if (number == 0) 
        return false;
    if (number < 0) 
        number = - number;
    if ((number & -number) == number) {
            return true;
    }
    else
        return false;
}
