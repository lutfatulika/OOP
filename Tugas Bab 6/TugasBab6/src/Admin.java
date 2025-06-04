
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
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public abstract class Admin {
    private String nama;
    protected List<Makanan> menu;

    // Constructor
    public Admin(String nama) {
        this.nama = nama;
        this.menu = new ArrayList<>();
    }

    // Getter
    public String getNama() {
        return nama;
    }

    // Method untuk menambahkan makanan ke dalam menu
    public void tambahMakanan(Makanan makanan) {
        menu.add(makanan);
    }

    // Abstract method yang harus diimplementasi di subclass
    public abstract void tampilkanMenu();
}
