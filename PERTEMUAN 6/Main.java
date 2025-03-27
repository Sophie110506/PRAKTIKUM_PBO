/*  
 * File               : Main.java  
 * Deskripsi          : Program utama untuk menguji berbagai kelas yang merepresentasikan ruangan  
 *                      dalam konsep inheritance pada Java. Program ini membuat beberapa objek dari  
 *                      kelas turunan Ruang dan menampilkan informasinya.  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 13 Maret 2025  
 */

 public class Main {
    public static void main(String[] args) {
        RuangKelas kelas = new RuangKelas("K101", 7, 8, 3, 40, 40, 5);
        RuangLabKomputer labKom = new RuangLabKomputer("A101", 12, 11, 4, 50, "Lab Komputer", 20, "ASUS");
        RuangLabNonKomputer labNonKom = new RuangLabNonKomputer("A102", 10, 9, 3, 35, "Lab Kimia", "Kimia");
        RuangDepartemen departemen = new RuangDepartemen("B101", 15, 14, 13, 15, 10, 11, 3, "Informatika", "Prof. Cia");
        RuangDosen dosen = new RuangDosen("C101", 6, 5, 4, 1, "Dr. Caca", 2, 1);
        
        kelas.tampilkanInfo();
        System.out.println("Biaya Kebersihan: " + kelas.hitungBiayaKebersihan(15000));
        System.out.println();
        
        labKom.tampilkanInfo();
        System.out.println("Biaya Kebersihan: " + labKom.hitungBiayaKebersihan(30000));
        System.out.println();
        
        labNonKom.tampilkanInfo();
        System.out.println("Biaya Kebersihan: " + labNonKom.hitungBiayaKebersihan(25000));
        System.out.println();
        
        departemen.tampilkanInfo();
        System.out.println("Biaya Kebersihan: " + departemen.hitungBiayaKebersihan(18000));
        System.out.println();
        
        dosen.tampilkanInfo();
        System.out.println("Biaya Kebersihan: " + dosen.hitungBiayaKebersihan(20000));
    }
}
