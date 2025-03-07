/* 
* File               : AngkaSialException.java
* Deskripsi          : Eksepsi buatan sendiri, meolak masukan angka 13!
* Nama               : Sophie Venecia May Manalu
* Nim                : 24060123120043
* Tanggal pembuatan  : 6 Maret 2025
*/


public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan masukkan angka 13 karena angka sial !!");
    }
}
