package org.campus02.objectoutput;

import java.io.*;


public class DemoStringOutputApp {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        String path = "D:\\temp\\string-output.dat";
        /*FileOutputStream fos = new FileOutputStream("D:\\temp\\string-output.dat");

        ObjectOutputStream oos = new ObjectOutputStream(fos);

        String demoText = "Hello File World!";
        oos.writeObject(demoText);
        oos.flush();
        oos.close();
        */

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        String demoText = (String)ois.readObject();
        ois.close();
        System.out.println("demoText = " + demoText);

    }

}
