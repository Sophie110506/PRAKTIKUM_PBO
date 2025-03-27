/*  
 * File               : RuangLaboratorium.java  
 * Deskripsi          : Kelas RuangLaboratorium yang mewarisi atribut dan metode dari kelas Ruang dalam konsep inheritance pada Java.  
 *                      Kelas ini merepresentasikan ruang laboratorium dengan atribut tambahan seperti nama laboratorium dan harga sewa.  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 27 Maret 2025  
 */

public class RuangLaboratorium extends Ruang {
    private String namaLab;
    private double hargaSewa;
    
    public RuangLaboratorium(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaLab = namaLab;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Nama Lab: " + namaLab + ", Harga Sewa: " + hargaSewa);
    }
}