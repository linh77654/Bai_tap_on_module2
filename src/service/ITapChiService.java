package service;

import model.TapChi;
import java.util.List;
import java.util.Optional;

public interface ITapChiService {
    void addTapChi(TapChi tapChi);
    boolean removeTapChi(String maTaiLieu);
    Optional<TapChi> findTapChiByMaTaiLieu(String maTaiLieu);
    List<TapChi> getAllTapChi();
    void updateTapChi(TapChi tapChi);
}
