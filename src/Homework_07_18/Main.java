package Homework_07_18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {


    public static void main(String[] args) {
        printWordsWithCountFromTextCaseInsensitive();
    }


    private static void printWordsWithCountFromTextCaseInsensitive() {
        String url = "C:\\Users\\karol\\IdeaProjects\\Java\\src\\Homework_07_18\\text.txt";
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        BufferedReader reader;
        Set<String> set;
        Pattern p;
        Matcher m;
        String input;
        String regex = "([a-žA-Ž'’]+)";
        int occurences;
        Object[] array;

        try {

            reader = new BufferedReader( new FileReader( url ) );
            input = reader.lines().collect(Collectors.joining(" "));

            p = Pattern.compile( regex );
            m = p.matcher( input );

            // Visas reiksmes atitinkancias regex sudedam i list
            while (m.find()) {
                list.add( m.group( 0 ).toUpperCase() + " " );
            }

            // Prie kiekvienos list reiksmes pridedam jos pasikartojimų tekste skaiciu. CASE SENSITIVE !!!
            for (int i = 0; i < list.size(); i++) {
                occurences = Collections.frequency( list, list.get( i) );
                list2.add( list.get( i ) + "= " + occurences );
            }

            // List elementus sudedam i set, kad isvengtume dublikatu
            set = new HashSet<>( list2 );

            // Surikiuojam elementus pagal pasikartojima tekste mazejimo tvarka
            array = set.toArray();
            Arrays.sort( array, (o1, o2) -> Integer.parseInt( o2.toString().replaceAll( regex + "\\s=\\s", "" ) )
                    - Integer.parseInt( o1.toString().replaceAll( regex + "\\s=\\s", "" ) ) );

            for (Object s : array) {
                System.out.println( s );
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
