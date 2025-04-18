/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Reservasi extends Admin {
    // Atribut privat (enkapsulasi)
    private Pelanggan pelanggan;
    private String tanggal;      // Tambahan: tanggal reservasi
    private int jumlahOrang;     // Tambahan: jumlah orang

    /**
     * Konstruktor Reservasi
     *
     * @param pelanggan    Objek Pelanggan
     * @param namaRestoran Nama restoran (untuk Admin)
     * @param tanggal      Tanggal reservasi
     * @param jumlahOrang  Jumlah orang yang akan datang
     */
    public Reservasi(Pelanggan pelanggan, String namaRestoran, String tanggal, int jumlahOrang) {
        super(namaRestoran); // dari class Admin
        this.pelanggan = pelanggan;
        this.tanggal = tanggal;
        this.jumlahOrang = jumlahOrang;
    }

    // Getter & Setter untuk pelanggan
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        if (pelanggan != null) {
            this.pelanggan = pelanggan;
        }
    }

    // Getter & Setter untuk tanggal
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    // Getter & Setter untuk jumlah orang
    public int getJumlahOrang() {
        return jumlahOrang;
    }

    public void setJumlahOrang(int jumlahOrang) {
        if (jumlahOrang > 0) {
            this.jumlahOrang = jumlahOrang;
        }
    }

    /**
     * Menampilkan detail reservasi ke konsol
     */
    public void tampilkanDetailReservasi() {
        System.out.println("\n=== Detail Reservasi ===");
        System.out.println("Restoran       : " + getNama()); // dari class Admin
        System.out.println("Tanggal        : " + tanggal);
        System.out.println("Jumlah Orang   : " + jumlahOrang);
        Pelanggan.tampilkanInfo(); // dari class Pelanggan
    }
}
