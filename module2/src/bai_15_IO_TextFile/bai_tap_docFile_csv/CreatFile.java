package bai_15_IO_TextFile.bai_tap_docFile_csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class CreatFile {
    public static void main(String[] args) {
        String path = "src\\bai_15_IO_TextFile\\bai_tap_docFile_csv\\country.csv";
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            Set<String> str = new TreeSet<>();
            while ((line = bufferedReader.readLine())!= null){
               String[] strings = line.split(",");
                str.add(strings[5]);

            }
            str.forEach(e->{
                System.out.println(e);
            });
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
