package caseStudy.commons;

import caseStudy.models.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GhiDocFile {
    public static final String PATH = "src/caseStudy/data/";
    public static void ghiFile(String duongDan, List<DichVu> dichVuList,boolean trangThai){
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            file = new File(PATH+duongDan);
            fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (DichVu dichVu : dichVuList){
                bufferedWriter.write(dichVu.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public static List<DichVu> docFile(String duongDan){
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<DichVu> dichVuList = new ArrayList<>();
        String[] strings = null;
        String line = null;
        try{
            file = new File(PATH+duongDan);
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                strings = line.split(",");
                if (strings.length == 9){
                    DichVu villa = new Villa(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],strings[6],strings[7],strings[8]);
                    dichVuList.add(villa);
                }else if (strings.length == 8){
                    DichVu nha = new Nha(strings[0],strings[1],strings[2],strings[3],strings[4],strings[5],strings[6],Integer.parseInt(strings[7]));
                    dichVuList.add(nha);
                }else if(strings.length == 6){
                    DichVu phong = new Phong(strings[0],strings[1],strings[2],strings[3],strings[4],new DichVuDiKem(strings[5],strings[6],Double.parseDouble(strings[7])));
                    dichVuList.add(phong);
                }
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
        return dichVuList;
    }
}
