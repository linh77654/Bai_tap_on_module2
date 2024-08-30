package service;

import repository.ITapChiRepository;
import repository.TapChiRepository;
import model.TapChi;
import java.util.List;
import java.util.Optional;

public class TapChiService implements ITapChiService {
    private final ITapChiRepository tapChiRepository;

    public TapChiService() {
        this.tapChiRepository = new TapChiRepository();
    }

    @Override
    public void addTapChi(TapChi tapChi) {
        tapChiRepository.addTapChi(tapChi);
    }

    @Override
    public boolean removeTapChi(String maTaiLieu) {
        return tapChiRepository.removeTapChi(maTaiLieu);
    }

    @Override
    public Optional<TapChi> findTapChiByMaTaiLieu(String maTaiLieu) {
        return tapChiRepository.findTapChiByMaTaiLieu(maTaiLieu);
    }

    @Override
    public List<TapChi> getAllTapChi() {
        return tapChiRepository.getAllTapChi();
    }

    @Override
    public void updateTapChi(TapChi tapChi) {
        tapChiRepository.updateTapChi(tapChi);
    }
}
