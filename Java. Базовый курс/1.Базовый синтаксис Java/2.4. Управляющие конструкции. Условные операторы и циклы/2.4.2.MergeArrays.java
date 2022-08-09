/**
 * Merges two given sorted arrays into one
 *
 * @param a1 first sorted array
 * @param a2 second sorted array
 * @return new array containing all elements from a1 and a2, sorted
 */

public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] resultArray = new int[a1.length + a2.length];
        int i = 0, j = 0, rA = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] <= a2[j]) {
                resultArray[rA] = a1[i];
                i++;
            }
            else {
                resultArray[rA] = a2[j];
                j++;
            }
            rA++;
        }
        while (i < a1.length) {
            resultArray[rA] = a1[i];
            i++; rA++;
        }
        while (j < a2.length) {
            resultArray[rA] = a2[j];
            j++; rA++;
        }
        return resultArray;
}