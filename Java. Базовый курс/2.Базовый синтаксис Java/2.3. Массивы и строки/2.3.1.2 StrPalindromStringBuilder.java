/**
 * Checks if given text is a palindrome.
 *
 * @param text any string
 * @return true when text is a palindrome, false otherwise
 */

public static boolean isPalindrome(String text) {
    text = text.replaceAll("[^a-zA-Z0-9]","");
    StringBuilder sb_String = new StringBuilder(text);
    boolean flag = text.equalsIgnoreCase(sb_String.reverse().toString());
    return flag;
}
