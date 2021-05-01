package VehicleManager.commons;

import VehicleManager.manager.Vehicle;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class VehicleException extends Exception {
    public VehicleException(String message) {
        super(message);
    }
    //+ Xe tải: XXC-XXX.XX (X : 0÷9)
    //+ Ôtô: XXY-XXX.XX (X : 0÷9 , Y=A nếu xe du lịch, Y=B  nếu xe khách)


    @Override
    public String toString() {
        return "VehicleException{}";
    }

   public static void checkName(String name) throws VehicleException{
        String regex = "^[A-Z][a-z]+$";
        if (!name.matches(regex)){
            throw new VehicleException("Name format Xxxx");
        }
   }

   public static void checkYear(String year) throws VehicleException{
        String regex = "^[1|2][0-9]{3}$";
        if (!year.matches(regex)){
            throw new VehicleException("Year format 1XXX | 2XXX");
        }
   }


   public static void checkNumberPlateOfTruck(String numberPlate) throws VehicleException {
        String regex = "^[0-9]{2}C-[0-9]{3}.[0-9]{2}$";
        if (!numberPlate.matches(regex)){
            throw new VehicleException("Number plate format XXC-XXX.XX");
        }
   }

   public static void checkNumberPlateOfCar(String numberPlate) throws VehicleException{
        String regex = "^[0-9]{2}[A|B]-[0-9]{3}.[0-9]{2}$";
        if (!numberPlate.matches(regex)){
            throw new VehicleException("Number plate format XXY-XXX.XX");
        }
   }
    //+ Xe máy: XX-YZ-XXX.XX (X : 0÷9, Y= (Chữ cái in hoa), Z =(0÷9) hoặc (Chữ cái in Hoa).
    public static void checkNumberPlateOfMotor(String numberPlate) throws VehicleException{
        String regex = "^[0-9]{2}-[A-Z][A-Z|0-9]-[0-9]{3}.[0-9]{2}$";
        if (!numberPlate.matches(regex)){
            throw new VehicleException("Number plate format XX-YZ-XXX.XX");
        }
    }


}
