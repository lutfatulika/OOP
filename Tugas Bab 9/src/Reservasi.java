/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Reservasi extends Admin {
    private Pelanggan pelanggan;
    private String tanggal;
    private int jumlahOrang;

    // Constructor
    public Reservasi(Pelanggan pelanggan, String namaRestoran, String tanggal, int jumlahOrang) {
        super(namaRestoran);
        this.pelanggan = pelanggan;
        this.tanggal = tanggal;
        this.jumlahOrang = jumlahOrang;
    }

    // Getter & Setter
    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        if (pelanggan != null) {
            this.pelanggan = pelanggan;
        }
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public int getJumlahOrang() {
        return jumlahOrang;
    }

    public void setJumlahOrang(int jumlahOrang) {
        if (jumlahOrang > 0) {
            this.jumlahOrang = jumlahOrang;
        }
    }

    // Override abstract method tampilkanMenu
    @Override
    public void tampilkanMenu() {
        System.out.println("Menu Spesial Hari Ini di " + getNama() + ":");
        for (Makanan makanan : menu) {
            makanan.tampilkanInfo();
        }
    }

    // Tampilkan detail reservasi
    public void tampilkanDetailReservasi() {
        System.out.println("\n=== Detail Reservasi ===");
        System.out.println("Restoran       : " + getNama());
        System.out.println("Tanggal        : " + tanggal);
        System.out.println("Jumlah Orang   : " + jumlahOrang);
        pelanggan.tampilkanInfo();
    }

    @Override
    public void cetak() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
