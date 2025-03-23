/*  
 * File               : Manusia.java  
 * Deskripsi          : Class Manusia yang merepresentasikan data umum seseorang, mencakup atribut nama, tanggal lahir, alamat, dan pendapatan.  
 *                      Kelas ini juga memiliki penghitung jumlah objek Manusia yang dibuat.  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 20 Maret 2025  
 */

 import java.time.LocalDate;


public class Manusia {
    protected String nama;
    protected LocalDate tgl_lahir;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns = 0;

    public Manusia(String nama, LocalDate tgl_lahir, String alamat, double pendapatan) {
        this.nama = nama;
        this.tgl_lahir = tgl_lahir;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tgl_lahir);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + pendapatan);
    }
}
