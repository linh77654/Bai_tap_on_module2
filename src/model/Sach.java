package model;

public class Sach extends ThuVien {
    private String tenTacGia;
    private int soTrang;
    private String theLoai;

    public Sach(String maTaiLieu, String tieuDe, String nhaXuatBan, int namXuatBan, String tenTacGia, int soTrang, String theLoai) {
        super(maTaiLieu, tieuDe, nhaXuatBan, namXuatBan);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
        this.theLoai = theLoai;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "maTaiLieu='" + getMaTaiLieu() + '\'' +
                ", tieuDe='" + getTieuDe() + '\'' +
                ", nhaXuatBan='" + getNhaXuatBan() + '\'' +
                ", namXuatBan=" + getNamXuatBan() +
                ", tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", theLoai='" + theLoai + '\'' +
                '}';
    }
}
