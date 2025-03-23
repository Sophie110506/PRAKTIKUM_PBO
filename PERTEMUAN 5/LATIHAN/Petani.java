/*  
 * File               : Petani.java  
 * Deskripsi          : Kelas Petani yang merupakan subclass dari kelas Manusia.  
 *                      Menambahkan atribut asal untuk menyimpan daerah asal petani.  
 *                      Kelas ini juga menghitung pajak (0%) dan masa kerja.  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 20 Maret 2025  
 */

import java.time.LocalDate;

public class Petani extends Manusia {
    private String asal;
    private static int counterPetani = 0;

    public Petani(String nama, LocalDate tgl_lahir, String alamat, double pendapatan, String asal) {
        super(nama, tgl_lahir, alamat, pendapatan);
        this.asal = asal;
        counterPetani++;
    }

    public static int getCounterPetani() {
        return counterPetani;
    }

    public double hitungPajak() {
        return 0.0;
    }

    public int hitungMasaKerja() {
        int C = 0; 
        int tahunMulai = tgl_lahir.getYear(); 
        int sekarang = LocalDate.now().getYear();
        return (sekarang - tahunMulai) + C;
    }

    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Asal: " + asal);
    }
}
