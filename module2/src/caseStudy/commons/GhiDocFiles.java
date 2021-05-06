package caseStudy.commons;

import caseStudy.models.DichVu;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public interface GhiDocFiles<T> {
    public static final String PATH = "src/caseStudy/data/";

    public static <T> void ghiFile(String duongDan, List<T> list, boolean trangThai) {
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            file = new File(PATH + duongDan);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (T t : list) {
                bufferedWriter.write(t.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String[]> docFile(String duongDan) {
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<String[]> strings = new ArrayList<>();
        String line = null;
        try {
            file = new File(PATH + duongDan);
            if (!file.exists()){
                file.createNewFile();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                    strings.add(line.split(","));
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return strings;
    }
}