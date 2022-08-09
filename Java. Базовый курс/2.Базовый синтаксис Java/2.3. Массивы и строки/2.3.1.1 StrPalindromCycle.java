/**
 * Checks if given text is a palindrome.
 *
 * @param text any string
 * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
 */

/* Реализуйте метод, проверяющий, является ли заданная строка палиндромом. Палиндромом называется строка,
оторая читается одинаково слева направо и справа налево (в том числе пустая). При определении 
"палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания,
а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки,
состоящие из символов ASCII (цифры, латинские буквы, знаки препинания). Т.е. русских, китайских и
прочих экзотических символов в строке не будет.
*/


public static boolean isPalindrome(String text) {
    text = text.toLowerCase();
    text = text.replaceAll("[^A-Za-z1-9]+", "");
    char[] textArray = text.toCharArray();
    
    int length = text.length();
    boolean flag = true;
    
    for (int i = 0; i < length / 2; i++) {
        if (!(textArray[i] == textArray[(length - 1) - i])){
                flag = false;
                break;
        }
    }
    return flag;
}

