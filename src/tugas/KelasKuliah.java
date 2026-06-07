/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author user
 */

import java.util.ArrayList;
public class KelasKuliah {
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa(Mahasiswa m) { daftarMahasiswa.add(m); }

    public double hitungRataRata() {
        double total = 0;
        for (Mahasiswa m : daftarMahasiswa) { total += m.getNilai(); }
        return daftarMahasiswa.isEmpty() ? 0 : total / daftarMahasiswa.size();
    }

    public int jumlahLulus() {
        int lulus = 0;
        for (Mahasiswa m : daftarMahasiswa) { if (m.lulus()) lulus++; }
        return lulus;
    }

    public void tampilkanSemua() {
        System.out.println("== Daftar Mahasiswa ==");
        for (int i = 0; i < daftarMahasiswa.size(); i++) {
            System.out.println((i + 1) + ". " + daftarMahasiswa.get(i));
        }
        System.out.println("Total mahasiswa: " + daftarMahasiswa.size());
    }
}
