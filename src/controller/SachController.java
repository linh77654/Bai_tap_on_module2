package controller;

import model.Sach;
import service.ISachService;
import service.SachService;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class SachController {
    private final ISachService sachService = new SachService();
    private final Scanner scanner = new Scanner(System.in);

    public void displaySach() {
        List<Sach> sachList = sachService.getAllSach();
        if (!sachList.isEmpty()) {
            for (Sach sach : sachList) {
                System.out.println(sach);
            }
        } else {
            System.out.println("Không có sách nào.");
        }
    }

    public void addSach() {
        System.out.println("Nhập mã tài liệu:");
        String maTaiLieu = scanner.nextLine();
        System.out.println("Nhập tiêu đề:");
        String tieuDe = scanner.nextLine();
        System.out.println("Nhập nhà xuất bản:");
        String nhaXuatBan = scanner.nextLine();
        System.out.println("Nhập năm xuất bản:");
        int namXuatBan = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên tác giả:");
        String tenTacGia = scanner.nextLine();
        System.out.println("Nhập số trang:");
        int soTrang = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập thể loại:");
        String theLoai = scanner.nextLine();

        Sach sach = new Sach(maTaiLieu, tieuDe, nhaXuatBan, namXuatBan, tenTacGia, soTrang, theLoai);
        sachService.addSach(sach);
        System.out.println("Thêm sách thành công.");
    }

    public void searchSach() {
        System.out.println("Nhập mã tài liệu của sách cần tìm:");
        String maTaiLieu = scanner.nextLine();
        Optional<Sach> sach = sachService.findSachByMaTaiLieu(maTaiLieu);
        if (sach.isPresent()) {
            System.out.println("Tìm thấy sách: " + sach.get());
        } else {
            System.out.println("Không tìm thấy sách với mã tài liệu " + maTaiLieu);
        }
    }

    public void deleteSach() {
        System.out.println("Nhập mã tài liệu của sách cần xoá:");
        String maTaiLieu = scanner.nextLine();
        boolean isDeleted = sachService.removeSach(maTaiLieu);
        if (isDeleted) {
            System.out.println("Xoá sách thành công.");
        } else {
            System.out.println("Không tìm thấy sách với mã tài liệu " + maTaiLieu);
        }
    }
}
