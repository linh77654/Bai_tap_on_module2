package bai_tap_ThuVien.service;

import bai_tap_ThuVien.model.Sach;
import java.util.List;
import java.util.Optional;

public interface ISachService {
    void addSach(Sach sach);
    boolean removeSach(String maTaiLieu);
    Optional<Sach> findSachByMaTaiLieu(String maTaiLieu);
    List<Sach> getAllSach();
    void updateSach(Sach sach);
}
