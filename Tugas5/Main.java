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

        // Membuat objek Reservasi (dengan lengkap: pelanggan, namaRestoran, tanggal, jumlahOrang)
        Reservasi reservasi1 = new Reservasi(pelanggan1, "Kuliner Khas Jawa", "2025-04-18", 4);

        // Menampilkan detail reservasi
        reservasi1.tampilkanDetailReservasi();

        // Mengakses nama pelanggan via getter
        System.out.println("\nNama pelanggan (akses via getter): " + reservasi1.getPelanggan().getNama());
    }
}
