/* 
* File               : AngkaSial.java
* Deskripsi          : Program penggunaan exception exception buatan sendiri. Pengenalan clausa 'throw' dan 'throws'
* Nama               : Sophie Venecia May Manalu
* Nim                : 24060123120043
* Tanggal pembuatan  : 6 Maret 2025
*/


public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(13);
            as.cobaAngka(10);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getmessase() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!");
        }
    }
}

/**
 * 1. Baris 12 tidak dieksekusi karena saat angka 13 dimasukkan, program langsung melempar eksepsi (`throw` AngkaSialException).
 * 2. Baris 21 dieksekusi karena eksepsi yang dilempar akan ditangkap oleh blok `catch`, sehingga program tetap menjalankan kode di dalamnya.
 * - Jika angka 13 dimasukkan, program akan melempar eksepsi ke `AngkaSialException.java`, yang akan mencetak:
 *   "Jangan masukkan angka 13 karena angka sial!!". Setelah eksepsi dilempar, program akan langsung masuk ke blok `catch`, yang mencetak:
 *   "Hati-hati memasukkan angka!!"
 */

