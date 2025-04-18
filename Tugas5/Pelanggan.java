
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
public class Pelanggan {
    private String nama;
    private String namaMakanan;
    private int harga;
    private String kategori;

    // Constructor
    public Pelanggan(String nama, String namaMakanan, int harga, String kategori) {
        this.nama = nama;
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Getter
    public String getNama() {
        return nama;
    }

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
    public void setNama(String nama) {
        this.nama = nama;
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

    // Method menghitung total bayar
    public int hitungTotal(int jumlah) {
        return harga * jumlah;
    }

    // Method cetak struk pesanan
    public String cetakPesanan(int jumlah) {
        return "=== Struk Pesanan ===\n"
             + "Nama Pelanggan : " + nama + "\n"
             + "Nama Makanan   : " + namaMakanan + "\n"
             + "Harga Satuan   : Rp" + harga + "\n"
             + "Jumlah Pesanan : " + jumlah + "\n"
             + "Total Harga    : Rp" + hitungTotal(jumlah) + "\n"
             + "Kategori       : " + kategori + "\n";
    }

    // ✅ Overloading method cetakPesanan (dengan metode pembayaran)
    public String cetakPesanan(int jumlah, boolean includeMetodeBayar, String metodeBayar) {
        String struk = cetakPesanan(jumlah);
        if (includeMetodeBayar) {
            struk += "Metode Bayar   : " + metodeBayar + "\n";
        }
        return struk;
    }

    // ✅ Tambahan (jika ingin cetak sederhana)
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Makanan: " + namaMakanan);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Kategori: " + kategori);
    }
}   