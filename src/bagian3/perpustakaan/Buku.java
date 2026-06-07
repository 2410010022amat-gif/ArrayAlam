/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.perpustakaan;

/**
 *
 * @author user
 */

public class Buku {
    private final String judul;
    private final String penulis;
    private boolean dipinjam;
    // Latihan mandiri no.2: tambah atribut ini
    private final int tahunTerbit;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }
    public String getJudul()    { return judul; }
    public String getPenulis()  { return penulis; }
    public int getTahunTerbit() { return tahunTerbit; }
    public boolean isDipinjam() { return dipinjam; }
    public void setDipinjam(boolean dipinjam) { this.dipinjam = dipinjam; }

    public String info() {
        String status = dipinjam ? "Dipinjam" : "Tersedia";
        return judul + " oleh " + penulis + " (" + tahunTerbit + ") [" + status + "]";
    }
}
