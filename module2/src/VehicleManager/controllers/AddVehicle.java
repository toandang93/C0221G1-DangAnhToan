package VehicleManager.controllers;

import VehicleManager.commons.ReaderFileHangSanXuat;
import VehicleManager.commons.VehicleException;
import VehicleManager.commons.WriterReader;
import VehicleManager.manager.Car;
import VehicleManager.manager.Motorcycle;
import VehicleManager.manager.Truck;
import VehicleManager.manager.Vehicle;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddVehicle {
    static Scanner scanner = new Scanner(System.in);
    public static void addCar(){
        //43B-453.88,Huyndai,2020,Xe  khách,Nguyễn Văn B,45
        String numberPlate = null;
        while (true){
            try{
                System.out.println("Input number of plate");
                numberPlate = scanner.nextLine();
                VehicleException.checkNumberPlateOfCar(numberPlate);
                boolean check = true;
                List<String> bienSoXe = new ArrayList<>();
                List<Vehicle> vehicleList = new ArrayList<>();
                vehicleList = WriterReader.readFile("vehicle.csv");
                for (Vehicle vehicle : vehicleList){
                    if (vehicle instanceof Car){
                        bienSoXe.add(vehicle.getNumberPlate());
                    }
                }
                for (String string : bienSoXe){
                    if (string.equals(numberPlate)){
                        System.out.println("biển số xe đã tồn tại");
                        check = false;
                    }
                }
                if (check){
                    break;
                }

            }catch (VehicleException e){
                System.err.println(e.getMessage());
            }
        }

        String name = null;
        int choose ;
        int index =0;
        boolean check = false;
        List<String> stringList = new ArrayList<>();
        stringList = ReaderFileHangSanXuat.readFile();

        do {
            for (int i =0; i<stringList.size();i++){
                System.out.println((i+1)+" :"+stringList.get(i));
            }
            System.out.println("choose menu");
            choose = Integer.parseInt(scanner.nextLine());
            for (int i =0 ;i<stringList.size();i++){
                if (i==choose-1){
                    index = i;
                    check = true;
                }
            }
            if (check){
                name = stringList.get(index).split(",")[1];
                break;
            }
        }while (choose>=stringList.size());


        int year =0;
        while (true){
            String yearString = null;
            try{
                System.out.println("Input year of manufacturer");
                yearString = scanner.nextLine();
                VehicleException.checkYear(yearString);
                year = Integer.parseInt(yearString);
                break;
            }catch (VehicleException e){
                System.err.println(e.getMessage());
            }
        }

        String owner = null;
        while (true){
           try{
               System.out.println("Input owner");
               owner = scanner.nextLine();
               VehicleException.checkName(owner);
               break;
           }catch (VehicleException e){
               System.err.println(e.getMessage());
           }
        }

        int seat = 0;
        String seatString = null;
        while (true){
            try{
                System.out.println("Input number seat");
                seatString = scanner.nextLine();
                seat = Integer.parseInt(seatString);
                break;
            }catch (NumberFormatException e){
                System.err.println("Number format");
            }
        }


        String type = null;
        if (numberPlate.contains("A")){
            type = "Du lich";
        }
        if (numberPlate.contains("B")){
            type = "Xe khach";
        }

        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle car = new Car(numberPlate,name,year,type,owner,seat);
        vehicleList.add(car);
        WriterReader.writeFile("vehicle.csv",vehicleList,true);
    }

    public static void addTruck(){
        //String numberPlate, String manufacturerName, int yearOfManufacturer, String owner, double payLoad

        String numberPlate = null;
        while (true){
            try{
                System.out.println("Input number of plate");
                numberPlate = scanner.nextLine();
                VehicleException.checkNumberPlateOfTruck(numberPlate);
                boolean check = true;
                List<String> bienSoXe = new ArrayList<>();
                List<Vehicle> vehicleList = new ArrayList<>();
                vehicleList = WriterReader.readFile("vehicle.csv");
                for (Vehicle vehicle : vehicleList){
                    if (vehicle instanceof Truck){
                        bienSoXe.add(vehicle.getNumberPlate());
                    }
                }
                for (String string : bienSoXe){
                    if (string.equals(numberPlate)){
                        System.out.println("biển số xe đã tồn tại");
                        check = false;
                    }
                }
                if (check){
                    break;
                }

            }catch (VehicleException e ){
                System.err.println(e.getMessage());
            }
        }

        String name = null;
        int choose ;
        int index =0;
        boolean check = false;
        List<String> stringList = new ArrayList<>();
        stringList = ReaderFileHangSanXuat.readFile();

        do {
            for (int i =0; i<stringList.size();i++){
                System.out.println((i+1)+" :"+stringList.get(i));
            }
            System.out.println("choose menu");
            choose = Integer.parseInt(scanner.nextLine());
            for (int i =0 ;i<stringList.size();i++){
                if (i==choose-1){
                    index = i;
                    check = true;
                }
            }
            if (check){
                name = stringList.get(index).split(",")[1];
                break;
            }
        }while (choose>=stringList.size());

        int year = 0;
        String yearString = null;
        while (true){
            try{
                System.out.println("Input year of manufacturer");
                yearString = scanner.nextLine();
                VehicleException.checkYear(yearString);
                year = Integer.parseInt(yearString);
                break;
            }catch (VehicleException e){
                System.err.println(e.getMessage());
            }
        }

        String owner = null;
        while (true){
            try{
                System.out.println("Input owner");
                owner = scanner.nextLine();
                VehicleException.checkName(owner);
                break;
            }catch (VehicleException e){
                System.err.println(e.getMessage());
            }
        }

        double payLoad = 0.0;
        String payLoadString = null;
        while (true){
            try{
                System.out.println("Input payload");
                payLoadString = scanner.nextLine();
                payLoad = Double.parseDouble(payLoadString);
                break;
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
            }
        }


        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle truck = new Truck(numberPlate,name,year,owner,payLoad);
        vehicleList.add(truck);
        WriterReader.writeFile("vehicle.csv",vehicleList,true);
    }

    public static void addMotor(){
        //String numberPlate, String manufacturerName, int yearOfManufacturer, String owner, int wattage
        String numberPlate = null;
        while (true){
            try{
                System.out.println("Input number of plate");
                numberPlate = scanner.nextLine();
                VehicleException.checkNumberPlateOfMotor(numberPlate);
                boolean check = true;
                List<String> bienSoXe = new ArrayList<>();
                List<Vehicle> vehicleList = new ArrayList<>();
                vehicleList = WriterReader.readFile("vehicle.csv");
                for (Vehicle vehicle : vehicleList){
                    if (vehicle instanceof Motorcycle){
                        bienSoXe.add(vehicle.getNumberPlate());
                    }
                }
                for (String string : bienSoXe){
                    if (string.equals(numberPlate)){
                        System.out.println("biển số xe đã tồn tại");
                        check = false;
                    }
                }
                if (check){
                    break;
                }
            }catch (VehicleException e ){
                System.err.println(e.getMessage());
            }
        }

        String name = null;
        int choose ;
        int index =0;
        boolean check = false;
        List<String> stringList = new ArrayList<>();
        stringList = ReaderFileHangSanXuat.readFile();

        do {
            for (int i =0; i<stringList.size();i++){
                System.out.println((i+1)+" :"+stringList.get(i));
            }
            System.out.println("choose menu");
            choose = Integer.parseInt(scanner.nextLine());
            for (int i =0 ;i<stringList.size();i++){
                if (i==choose-1){
                    index = i;
                    check = true;
                }
            }
            if (check){
                name = stringList.get(index).split(",")[1];
                break;
            }
        }while (choose>=stringList.size());

        int year = 0;
        String yearString = null;
        while (true){
            try{
                System.out.println("Input year of manufacturer");
                yearString = scanner.nextLine();
                VehicleException.checkYear(yearString);
                year = Integer.parseInt(yearString);
                break;
            }catch (VehicleException e){
                System.err.println(e.getMessage());
            }
        }

        String owner = null;
        while (true){
            try{
                System.out.println("Input owner");
                owner = scanner.nextLine();
                VehicleException.checkName(owner);
                break;
            }catch (VehicleException e){
                System.err.println(e.getMessage());
            }
        }

        int wattage = 0;
        String wattageString = null;
        while (true){
            try{
                System.out.println("Input wattage");
                wattageString = scanner.nextLine();
                wattage = Integer.parseInt(wattageString);
                break;
            }catch (NumberFormatException e){
                System.err.println(e.getMessage());
            }
        }

        List<Vehicle> vehicleList = new ArrayList<>();
        Vehicle motor=new Motorcycle(numberPlate,name,year,owner,wattage);
        vehicleList.add(motor);
        WriterReader.writeFile("vehicle.csv",vehicleList,true);
    }
}
