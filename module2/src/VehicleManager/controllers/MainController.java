package VehicleManager.controllers;

import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    public static void menuFunction(){
        int choose;
        do {
            System.out.println(" CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG\n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    FunctionController.addVehicle();
                    break;
                case 2:
                    FunctionController.showVehicle();
                    break;
                case 3:
                    FunctionController.deleteVehicle();
                    break;
                case 4:
                    System.exit(0);
            }
        }while (true);
    }
}
