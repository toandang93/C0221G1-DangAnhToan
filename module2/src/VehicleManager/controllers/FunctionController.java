package VehicleManager.controllers;

import VehicleManager.commons.WriterReader;
import VehicleManager.manager.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FunctionController {
    static Scanner scanner = new Scanner(System.in);
    public static void addVehicle(){
        int choose;
        do {
            System.out.println("1. Thêm xe tải,\n" +
                    " \t2. Thêm ôtô, \n" +
                    "3. Thêm  xe máy.\n" +
                    "4. Trở về menu\n" +
                    "5.Thoát");
            System.out.println("Input your choose");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    AddVehicle.addTruck();
                    break;
                case 2:
                    AddVehicle.addCar();
                    break;
                case 3:
                    AddVehicle.addMotor();
                    break;
                case 4:
                    return;
                case 5:
                    System.exit(0);
            }
        }while (true);
    }

    public static void showVehicle(){
        int choose;
        do {
            System.out.println("1. Hiện thị xe tải.\n" +
                    "2. Hiện thị ôtô. \n" +
                    "3. Hiện  xe máy.\n" +
                    "4. Hiển thị tất cả\n" +
                    "5. Trở về menu\n" +
                    "6. Thoát");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    ShowVehicle.showTruck();
                    break;
                case 2:
                    ShowVehicle.showCar();
                    break;
                case 3:
                    ShowVehicle.showMotor();
                    break;
                case 4:
                    ShowVehicle.showAll();
                    break;
                case 5:
                    return;
                case 6:
                    System.exit(0);
                default:
                    break;
            }
        }while (true);

    }

    public static void deleteVehicle(){
        int choose;
        boolean check = false;
        int index = -1;
        System.out.println("Enter your number of plate need to delete");
        String numberPlate = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList = WriterReader.readFile("vehicle.csv");
        for (int i =0 ;i<vehicleList.size();i++){
            if (vehicleList.get(i).getNumberPlate().equals(numberPlate)){
                check = true;
                index = i;
            }
        }
        if (check){
            System.out.println("Enter your choose :\n" +
                    "1.Yes\n" +
                    "2.No");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    vehicleList.remove(vehicleList.get(index));
                    System.out.println("delete done");
                    WriterReader.writeFile("vehicle.csv",vehicleList,false);
                    break;
                case 2:
                    return;
                default:
                    break;
            }

        }else {
            System.out.println("dose not exist");
        }
    }
}
