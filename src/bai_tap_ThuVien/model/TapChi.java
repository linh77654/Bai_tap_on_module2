package bai_tap_ThuVien.model;

public class TapChi extends ThuVien {
    private String chuDe;

    public TapChi(String maTaiLieu, String tieuDe, String nhaXuatBan, int namXuatBan, String chuDe) {
        super(maTaiLieu, tieuDe, nhaXuatBan, namXuatBan);
        this.chuDe = chuDe;
    }

    public String getChuDe() {
        return chuDe;
    }

    public void setChuDe(String chuDe) {
        this.chuDe = chuDe;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "maTaiLieu='" + getMaTaiLieu() + '\'' +
                ", tieuDe='" + getTieuDe() + '\'' +
                ", nhaXuatBan='" + getNhaXuatBan() + '\'' +
                ", namXuatBan=" + getNamXuatBan() +
                ", chuDe='" + chuDe + '\'' +
                '}';
    }
}
