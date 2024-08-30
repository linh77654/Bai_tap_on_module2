package bai_tap_ThuVien.repository;

import bai_tap_ThuVien.model.TapChi;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TapChiRepository implements ITapChiRepository {
    private static final String FILE_PATH = "src/bai_tap_ThuVien.data/TapChi.csv";

    @Override
    public void addTapChi(TapChi tapChi) {
        List<TapChi> tapChiList = loadTapChiFromCSV();
        tapChiList.add(tapChi);
        saveAllTapChi(tapChiList);
    }

    @Override
    public boolean removeTapChi(String maTaiLieu) {
        List<TapChi> tapChiList = loadTapChiFromCSV();
        boolean isRemoved = tapChiList.removeIf(tapChi -> tapChi.getMaTaiLieu().equals(maTaiLieu));
        saveAllTapChi(tapChiList);
        return isRemoved;
    }

    @Override
    public Optional<TapChi> findTapChiByMaTaiLieu(String maTaiLieu) {
        return loadTapChiFromCSV().stream()
                .filter(tapChi -> tapChi.getMaTaiLieu().equals(maTaiLieu))
                .findFirst();
    }

    @Override
    public List<TapChi> getAllTapChi() {
        return loadTapChiFromCSV();
    }

    @Override
    public void updateTapChi(TapChi updatedTapChi) {
        List<TapChi> tapChiList = loadTapChiFromCSV();
        for (int i = 0; i < tapChiList.size(); i++) {
            if (tapChiList.get(i).getMaTaiLieu().equals(updatedTapChi.getMaTaiLieu())) {
                tapChiList.set(i, updatedTapChi);
                break;
            }
        }
        saveAllTapChi(tapChiList);
    }

    private List<TapChi> loadTapChiFromCSV() {
        List<TapChi> tapChiList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] details = line.split(",");
                TapChi tapChi = new TapChi(details[0], details[1], details[2], Integer.parseInt(details[3]), details[4]);
                tapChiList.add(tapChi);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tapChiList;
    }


    private void saveAllTapChi(List<TapChi> tapChiList) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (TapChi tapChi : tapChiList) {
                bw.write(tapChi.getMaTaiLieu() + "," + tapChi.getTieuDe() + "," + tapChi.getNhaXuatBan() + "," +
                        tapChi.getNamXuatBan() + "," + tapChi.getChuDe());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
