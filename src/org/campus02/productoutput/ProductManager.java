package org.campus02.productoutput;

import java.io.*;
import java.util.ArrayList;

public class ProductManager {

    private ArrayList<Product> products = new ArrayList<>();

    public void add(Product p) {
        products.add(p);
    }

    public void save(String path) {

        File file = new File(path);

        ObjectOutputStream oos = null;
        try {
            FileOutputStream fos = new FileOutputStream(file);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            oos = new ObjectOutputStream(bos);

            for (Product p : products) {
                oos.writeObject(p);
            }
  //          oos.writeObject(null);
            //oos.writeObject(products);
            oos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void load(String path) {
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(path)));

            Product p;
            while ((p = (Product) ois.readObject()) != null) {
                products.add(p);
            }
        }
        catch(EOFException ex) {
            System.out.println("EOF reached");
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "products=" + products +
                '}';
    }
}
