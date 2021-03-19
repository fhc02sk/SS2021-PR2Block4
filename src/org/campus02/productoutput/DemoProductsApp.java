package org.campus02.productoutput;

public class DemoProductsApp {

    public static void main(String[] args) {


        Product p1 = new Product("Apple MacBook", 1999, "Laptop");
        Product p2 = new Product("Dell Laptop", 1899, "Laptop");
        ProductManager pm = new ProductManager();
       // pm.add(p1);
       // pm.add(p2);
       // pm.save("D:\\temp\\products.dat");

        pm.load("D:\\temp\\products.dat");
        System.out.println("pm = " + pm);

    }
}
