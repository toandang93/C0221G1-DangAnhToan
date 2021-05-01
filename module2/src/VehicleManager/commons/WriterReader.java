package VehicleManager.commons;

import VehicleManager.manager.Car;
import VehicleManager.manager.Motorcycle;
import VehicleManager.manager.Truck;
import VehicleManager.manager.Vehicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterReader {
    public static final String PATH = "src/VehicleManager/data/";

    public static void writeFile(String fileName, List<Vehicle> vehicleList,boolean status){
        File file = new File(PATH+fileName);
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try{
            fileWriter = new FileWriter(file,status);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Vehicle vehicle : vehicleList){
                bufferedWriter.write(vehicle.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileWriter.close();
                bufferedWriter.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    public static List<Vehicle> readFile(String fileName){
        File file = new File(PATH+fileName);
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line = null;
        List<Vehicle> vehicleList = new ArrayList<>();
        String[] strings = null;
        try{
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine())!= null){
                strings = line.split(",");
                if(strings.length==6){
                    Vehicle car = new Car(strings[0],strings[1],Integer.parseInt(strings[2]),strings[3],strings[4],Integer.parseInt(strings[5]));
                    vehicleList.add(car);
                }else if(strings[0].contains("C")){
                    Vehicle truck = new Truck(strings[0],strings[1],Integer.parseInt(strings[2]),strings[3],Double.parseDouble(strings[4]));
                    vehicleList.add(truck);
                }else {
                    Vehicle motor = new Motorcycle(strings[0],strings[1],Integer.parseInt(strings[2]),strings[3],Integer.parseInt(strings[4]));
                    vehicleList.add(motor);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try{
                fileReader.close();
                bufferedReader.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        return vehicleList;
    }
}
