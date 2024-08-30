package repository;

import model.Sach;
import java.util.List;
import java.util.Optional;

public interface ISachRepository {
    void addSach(Sach sach);
    boolean removeSach(String maTaiLieu);
    Optional<Sach> findSachByMaTaiLieu(String maTaiLieu);
    List<Sach> getAllSach();
    void updateSach(Sach sach);
}
