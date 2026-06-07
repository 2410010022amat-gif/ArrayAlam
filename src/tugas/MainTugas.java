/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author user
 */
// Nama : Noor Alamsyah
// NPM  : 2410010052

public class MainTugas {
    public static void main(String[] args) {
        // Array mata kuliah (ukuran tetap)
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Basis Data", "Algoritma dan Struktur Data"};
        System.out.println("=== Mata Kuliah ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Andi Saputra",   "2301001", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso",   "2301002", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Dewi",     "2301003", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Deni Kurniawan", "2301004", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka Putri",      "2301005", 72.0));

        kelas.tampilkanSemua();
        System.out.println();
        System.out.printf("Rata-rata nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        // Tambah mahasiswa baru
        System.out.println();
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Ramadhan", "2301006", 68.0));
        System.out.println("Setelah penambahan:");
        kelas.tampilkanSemua();
    }
}