package VehicleManager.commons;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderFileHangSanXuat {
    static Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src/VehicleManager/data/hangSanXuat.csv";
    public static List<String> readFile(){
        File file = new File(PATH);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String> stringList = new ArrayList<>();
        String line = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                stringList.add(line);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileReader.close();
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return stringList;
    }
}
