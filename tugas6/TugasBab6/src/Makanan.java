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

    // Overloading constructor
    public Makanan(String namaMakanan, int harga) {
        this(namaMakanan, harga, "Umum");
    }

    public Makanan(String namaMakanan) {
        this(namaMakanan, 0, "Tidak diketahui");
    }

    // Getter & Setter
    public String getNamaMakanan() {
        return namaMakanan;
    }

    public int getHarga() {
        return harga;
    }

    public String getKategori() {
        return kategori;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    // Menampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama Makanan : " + namaMakanan);
        System.out.println("Harga        : Rp" + harga);
        System.out.println("Kategori     : " + kategori);
    }
}
