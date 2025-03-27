/*  
 * File               : RuangDosen.java  
 * Deskripsi          : Kelas RuangDosen yang mewarisi atribut dan metode dari kelas Ruang dalam konsep inheritance pada Java.  
 *                      Kelas ini merepresentasikan ruangan dosen dengan atribut tambahan seperti nama dosen, jumlah kursi, dan meja.  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 27 Maret 2025  
 */

class RuangDosen extends Ruang {
    private String namaDosen;
    private int kursi, meja;
    
    public RuangDosen(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaDosen, int kursi, int meja) {
        super(kode, panjang, lebar, tinggi, kapasitas);
        this.namaDosen = namaDosen;
        this.kursi = kursi;
        this.meja = meja;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Dosen: " + namaDosen);
        System.out.println("Kursi: " + kursi + ", Meja: " + meja);
    }
}