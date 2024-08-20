package vivew;

import model.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        while (true) {
            System.out.println("===== Sở Quan lý giao Thông =====");
            System.out.println("1.Tạo các đối tượng xe và nhập thông tin");
            System.out.println("2.Xuất bảng kê khai tiền thuế của các xe");
            System.out.println("3. Thoát ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("nhập tên chủ sở hữu: ");
                    String owenr = scanner.nextLine();

                    System.out.print("Nhập trị giá xe: ");
                    double value = scanner.nextDouble();

                    System.out.print("Nhập dung tích xy lanh (cc): ");
                    int cylinderCapacity = scanner.nextInt();
                    scanner.nextLine();

                    Vehicle vehicle = new Vehicle(owenr, value, cylinderCapacity);
                    vehicleList.add(vehicle);

                    System.out.println("Đã thêm xe thành công!");
                    break;

                case 2:
                    if (vehicleList.isEmpty()) {
                        System.out.println("Không có xe nào để hiển thị.");
                    } else {
                        System.out.println("===== Bảng kê khai tiền thuế các xe =====");
                        for (Vehicle v : vehicleList) {
                            v.displayInfo();
                            System.out.println("----------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                    break;
            }
        }
    }
}
