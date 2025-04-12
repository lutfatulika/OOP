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
        // Membuat objek Restoran
        restoran restoran = new restoran("Kuliner Khas Jawa");

        // Membuat objek Makanan
        makanan makanan1 = new makanan("Wingko Babat", 20000, "Makanan Utama");
        makanan makanan2 = new makanan("Brem Madiun", 1500, "Makanan");
        makanan makanan3 = new makanan("Getuk Dieng", 10000, "Makanan");
        makanan makanan4 = new makanan("Ledre Bojonogoro", 30000, "Makanan");
        makanan makanan5 = new makanan("Petis Sidoarjo", 25000, "Makanan");

        // Menambahkan makanan ke dalam restoran
        restoran.tambahMakanan(makanan1);
        restoran.tambahMakanan(makanan2);
        restoran.tambahMakanan(makanan3);
        restoran.tambahMakanan(makanan4);
        restoran.tambahMakanan(makanan5);

        // Menampilkan menu restoran
        restoran.tampilkanMenu();
    }
}
