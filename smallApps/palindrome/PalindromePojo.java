package smallApps.palindrome;

/**
 * klash palindromePojo - plain old java object
 * @author bres george
 */

public class PalindromePojo {

    /**
     * elenxei an mia frash einai palindromikh
     *
     * @param sentence h pros elegxo frash se char
     * @param low      to index toy pinaka toy protoy grammatos
     * @param high     to index toy pinaka toy teleytaio grammatos
     * @return true an h protash einai palindromikh allios false
     */

    public static boolean isPalindrome(char[] sentence, int low, int high) {
        int i = low, j = high;
        boolean isPal = true;

        if (sentence == null) {
            return false;
        }
        while ((i < j) && (isPal)) {
            isPal = (sentence[i++] == sentence[j--]);
        }
        return isPal;
    }
}

