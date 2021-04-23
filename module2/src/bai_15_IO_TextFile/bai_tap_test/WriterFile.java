package bai_15_IO_TextFile.bai_tap_test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("src\\bai_15_IO_TextFile\\bai_tap_copy_fileText\\text.txt",true);
        fileWriter.write("i love you okkkkk!");
        fileWriter.write("\n you don't love me >.<");
        fileWriter.write("\n i will get marrie your friend ^^");
        fileWriter.close();

        FileReader fileReader = new FileReader("src\\bai_15_IO_TextFile\\bai_tap_copy_fileText\\text.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line ;
        while ((line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }

        bufferedReader.close();
        fileReader.close();


    }
}
