/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author asus
 */
import java.util.Scanner;

public class MainInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Masukkan angka antara 1 hingga 10: ");
            int angka = scanner.nextInt();

            // Validasi input
            if (angka < 1 || angka > 10) {
                throw new InvalidInputException("Angka harus antara 1 hingga 10.");
            }

            System.out.println("Input yang Anda masukkan: " + angka);

        } catch (InvalidInputException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Input tidak valid. Pastikan Anda memasukkan angka.");
        } finally {
            scanner.close();
        }
    }
}

