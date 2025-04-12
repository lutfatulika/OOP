/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Makanan {
    private String nama;
    private double harga;
    private String kategori;
    
    public Makanan(String nama, double harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }
    
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama );
        System.out.println("Harga: Rp " + harga );
        System.out.println("Kategori: " + kategori);
    }
}

