package org.campus02.consolein;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ConsoleInDemoApp {

    public static void main(String[] args) {

        // Streams
        System.out.println("Bitte Text eingeben und mit X abbrechen: ");

        File file = new File ("D:\\temp\\output.txt");
        FileOutputStream fileOutputStream = null;
        try {
            //irgendein Code ... Fehler

            int byteRead = 0;
            fileOutputStream = new FileOutputStream(file, true);
            while ((byteRead = System.in.read()) != 'X') {
                fileOutputStream.write(byteRead);
            }

            fileOutputStream.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
