package org.campus02.textwriter;

import java.io.*;

public class TextWriterDemoApp {

    public static void main(String[] args)  {

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader bufferedReaderConsole = new BufferedReader(isr);

        try {
            String lineFromConsole;
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("D:\\temp\\consolelog.txt", true)));

            while (!(lineFromConsole = bufferedReaderConsole.readLine()).equals("STOP")){
                pw.println(lineFromConsole);
            }
            pw.flush();
            pw.close();
            bufferedReaderConsole.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
