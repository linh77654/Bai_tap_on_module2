package service;

import repository.ISachRepository;
import repository.SachRepository;
import model.Sach;
import java.util.List;
import java.util.Optional;

public class SachService implements ISachService {
    private final ISachRepository sachRepository;

    public SachService() {
        this.sachRepository = new SachRepository();
    }

    @Override
    public void addSach(Sach sach) {
        sachRepository.addSach(sach);
    }

    @Override
    public boolean removeSach(String maTaiLieu) {
        return sachRepository.removeSach(maTaiLieu);
    }

    @Override
    public Optional<Sach> findSachByMaTaiLieu(String maTaiLieu) {
        return sachRepository.findSachByMaTaiLieu(maTaiLieu);
    }

    @Override
    public List<Sach> getAllSach() {
        return sachRepository.getAllSach();
    }

    @Override
    public void updateSach(Sach sach) {
        sachRepository.updateSach(sach);
    }
}
