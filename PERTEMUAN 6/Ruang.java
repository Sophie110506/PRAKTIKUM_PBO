/*  
 * File               : Ruang.java  
 * Deskripsi          : Kelas Ruang sebagai superclass yang merepresentasikan ruangan dengan atribut dasar  
 *                      seperti kode ruang, dimensi, dan kapasitas. Kelas ini juga menyediakan metode untuk  
 *                      menghitung biaya kebersihan dan menampilkan informasi ruangan.  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 27 Maret 2025  
 */

public class Ruang {
    protected String kode;
    protected double panjang, lebar, tinggi;
    protected int kapasitas;
    
    public Ruang(String kode, double panjang, double lebar, double tinggi, int kapasitas) {
        this.kode = kode;
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
        this.kapasitas = kapasitas;
    }
    
    public double hitungBiayaKebersihan(double tarif) {
        return panjang * lebar * tarif;
    }
    
    public void tampilkanInfo() {
        System.out.println("Kode Ruang: " + kode);
        System.out.println("Dimensi: " + panjang + "x" + lebar + "x" + tinggi);
        System.out.println("Kapasitas: " + kapasitas);
    }
}