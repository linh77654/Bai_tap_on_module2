package bai_tap_ThuVien.repository;

import bai_tap_ThuVien.model.Sach;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SachRepository implements ISachRepository {
    private static final String FILE_PATH = "src/bai_tap_ThuVien.data/ThuVien.CSV";

    @Override
    public void addSach(Sach sach) {
        List<Sach> sachList = loadSachFromCSV();
        sachList.add(sach);
        saveAllSach(sachList);
    }

    @Override
    public boolean removeSach(String maTaiLieu) {
        List<Sach> sachList = loadSachFromCSV();
        boolean isRemoved = sachList.removeIf(sach -> sach.getMaTaiLieu().equals(maTaiLieu));
        saveAllSach(sachList);
        return isRemoved;
    }

    @Override
    public Optional<Sach> findSachByMaTaiLieu(String maTaiLieu) {
        return loadSachFromCSV().stream()
                .filter(sach -> sach.getMaTaiLieu().equals(maTaiLieu))
                .findFirst();
    }

    @Override
    public List<Sach> getAllSach() {
        return loadSachFromCSV();
    }

    @Override
    public void updateSach(Sach updatedSach) {
        List<Sach> sachList = loadSachFromCSV();
        for (int i = 0; i < sachList.size(); i++) {
            if (sachList.get(i).getMaTaiLieu().equals(updatedSach.getMaTaiLieu())) {
                sachList.set(i, updatedSach);
                break;
            }
        }
        saveAllSach(sachList);
    }

    private List<Sach> loadSachFromCSV() {
        List<Sach> sachList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                Sach sach = new Sach(details[0], details[1], details[2], Integer.parseInt(details[3]),
                        details[4], Integer.parseInt(details[5]), details[6]);
                sachList.add(sach);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sachList;
    }

    private void saveAllSach(List<Sach> sachList) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Sach sach : sachList) {
                bw.write(sach.getMaTaiLieu() + "," + sach.getTieuDe() + "," + sach.getNhaXuatBan() + "," +
                        sach.getNamXuatBan() + "," + sach.getTenTacGia() + "," + sach.getSoTrang() + "," + sach.getTheLoai());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
