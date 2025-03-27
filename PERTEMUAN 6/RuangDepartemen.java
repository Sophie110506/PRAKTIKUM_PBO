/*  
 * File               : RuangDepartemen.java  
 * Deskripsi          : Kelas RuangDepartemen yang mewarisi atribut dan metode dari kelas Ruang dalam konsep inheritance pada Java.  
 *                      Kelas ini merepresentasikan ruang departemen dengan tambahan atribut spesifik seperti jumlah meja, kursi, lemari,  
 *                      serta informasi nama dan ketua departemen.  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 27 Maret 2025  
 */

class RuangDepartemen extends Ruang {
    private int meja, kursi, lemari;
    private String namaDepartemen, ketuaDepartemen;
    
    public RuangDepartemen(String kode, double panjang, double lebar, double tinggi, int kapasitas, int meja, int kursi, int lemari, String namaDepartemen, String ketuaDepartemen) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.meja = meja;
        this.kursi = kursi;
        this.lemari = lemari;
        this.namaDepartemen = namaDepartemen;
        this.ketuaDepartemen = ketuaDepartemen;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Departemen: " + namaDepartemen + ", Ketua: " + ketuaDepartemen);
        System.out.println("Meja: " + meja + ", Kursi: " + kursi + ", Lemari: " + lemari);
    }
}