/*  
 * File               : MMain.java  
 * Deskripsi          : Kelas main untuk menguji penggunaan inheritance, abstract class, dan interface dalam program bangun datar  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 20 Maret 2025  
 */


public class MMain {
    public static void main(String[] args) {
        // BangunDatar B1 = new BangunDatar(); // ERROR karena abstract
        BangunDatar P1 = new Persegi(10, "Merah", "Hijau");
        Persegi P2 = new Persegi(5, "Putih", "Kuning");
        BangunDatar L1 = new Lingkaran(7, "Merah", "Ungu");
        Lingkaran L2 = new Lingkaran(14, "Biru", "Coklat");

        System.out.println("Luas P1: " + P1.getLuas());
        System.out.println("Luas P2: " + P2.getLuas());
        System.out.println("Luas L1: " + L1.getLuas());
        System.out.println("Luas L2: " + L2.getLuas());

        System.out.println("P1 sama luas dengan P2? " + P1.isEqualLuas(P2));
        System.out.println("L1 sama keliling dengan L2? " + L1.isEqualKeliling(L2));

        System.out.println("\n--- Zoom In ---");
        System.out.println("Sebelum zoomIn Lingkaran L2: " + L2.getJari());
        L2.zoomIn();
        System.out.println("Setelah zoomIn Lingkaran L2: " + L2.getJari());
        
        System.out.println("\n--- Zoom Out ---");
        System.out.println("Sebelum zoomOut Persegi P2: " + P2.getSisi());
        P2.zoomOut();
        System.out.println("Setelah zoomOut Persegi P2: " + P2.getSisi());
        
    }
}


/*
 * BAGIAN 1 - Abstract Class
 * SOAL NOMOR 3
 * Dari pembuatan objek seperti contoh di atas. Adakah kode yang bermasalah pada saat dijalankan?
 * JAWABAN:
 * BangunDatar B1 = new BangunDatar(); 
 * akan error karena BangunDatar adalah abstract class, dan Java tidak mengizinkan membuat objek langsung dari class abstract.
 */


/*
 * BAGIAN 2 - Interface
 * SOAL NOMOR 4
 * Lakukan eksperimen pemanggilan method yang telah dibuat dari IResize pada main method. Bagaimana hasilnya?
 * JAWABAN:
 * pemanggilan method zoomIn() berhasil memperbesar nilai jari-jari lingkaran sebesar 10%, 
 * dan method zoomOut() berhasil memperkecil nilai jari-jari sebesar 10%. 
 * Ini membuktikan bahwa interface dapat digunakan untuk menambahkan perilaku tertentu ke banyak class yang berbeda.
 */

/*
 * Apakah keuntungan saat method zoomIn(), zoomOut(), dan zoom() dikemas dalam interface IResize
 * dibanding dijadikan sebagai abstract method dalam class BangunDatar?
 * JAWABAN: 
 * Keuntungannya, kalau zoomIn(), zoomOut(), dan zoom() dibuat di interface IResize, method itu bisa dipakai oleh class mana saja, 
 * tidak harus turunan dari BangunDatar. Jadi lebih fleksibel dan bisa digunakan oleh banyak class berbeda yang punya fungsi zoom, 
 * seperti Garis, Bangun3D, dan lainnya.
 */