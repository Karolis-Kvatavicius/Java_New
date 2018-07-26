package homework_07_12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regex {

    private static final String FIRST = "^([\\/\\w*]*)";
    private static final String SECOND = "(id=\\w*)";
    private static final String THIRD = "^(\\/\\w*)";
    private static final String FOURTH = "^(?:\\/\\w*){2}\\/(\\w*)";

    static String getFIRST() {
        return FIRST;
    }

    static String getSECOND() {
        return SECOND;
    }

    static String getTHIRD() {
        return THIRD;
    }

    static String getFOURTH() {
        return FOURTH;
    }

    static String cutUrl(String regex) {
        String url = "/demo/19/automobilis?id=140";
        Pattern pattern = Pattern.compile( regex );
        Matcher stringMatcher = pattern.matcher( url );
        stringMatcher.find();
        System.out.println(stringMatcher.group(1));
        return stringMatcher.group(1);
    }

    static void countDashes() {
        String regex = "(-).*(-).*(-).*(-).*(-)";
        String url = "https://www.hackerrank.com/challenges/matching-anything-but-new-line/problem?h_r=next-challenge&h_v=zen";
        Pattern pattern = Pattern.compile( regex );
        Matcher matcher = pattern.matcher( url );
        // Returns count of groups
        System.out.println(matcher.groupCount());
    }
}
