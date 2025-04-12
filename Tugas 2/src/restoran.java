
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
import java.util.ArrayList;
import java.util.List;
public class restoran {
    private String nama;
    private List<makanan> menu;

    // Constructor
    public restoran(String nama) {
        this.nama = nama;
        this.menu = new ArrayList<>();
    }

    // Method untuk menambahkan makanan ke dalam menu
    public void tambahMakanan(makanan makanan) {
        menu.add(makanan);
    }

    // Method untuk menampilkan daftar menu restoran
    public void tampilkanMenu() {
        System.out.println("Menu di " + nama + ":");
        for (makanan makanan : menu) {
            makanan.tampilkanInfo();
        }
    }
}
