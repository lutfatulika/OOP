/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author asus
 */
// Kelas Restoran
import java.util.ArrayList;
public class Restoran {
    private String namaRestoran;
    private ArrayList<Makanan> menu;
    
    public Restoran(String namaRestoran) {
        this.namaRestoran = namaRestoran;
        this.menu = new ArrayList<>();
    }
    
    public void tambahMakanan(Makanan makanan) {
        menu.add(makanan);
        System.out.println("Makanan " + makanan + " berhasil ditambahkan!");
    }
    
    public void tampilkanMenu() {
        System.out.println("Menu di " + namaRestoran + ":");
        for (Makanan m : menu) {
            m.tampilkanInfo();
        }
    }
}
