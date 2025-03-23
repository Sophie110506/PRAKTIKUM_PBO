/*  
 * File               : Pengusaha.java  
 * Deskripsi          : Kelas Pengusaha yang merupakan subclass dari kelas Manusia.  
 *                      Menambahkan atribut no_siup dan tahunMulaiKerja untuk menggambarkan  
 *                      data spesifik seorang pengusaha. Kelas ini juga menghitung pajak dan masa kerja.  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 20 Maret 2025  
 */

import java.time.LocalDate;

public class Pengusaha extends Manusia {
    private String no_siup;
    private int tahunMulaiKerja;
    private static int counterPengusaha = 0;

    public Pengusaha(String nama, LocalDate tgl_lahir, String alamat, double pendapatan, String no_siup, int tahunMulaiKerja) {
        super(nama, tgl_lahir, alamat, pendapatan);
        this.no_siup = no_siup;
        this.tahunMulaiKerja = tahunMulaiKerja;
        counterPengusaha++;
    }

    public static int getCounterPengusaha() {
        return counterPengusaha;
    }

    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    public int hitungMasaKerja() {
        int sekarang = LocalDate.now().getYear();
        int B = 4; 
        return (sekarang - tahunMulaiKerja) + B;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("No SIUP: " + no_siup);
        System.out.println("Tahun Mulai Kerja: " + tahunMulaiKerja);
    }
}
