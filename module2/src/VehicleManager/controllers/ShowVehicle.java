package VehicleManager.controllers;

import VehicleManager.commons.WriterReader;
import VehicleManager.manager.Car;
import VehicleManager.manager.Motorcycle;
import VehicleManager.manager.Truck;
import VehicleManager.manager.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ShowVehicle {
    public static void showAll(){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList = WriterReader.readFile("vehicle.csv");
        for (Vehicle vehicle : vehicleList){
            System.out.println(vehicle);
        }
    }

    public static void showTruck(){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList = WriterReader.readFile("vehicle.csv");
        for (Vehicle vehicle : vehicleList){
            if (vehicle instanceof Truck){
                System.out.println(vehicle.toString());
            }
        }
    }

    public static void showCar(){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList = WriterReader.readFile("vehicle.csv");
        for (Vehicle vehicle : vehicleList){
            if (vehicle instanceof Car){
                System.out.println(vehicle.toString());
            }
        }
    }

    public static void showMotor(){
        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList = WriterReader.readFile("vehicle.csv");
        for (Vehicle vehicle : vehicleList){
            if (vehicle instanceof Motorcycle){
                System.out.println(vehicle.toString());
            }
        }
    }
}
