/**
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */

public class Main2 {
    public static void main(String[] args) {
        // Membuat objek koleksi bertipe Character
        Koleksii<Character> koleksiChar = new Koleksii<>();

        // Menambahkan 10 karakter ke koleksi
        for (char c = 'A'; c <= 'J'; c++) {
            koleksiChar.add(c);
        }

        // Menampilkan semua elemen
        koleksiChar.showAll();

        // Update elemen ke-5 menjadi 'Z'
        koleksiChar.setIsi(5, 'Z');
        System.out.println("\nSetelah di-update elemen ke-5 menjadi 'Z':");
        koleksiChar.showAll();

        // Hapus elemen ke-2
        koleksiChar.delete(2);
        System.out.println("\nSetelah menghapus elemen ke-2:");
        koleksiChar.showAll();
    }
}
