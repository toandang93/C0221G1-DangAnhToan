package commons;

import models.DanhBa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GhiDocFile {
    public static final String PATH = "src/data/contacts.csv";
    public static void ghiFile(List<DanhBa> danhBaList,boolean trangThai){
        File file = null;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            file = new File(PATH);
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            //Số điện thoại,Nhóm,Họ tên,Giới tính,Địa chỉ,Ngày sinh,Email
            bufferedWriter.write("Số điện thoại,Nhóm,Họ tên,Giới tính,Địa chỉ,Ngày sinh,Email");
            bufferedWriter.newLine();
            for (DanhBa danhBa : danhBaList){
                bufferedWriter.write(danhBa.toString());
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
    public static List<DanhBa> docFile(){
        File file = null;
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<DanhBa> danhBaList = new ArrayList<>();
        String[] strings = null;
        String line = null;
        try{
            file = new File(PATH);
            if (!file.exists()){
                file.createNewFile();
            }
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                strings = line.split(",");
                DanhBa danhBa = new DanhBa(strings);
                danhBaList.add(danhBa);
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
        return danhBaList;
    }
}
