/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Pelanggan
        Pelanggan pelanggan1 = new Pelanggan(
            "Andi",
            "Wingko Babat",
            20000,
            "Makanan Utama"
        );

        // Membuat objek Reservasi
        Reservasi reservasi1 = new Reservasi(pelanggan1, "Kuliner Khas Jawa", "2025-04-18", 4);

        // Tambah menu
        reservasi1.tambahMakanan(new Makanan("Nasi Gudeg", 25000, "Tradisional"));
        reservasi1.tambahMakanan(new Makanan("Sate Ayam", 30000));
        reservasi1.tambahMakanan(new Makanan("Es Dawet"));

        // Menampilkan menu
        reservasi1.tampilkanMenu();

        // Menampilkan detail reservasi
        reservasi1.tampilkanDetailReservasi();

        // Akses nama pelanggan via getter
        System.out.println("\nNama pelanggan (akses via getter): " + reservasi1.getPelanggan().getNama());

        // Cetak struk
        System.out.println("\n" + pelanggan1.cetakPesanan(3, true, "Cash"));
    }
}

