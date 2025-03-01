/*Nama File     : Mgaris.java
 *Deskripsi     : Berisi main class garis
 * Pembuat      : Sophie Venecia May Manalu
 * Tanggal      : 20 Februari 2025
*/

public class Mgaris {
    public static void main(String[] args) {

        // Membuat titik awal dan titik akhir
        Titik A = new Titik(5, 7);
        Titik B = new Titik(6, 8);

        // Membuat objek garis dengan titik A dan B
        Garis G1 = new Garis(A, B);

        // Menampilkan titik awal dan titik akhir
        G1.printGaris();

        // Menampilkan panjang garis
        System.out.println("Panjang garis: " + G1.getPanjangGaris());

        // Menampilkan gradien garis
        System.out.println("Gradien garis: " + G1.getGradienGaris());

        // Menampilkan persamaan garis
        G1.printPersamaan();

        // Membuat garis baru untuk mengecek apakah sejajar atau tidak 
        Titik C = new Titik(1, 3);
        Titik D = new Titik(2, 4);
        Garis G2 = new Garis(C, D);

        System.out.println("Apakah G1 sejajar dengan G2? " + G1.isGarisSejajar(G2));
        System.out.println("Apakah G1 tegak lurus dengan G2? " + G1.isTegakLurus(G2));
    }
}

