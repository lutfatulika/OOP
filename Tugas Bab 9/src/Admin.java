
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

public abstract class Admin implements CetakStruk {
    private String nama;
    protected List<Makanan> menu;

    public Admin(String nama) {
        this.nama = nama;
        this.menu = new ArrayList<>();
    }

    public String getNama() {
        return nama;
    }

    public void tambahMakanan(Makanan makanan) {
        menu.add(makanan);
    }

    public abstract void tampilkanMenu();

    // Method dari interface CetakStruk
    @Override
    public abstract void cetak();
}

