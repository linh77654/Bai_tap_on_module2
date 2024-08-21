package model;

public class Account {

    private static final double LAI_SUAT = 0.035;
    private long soTaiKhoan;
    private String tenTaiKhoan;
    private double soTien;

    public Account() {
        this.soTaiKhoan = 0;
        this.tenTaiKhoan = "";
        this.soTien = 0;
    }

    public Account(long soTaiKhoan, String tenTaiKhoan, double soTien) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTien = soTien;
    }

    public Account(long soTaiKhoan, String tenTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.tenTaiKhoan = tenTaiKhoan;
        this.soTien = 50;

    }

    public long getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public void setSoTaiKhoan(long soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }

    public void setTenTaiKhoan(String tenTaiKhoan) {
        this.tenTaiKhoan = tenTaiKhoan;
    }

    public double getSoTien() {
        return soTien;
    }

    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    @Override
    public String toString() {
        return "Account{" +
                "soTaiKhoan=" + soTaiKhoan +
                ", tenTaiKhoan='" + tenTaiKhoan + '\'' +
                ", soTien=" + soTien +
                '}';
    }

    public void napTien(double soTienNap) {
        if (soTienNap > 0) {
            this.soTien += soTienNap;
        } else {
            System.out.println("Số tiền nap vào không hợp lệ");
        }
    }

    public void rutTien(double soTienRut, double phiRutTien) {
        double soTienRutDuoc = soTienRut + phiRutTien;
        if (soTienRut > 0 && soTienRutDuoc <= this.soTien) {
            this.soTien -= soTienRutDuoc;
        } else {
            System.out.println("Số tiền rút được không hợp lệ");
        }
    }
    public void daoHan(){
        this.soTien += this.soTien * LAI_SUAT;
    }

    public void chuyenKhoan(Account taiKhoanNhan, double soTienChuyen){
        if (soTienChuyen > 0 && soTienChuyen <= this.soTien) {
            this.soTien -= soTienChuyen;
            taiKhoanNhan.napTien(soTienChuyen);
        } else {
            System.out.println("Số tiền chuyển không hợp lệ hoặc không đủ số dư!");
    }
}
}