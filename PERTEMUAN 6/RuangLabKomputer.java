/*  
 * File               : RuangLabKomputer.java  
 * Deskripsi          : Kelas yang merepresentasikan laboratorium komputer,  
 *                      turunan dari RuangLaboratorium  
  * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 27 Maret 2025  
 */

 public class RuangLabKomputer extends RuangLaboratorium {
    private int jumlahKomputer;
    private String merekKomputer;

    public RuangLabKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, int jumlahKomputer, String merekKomputer) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab);
        this.jumlahKomputer = jumlahKomputer;
        this.merekKomputer = merekKomputer;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Komputer: " + jumlahKomputer);
        System.out.println("Merek Komputer: " + merekKomputer);
    }
}
