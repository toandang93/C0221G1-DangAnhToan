package bai_15_IO_TextFile.bai_tap_test;

import java.io.File;
import java.io.IOException;

public class CreatFile {
    public static void main(String[] args) throws IOException {
        File file= new File("src\\bai_15_IO_TextFile\\bai_tap_copy_fileText\\text.txt");
        if(!file.exists()){
            file.createNewFile();
        }


    }
}
