package bai_tap_ThuVien.controller;

import bai_tap_ThuVien.model.TapChi;
import bai_tap_ThuVien.service.ITapChiService;
import bai_tap_ThuVien.service.TapChiService;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class TapChiController {
    private final ITapChiService tapChiService = new TapChiService();
    private final Scanner scanner = new Scanner(System.in);

    public void displayTapChi() {
        List<TapChi> tapChiList = tapChiService.getAllTapChi();
        if (!tapChiList.isEmpty()) {
            for (TapChi tapChi : tapChiList) {
                System.out.println(tapChi);
            }
        } else {
            System.out.println("Không có tạp chí nào.");
        }
    }


    public void addTapChi() {
        System.out.println("Nhập mã tài liệu:");
        String maTaiLieu = scanner.nextLine();
        System.out.println("Nhập tiêu đề:");
        String tieuDe = scanner.nextLine();
        System.out.println("Nhập nhà xuất bản:");
        String nhaXuatBan = scanner.nextLine();
        System.out.println("Nhập năm xuất bản:");
        int namXuatBan = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chủ đề:");
        String chuDe = scanner.nextLine();

        TapChi tapChi = new TapChi(maTaiLieu, tieuDe, nhaXuatBan, namXuatBan, chuDe);
        tapChiService.addTapChi(tapChi);
        System.out.println("Thêm tạp chí thành công.");
    }

    public void searchTapChi() {
        System.out.println("Nhập mã tài liệu của tạp chí cần tìm:");
        String maTaiLieu = scanner.nextLine();
        Optional<TapChi> tapChi = tapChiService.findTapChiByMaTaiLieu(maTaiLieu);
        if (tapChi.isPresent()) {
            System.out.println("Tìm thấy tạp chí: " + tapChi.get());
        } else {
            System.out.println("Không tìm thấy tạp chí với mã tài liệu " + maTaiLieu);
        }
    }

    public void deleteTapChi() {
        System.out.println("Nhập mã tài liệu của tạp chí cần xoá:");
        String maTaiLieu = scanner.nextLine();
        boolean isDeleted = tapChiService.removeTapChi(maTaiLieu);
        if (isDeleted) {
            System.out.println("Xoá tạp chí thành công.");
        } else {
            System.out.println("Không tìm thấy tạp chí với mã tài liệu " + maTaiLieu);
        }
    }
}
