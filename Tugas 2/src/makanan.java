/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class makanan {
 private String nama;
    private int harga;
    private String kategori;

    // Constructor
    public makanan(String nama, int harga, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Method untuk menampilkan informasi makanan
    public void tampilkanInfo() {
        System.out.println(nama + " - Rp" + harga + " (" + kategori + ")");
    }   
}
