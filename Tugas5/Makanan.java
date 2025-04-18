/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Makanan {
    private String namaMakanan;
    private int harga;
    private String kategori;

    // Constructor utama
    public Makanan(String namaMakanan, int harga, String kategori) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
    }

    // ✅ Overloading constructor (tanpa kategori)
    public Makanan(String namaMakanan, int harga) {
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = "Umum"; // default kategori
    }

    // ✅ Overloading constructor (hanya nama)
    public Makanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
        this.harga = 0;
        this.kategori = "Tidak diketahui";
    }

    // Getter
    public String getNamaMakanan() {
        return namaMakanan;
    }

    public int getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    // Setter
    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Method untuk menampilkan info makanan
    public void tampilkanInfo() {
        System.out.println("Nama Makanan : " + namaMakanan);
        System.out.println("Harga        : Rp" + harga);
        System.out.println("Kategori     : " + kategori);
    }
}
