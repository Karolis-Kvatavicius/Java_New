package homework_07_19;

import java.io.FileWriter;
import java.io.IOException;

public class FWR extends FileWriter {


    public FWR(String fileName, boolean append) throws IOException {
        super( fileName, append );
    }

    @Override
    public void write(String str) throws IOException {

        for(int i = 0; i < str.length(); i++) {

            if (str.substring( i, i + 1 ).hashCode() < " ".hashCode()) {
                super.write( "?");
            } else {
                super.write( str.charAt( i ));
            }

        }

    }

    @Override
    public void write(int c) throws IOException {

        if (c < " ".hashCode()) {
            super.write( "?");
        } else {
            super.write( c );
        }
    }

}
