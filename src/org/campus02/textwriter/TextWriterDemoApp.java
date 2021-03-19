package org.campus02.textwriter;

import java.io.*;

public class TextWriterDemoApp {

    public static void main(String[] args)  {

        try (BufferedReader bufferedReaderConsole = new BufferedReader(new InputStreamReader(System.in));
             PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("D:\\temp\\consolelog.txt", true)))
        ){
            String lineFromConsole;

            while (!(lineFromConsole = bufferedReaderConsole.readLine()).equals("STOP")){
                pw.println(lineFromConsole);
            }
            pw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
