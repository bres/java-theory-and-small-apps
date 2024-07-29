package org.example.ch3;

/**
 *  . opoiosdipote xarakthras
 *  ^ arxh string /line
 *  $ telos toy string
 *  \w [a-zA-Z0-9_]
 *  \W {^a-zA-Z0-9_} opoiosdipote xarakthras ektos apo lexh (mesa sthn agylh shmainei h arnhsh aytoy poy akoloytei)
 *  \s [\t\r\n\f]  keno diasthma -white space-tab
 *  \S h arnhsh ton parapaono - non -whitespace
 *  \d [0-9]
 *  \D [^0-9] n xarakthres
 *  \\ escape
 *  * posodeikths
 */

public class RegExShorthand {

    public static void main(String[] args) {
        boolean isAnyCharSpaceDigit = "@ 8".matches(".\\s\\d");
        boolean isLetterDigit = "_9".matches("\\w\\d");
        boolean isLetterDigitAnyWhere = "kdkd r9 ksks".matches(".*[a-zA-Z]\\d.*"); // cdcdc v9 cdcd
        boolean isLetterDigitAsWholeWord = "999 v9 999".matches(".*\\b[a-zA_Z]\\d\\b.*");

        //System.out.printf("%s\n", isAnyCharSpaceDigit ? "Matches" : "Not matches");
        //System.out.printf("%s\n", isLetterDigitAnyWhere ? "Matches" : "Not matches");
        System.out.printf("%s\n", isLetterDigitAsWholeWord ? "Matches" : "Not matches");


    }
}
