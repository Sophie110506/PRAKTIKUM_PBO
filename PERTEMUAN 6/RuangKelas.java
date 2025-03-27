/*  
 * File               : Main.java  
 * Deskripsi          : Program utama untuk menguji berbagai kelas yang merepresentasikan ruangan  
 *                      dalam konsep inheritance pada Java. Program ini membuat beberapa objek dari  
 *                      kelas turunan Ruang dan menampilkan informasinya.  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 27 Maret 2025  
 */

public class RuangKelas extends Ruang {
    private int jumlahKursi, kursiRusak;
    
    public RuangKelas(String kode, double panjang, double lebar, double tinggi, int kapasitas, int jumlahKursi, int kursiRusak) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.jumlahKursi = jumlahKursi;
        this.kursiRusak = kursiRusak;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Kursi: " + jumlahKursi + ", Kursi Rusak: " + kursiRusak);
    }
}