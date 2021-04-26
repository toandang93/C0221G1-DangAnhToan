package bai_16_IO_BinaryFile_Serialization.bai_tap.copyFileNhiPhan;

import bai_16_IO_BinaryFile_Serialization.bai_tap.luuFileNhiPhan_QuanLySanPham.Product;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.Scanner;

public class Main {
  private static void copyFileUsingJava7File(File source, File dest) throws IOException {
      Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
  }
  public static void readFile(String path){
      try{
          FileInputStream fis = new FileInputStream(path);
          ObjectInputStream ois = new ObjectInputStream(fis);
          List<Product> products = (List<Product>) ois.readObject();
          products.forEach(e-> System.out.println(e));
          fis.close();
          ois.close();
      } catch (FileNotFoundException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
  }
    public static void main(String[] args) throws IOException {
        String path1 = "src/bai_16_IO_BinaryFile_Serialization/bai_tap/luuFileNhiPhan_QuanLySanPham/product.txt";
        String path2 = "src/bai_16_IO_BinaryFile_Serialization/bai_tap/copyFileNhiPhan/copyProduct.txt";
        File source = new File(path1);
        File dest = new File(path2);
        copyFileUsingJava7File(source,dest);
        readFile(path2);
    }
}
