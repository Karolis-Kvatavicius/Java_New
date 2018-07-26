package homework_07_19;

//ND 07.19
//
//        Apibrėžkite klasę-filtrą FWR, išvestą iš FilterWriter, užklodami metodą void write (int b) taip,
//        kad išvedami "nespausdinami" simboliai (t.y., simboliai, kurių kodas mažesnis nei tarpo kodas),
//        būtų pakeičiami "tikrajame" sraute klaustuko ('?')  simbolio kodu.

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner( System.in );

    public static void main(String[] args) throws IOException {

        FWR filter = new FWR("C:\\Users\\karol\\IdeaProjects\\Java\\src\\homework_07_19\\test.txt", true);
        int hash;

        do {
            hash = scanner.nextInt();
            filter.write( hash );
        } while (hash != 46); // 250 code for a .

        filter.close();
        
    }

}
