package bai_tap_ThuVien.repository;

import bai_tap_ThuVien.model.TapChi;
import java.util.List;
import java.util.Optional;

public interface ITapChiRepository {
    void addTapChi(TapChi tapChi);
    boolean removeTapChi(String maTaiLieu);
    Optional<TapChi> findTapChiByMaTaiLieu(String maTaiLieu);
    List<TapChi> getAllTapChi();
    void updateTapChi(TapChi tapChi);
}
