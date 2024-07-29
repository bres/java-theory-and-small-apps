package smallApps.palindrome;

public class PalinfromeDriver {

    public static void main(String[] args) {
        final int LEN =100;
        int high = 0;
        char[] sentence = new char[LEN];
        char ch;
        boolean isPal;

        try {
            System.out.println("doste mia protash pros elegxo");

            //populate array- gemise ton pinaka me times
            do {
                ch = (char) System.in.read();
                if ((ch >= 'a') && (ch <='z')){
                    sentence[high++] =ch;
                }
            }while ((ch !='.') && (high <LEN));

            // kalese thn palindromePojo
            isPal = PalindromePojo.isPalindrome(sentence,0,high-1);
            // apotelesmata
            System.out.printf("h protash &s einai palindromikh", (isPal) ? " " : "den");


        } catch (java.io.IOException e) {
            System.out.println("sfalma");
        }
    }
}
