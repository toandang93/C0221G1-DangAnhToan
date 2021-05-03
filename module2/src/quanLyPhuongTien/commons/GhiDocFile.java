package quanLyPhuongTien.commons;

        import quanLyPhuongTien.models.Oto;
        import quanLyPhuongTien.models.PhuongTien;
        import quanLyPhuongTien.models.XeMay;
        import quanLyPhuongTien.models.XeTai;

        import java.io.*;
        import java.util.ArrayList;
        import java.util.List;

public class GhiDocFile {
    public static final String PATH ="src/quanLyPhuongTien/data/";

    public static void ghiFile(String fileName, List<PhuongTien> phuongTienList,boolean trangThai){
        File file = new File(PATH+fileName);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file,trangThai);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (PhuongTien phuongTien : phuongTienList){
                bufferedWriter.write(phuongTien.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                bufferedWriter.close();
                fileWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static List<PhuongTien> docFile(String fileName){
        File file = new File(PATH+fileName);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        List<PhuongTien> phuongTienList = new ArrayList<>();
        String[] strings = null;
        String line = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null){
                strings = line.split(",");
                if (strings.length == 6){
                    PhuongTien oto = new Oto(strings[0],strings[1],Integer.parseInt(strings[2]),strings[3],Integer.parseInt(strings[4]),strings[5]);
                    phuongTienList.add(oto);
                }else if(strings[0].contains("C")){
                    PhuongTien xeTai = new XeTai(strings[0],strings[1],Integer.parseInt(strings[2]),strings[3],Integer.parseInt(strings[4]));
                    phuongTienList.add(xeTai);
                }else {
                    PhuongTien xeMay = new XeMay(strings[0],strings[1],Integer.parseInt(strings[2]),strings[3],Integer.parseInt(strings[4]));
                    phuongTienList.add(xeMay);
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } finally {
            try{
                bufferedReader.close();
                fileReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return phuongTienList;
    }

    public static List<String> docFileHangSanXuat(String fileName){
        File file = new File(PATH+fileName);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        List<String> stringList = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            stringList = new ArrayList<>();
            while ((line = bufferedReader.readLine())!= null){
                stringList.add(line);
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
        return stringList;
    }
}
