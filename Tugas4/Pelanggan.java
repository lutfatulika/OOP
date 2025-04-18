
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */public class Pelanggan {
    private String nama;
    private String namaMakanan;
    private int harga;
    private String kategori;

    public Pelanggan(String nama, String namaMakanan, int harga, String kategori) {
        this.nama = nama;
        this.namaMakanan = namaMakanan;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Getter dan Setter
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

    public int hitungTotal(int jumlah) {
        return harga * jumlah;
    }

    public String cetakPesanan(int jumlah) {
        return "=== Struk Pesanan ===\n"
             + "Nama Pelanggan : " + nama + "\n"
             + "Nama Makanan   : " + namaMakanan + "\n"
             + "Harga Satuan   : " + harga + "\n"
             + "Jumlah Pesanan : " + jumlah + "\n"
             + "Total Harga    : " + hitungTotal(jumlah) + "\n"
             + "Kategori       : " + kategori + "\n";
    }
}

    