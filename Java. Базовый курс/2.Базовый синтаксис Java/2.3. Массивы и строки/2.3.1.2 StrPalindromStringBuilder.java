/**
 * Checks if given text</code> is a palindrome.
 * @param text any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */

public static boolean isPalindrome(String text) {
    String newString = text.replaceAll("[^a-zA-Z0-9]","");
    StringBuilder sb_newString = new StringBuilder(newString);
    boolean fin = newString.equalsIgnoreCase(sb_newString.reverse().toString());
    return fin;
}