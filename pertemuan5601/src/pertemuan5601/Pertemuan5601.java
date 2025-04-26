/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan5601;

/**
 *
 * @author Shendy Aulia Mursyd
 * TGL: 26-04-2025
 */
public class Pertemuan5601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kucing Cara = new kucing();
        Cara.warnabulu="putih";
        Cara.warnamata="biru";
//        Cara.gender="betina";
        Cara.Setkarakteristik("bloon");
        Cara.Setperan("kucing rumahan");
        
        kucing Joko = new kucing();
        Joko.warnabulu="oren";
        Joko.warnamata="hijau";
//        Joko.gender="jantan";
        Joko.Setkarakteristik("manja");
        Joko.Setperan("preman kampung");
        
    }
    
}
//cara membuat class, harus diluar publik class
class kucing{
    String warnabulu = ""; // bisa dibuat seperti ini public String warnabulu="";
    public String warnamata = ""; // tujuannya hanya umtuk menegaskan agar bisa di akses publik, tp tanpa public defaultnya memang publik
    private String gender = "";
    private String karakteristik = ""; //hanya bisa dialses di dalam class kucing, jika ingin di akses dari lokasi lain harus dibuatkan metode
    private String peran = "";
    
    //membuat Constructor
    //boleh dibuat atau jga tidak
//    public kucing(String gender){
//        this.gender = gender;
//    }
    
    //agar private dapat di akses 
    public void Setkarakteristik(String karakter){ //dengan atau tanpa public hasilnya sama
        // menambahkan kode identifikasi
        this.karakteristik = karakter;
    }
    void Setperan(String peran){
        // menambahkan kode identifikasi
        this.peran = peran;
    }
}