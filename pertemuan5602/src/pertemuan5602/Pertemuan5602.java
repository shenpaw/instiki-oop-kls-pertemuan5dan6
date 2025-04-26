/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5602;

/**
 *
 * @author Shendy Aulia Mursyd
 * TGL: 26-04-2025
 */
import javax.swing.JOptionPane;
public class Pertemuan5602 {

    public static void main(String[] args) {
        // Membuat objek LuasSegiTiga
        LuasSegiTiga SegiTiga01 = new LuasSegiTiga();
        
        // Meminta input alas dan tinggi menggunakan JOptionPane
        String inputAlas = JOptionPane.showInputDialog("Masukkan alas segitiga:");
        String inputTinggi = JOptionPane.showInputDialog("Masukkan tinggi segitiga:");
        
        // Mengonversi input dari String ke tipe data numerik
        SegiTiga01.alas = (int) Double.parseDouble(inputAlas);
        SegiTiga01.tinggi = (int) Double.parseDouble(inputTinggi);
        
        // Menampilkan hasil perhitungan luas segitiga
        JOptionPane.showMessageDialog(null, "Luas Segitiga adalah " + SegiTiga01.hitungluas());
    }
}

