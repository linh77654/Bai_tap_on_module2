package model;

public abstract class ThuVien {
    private String maTaiLieu;
    private String tieuDe;
    private String nhaXuatBan;
    private int namXuatBan;

    public ThuVien(String maTaiLieu, String tieuDe, String nhaXuatBan, int namXuatBan) {
        this.maTaiLieu = maTaiLieu;
        this.tieuDe = tieuDe;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "ThuVien{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", tieuDe='" + tieuDe + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", namXuatBan=" + namXuatBan +
                '}';
    }
}
