package vivew;

import controller.SachController;
import controller.TapChiController;

import java.util.Scanner;

public class ThuVienManagement {
    private static final SachController sachController = new SachController();
    private static final TapChiController tapChiController = new TapChiController();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Quản lý Thư Viện: \n" +
                    "1: Hiển thị tất cả loại tài liệu hiện có. \n" +
                    "2: Thêm mới tài liệu thư viện. \n" +
                    "3: Xóa tài liệu. \n" +
                    "4: Tìm kiếm tài liệu hiện có. \n" +
                    "5: Thoát chương trình. \n" +
                    "Xin chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayAll();
                    break;
                case 2:
                    addThuVien();
                    break;
                case 3:
                    deleteThuVien();
                    break;
                case 4:
                    searchThuVien();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
            }
        } while (choice != 5);
    }

    private static void displayAll() {
        System.out.println("1: Hiển thị tất cả sách. \n" +
                "2: Hiển thị tất cả tạp chí.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                sachController.displaySach();
                break;
            case 2:
                tapChiController.displayTapChi();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
        }
    }

    private static void addThuVien() {
        System.out.println("1: Thêm sách. \n" +
                "2: Thêm tạp chí.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                sachController.addSach();
                break;
            case 2:
                tapChiController.addTapChi();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
        }
    }

    private static void deleteThuVien() {
        System.out.println("1: Xóa sách. \n" +
                "2: Xóa tạp chí.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                sachController.deleteSach();
                break;
            case 2:
                tapChiController.deleteTapChi();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
        }
    }

    private static void searchThuVien() {
        System.out.println("1: Tìm kiếm sách. \n" +
                "2: Tìm kiếm tạp chí.");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                sachController.searchSach();
                break;
            case 2:
                tapChiController.searchTapChi();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
        }
    }
}
