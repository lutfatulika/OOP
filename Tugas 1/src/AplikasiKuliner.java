/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class AplikasiKuliner {
    public static void main(String[] args) {
        Restoran restoran = new Restoran("Kuliner Khas Jawa ");
        
        Makanan makanan1 = new Makanan("Wingko Babat", 20000, "Makanan Utama");
        Makanan makanan2 = new Makanan("Brem Madiun", 1500, "Makanan");
        Makanan makanan3 = new Makanan("Getuk Dieng", 10000, "Makanan");
        Makanan makanan4 = new Makanan("Ledre Bojonogoro", 30000, "Makanan");
        Makanan makanan5 = new Makanan("Petis Sidoarjo", 25000, "Makanan");
        
        
        restoran.tambahMakanan(makanan1);
        restoran.tambahMakanan(makanan2);
        restoran.tambahMakanan(makanan3);
        restoran.tambahMakanan(makanan4);
        restoran.tambahMakanan(makanan5);
        
        restoran.tampilkanMenu();
    }
}
