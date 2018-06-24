package string_reverse;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpinWords {

    public static void main(String[] args) {
        spinWords("Hey walking to garden");
    }

        public static void spinWords(String sentence) {
            String pattern = "^(...)$";
            Pattern a = Pattern.compile(pattern);
            Matcher b = a.matcher(sentence);
            System.out.println(b.group(0));
        }
}
