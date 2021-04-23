package bai_15_IO_TextFile.bai_tap_copy_file_text;

import java.io.*;

public class CreatFile {
    public static void main(String[] args) throws IOException {

        String path1 = "src\\bai_15_IO_TextFile\\bai_tap_copy_file_text\\source.txt";
        String path2 = "src\\bai_15_IO_TextFile\\bai_tap_copy_file_text\\target.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2));

        String line ;

        while ((line=bufferedReader.readLine())!=null){
            bufferedWriter.append(line);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
