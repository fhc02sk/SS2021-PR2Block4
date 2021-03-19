package org.campus02.textwriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextWriterDemoApp {

    public static void main(String[] args) throws IOException {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReaderConsole = new BufferedReader(isr);

        String lineFromConsole = bufferedReaderConsole.readLine();
        System.out.println(lineFromConsole);

    }
}
