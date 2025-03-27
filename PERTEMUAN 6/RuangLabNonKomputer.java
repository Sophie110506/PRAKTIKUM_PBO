/*
 * File               : RuangLabNonKomputer.java  
 * Deskripsi          : Kelas yang merepresentasikan laboratorium non-komputer,  
 *                      turunan dari RuangLaboratorium  
  * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 27 Maret 2025  
 */

 public class RuangLabNonKomputer extends RuangLaboratorium {
    private String jenisLab; 

    public RuangLabNonKomputer(String kode, double panjang, double lebar, double tinggi, int kapasitas, String namaLab, String jenisLab) {
        super(kode, panjang, lebar, tinggi, kapasitas, namaLab);
        this.jenisLab = jenisLab;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Laboratorium: " + jenisLab);
    }
}
