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
        // Membuat objek Pelanggan dengan data makanan (via constructor)
        Pelanggan pelanggan1 = new Pelanggan("Andi", "081234567890", "Wingko Babat", 20000, "Makanan Utama");

        // Membuat objek Reservasi dengan data restoran dan pelanggan
        Reservasi reservasi1 = new Reservasi(pelanggan1, "Kuliner Khas Jawa");

        // Menampilkan detail reservasi melalui method public (bukan akses langsung)
        reservasi1.tampilkanDetailReservasi();

        // Contoh penggunaan enkapsulasi tambahan (pakai getter)
        System.out.println("\nNama pelanggan (akses via getter): " + reservasi1.getPelanggan().getNama());
    }
}
