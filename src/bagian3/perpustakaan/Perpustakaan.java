/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.perpustakaan;

/**
 *
 * @author user
 */
import java.util.ArrayList;
public class Perpustakaan {
    private final ArrayList<Buku> koleksi = new ArrayList<>();

    public void tambahBuku(Buku buku) { koleksi.add(buku); }

    public void tampilkanKoleksi() {
        System.out.println("== Koleksi Perpustakaan ==");
        for (int i = 0; i < koleksi.size(); i++) {
            System.out.println((i + 1) + ". " + koleksi.get(i).info());
        }
    }

    public void pinjamBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                if (b.isDipinjam()) System.out.println(judul + " sedang dipinjam.");
                else { b.setDipinjam(true); System.out.println(judul + " berhasil dipinjam."); }
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // Latihan mandiri no.1
    public void kembalikanBuku(String judul) {
        for (Buku b : koleksi) {
            if (b.getJudul().equals(judul)) {
                b.setDipinjam(false);
                System.out.println(judul + " telah dikembalikan.");
                return;
            }
        }
        System.out.println("Buku " + judul + " tidak ditemukan.");
    }

    // Latihan mandiri no.3
    public void cariPenulis(String penulis) {
        System.out.println("Buku karya " + penulis + ":");
        for (Buku b : koleksi) {
            if (b.getPenulis().equals(penulis)) System.out.println("  - " + b.info());
        }
    }

    public int jumlahTersedia() {
        int jumlah = 0;
        for (Buku b : koleksi) { if (!b.isDipinjam()) jumlah++; }
        return jumlah;
    }
}
