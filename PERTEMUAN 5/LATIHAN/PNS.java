/*  
 * File               : PNS.java  
 * Deskripsi          : Kelas PNS yang merupakan subclass dari kelas Manusia. Menambahkan atribut NIP sebagai identitas PNS.Kelas ini juga menghitung pajak (10%) dan masa kerja berdasarkan NIP.  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 20 Maret 2025  
 */

import java.time.LocalDate;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;

    public PNS(String nama, LocalDate tgl_lahir, String alamat, double pendapatan, String nip) {
        super(nama, tgl_lahir, alamat, pendapatan);
        this.nip = nip;
        counterPNS++;
    }

    public static int getCounterPNS() {
        return counterPNS;
    }

    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    public int hitungMasaKerja() {
        int tahunMulai = Integer.parseInt(nip.substring(8, 12));
        int sekarang = LocalDate.now().getYear();
        int A = 3; 
        return (sekarang - tahunMulai) + A;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("NIP: " + nip);
    }
}
