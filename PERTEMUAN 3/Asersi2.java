/* 
* File               : Asersi2.java
* Deskripsi          : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
* Nama               : Sophie Venecia May Manalu
* Nim                : 24060123120043
* Tanggal pembuatan  : 6 Maret 2025
*/

class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//class Asersi2
public class Asersi2 {
    public static void main (String[] args){
        double jariJari= 0;
        assert(jariJari > 0):"jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
    
}

/**
 * PERTANYAAN 
 * Secara konsep, ada yang kurang tepat pada program asersi2 diatas.
 * jelaskan pada lembar laporan praktikum
 * 
 * JAWABAN:
 * Kesalahan di program ini ada di cara pakai asersi (`assert`) buat ngecek input jari-jari.
 * Masalahnya, asersi cuma jalan kalau program dijalankan pakai `-enableassertions`. Kalau nggak, kode `assert` bakal di-skip.
 * Jadi kalau `jariJari = 0`, program tetep lanjut dan ngasih hasil `keliling lingkaran = 0.0`, padahal itu harusnya dianggap salah.
 * Biar lebih aman, mending pakai `if-else` buat ngecek input, karena selalu jalan tanpa perlu `-enableassertions`.
 */