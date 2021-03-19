package org.campus02.filereader;

import java.io.*;

public class DemoFileReaderApp {

    public static void main(String[] args) {

        File file = new File("D:\\Temp\\addresses_new_2028.csv");

        try {
            //FileReader fileReader = new FileReader(file);
            // Alternative mit Stream-Klassen
            FileInputStream fis = new FileInputStream(file);

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fis));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("line = " + line);

                String[] columns = line.split(";");
                System.out.println("columns[0] = " + columns[0]);
                System.out.println("columns[1] = " + columns[1]);
                System.out.println("columns[2] = " + columns[2]);
                System.out.println("columns[3] = " + columns[3]);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
