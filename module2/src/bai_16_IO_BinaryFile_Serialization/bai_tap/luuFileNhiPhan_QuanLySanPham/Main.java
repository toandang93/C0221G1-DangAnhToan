package bai_16_IO_BinaryFile_Serialization.bai_tap.luuFileNhiPhan_QuanLySanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void writeToFile(String path, List<Product> products) throws Exception{
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static List<Product> readDataFromFile(String path){
        List<Product> products = new ArrayList<>();
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<Product>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return products;
    }

    public static void main(String[] args) throws Exception {
        List<Product> products = new ArrayList<>();
        products.add(new Product(01,"Oppo","VN",5000,"while"));
        products.add(new Product(02,"Iphone","USA",12000,"black"));
        products.add(new Product(03,"XiaoMi","TQ",3000,"pink"));
        products.add(new Product(04,"SamSung","HQ",8000,"yellow"));
        writeToFile("src/bai_16_IO_BinaryFile_Serialization/bai_tap/luuFileNhiPhan_QuanLySanPham/product.txt",products);
        List<Product> productsDataFromFile = readDataFromFile("src/bai_16_IO_BinaryFile_Serialization/bai_tap/luuFileNhiPhan_QuanLySanPham/product.txt");
        for (Product product : productsDataFromFile){
            System.out.println(product);
        }
    }
}
