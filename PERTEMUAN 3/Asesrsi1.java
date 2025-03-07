/* 
* File               : Asersi1.java
* Deskripsi          : Program untuk menunjukkan asersi
* Nama               : Sophie Venecia May Manalu
* Nim                : 24060123120043
* Tanggal pembuatan  : 6 Maret 2025
*/

public class Asesrsi1 {
    public static void main(String[] args) {
        int x=0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }else{
            assert (x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
