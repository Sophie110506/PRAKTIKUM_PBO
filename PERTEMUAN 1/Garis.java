/*Nama File     : Mgaris.java
 *Deskripsi     : Berisi atribut dan method class garis
 * Pembuat      : Sophie Venecia May Manalu
 * Tanggal      : 20 Februari 2025
*/

public class Garis {

    /*******************ATRIBUT****************/
    Titik TitikAwal;
    Titik TitikAkhir;
    static int CounterGaris = 0;

    /*******************METHOD****************/
    // Mengembalikan counter garis   
    static int getCounterGaris(){
        return CounterGaris;
    }

    Garis (Titik TitikAwal, Titik TitikAkhir){
        this.TitikAwal = TitikAwal;
        this.TitikAkhir = TitikAkhir;
        CounterGaris++;
    }

    //Konstruktor tanpa parameter yang menginisialisasi titik awal dengan (0,0) dan k akhir dengan (1,1).   
    Garis(){
        this (new Titik(0,0), new Titik(1,1));
    }

    //Selektor (getter) untuk setap atribut beserta mutatornya (setter). 

    //Mengembalikan nilai Titik Awal
    Titik getTitikAwal(){
        return this.TitikAwal;
    }

    //Mengembalikan nilai Titik ujung
    Titik getTitikAkhir(){
        return this.TitikAkhir;
    }

    //Mengeset nilai Titik Awal
    void setTitikAwal(Titik TitikAwal){
        this.TitikAwal = TitikAwal;
    }

    //Mengeset nilai Titik ujung
    void setTitikAkhir(Titik TitikAkhir){
        this.TitikAkhir = TitikAkhir;
    }

    //Method untuk mendapatkan panjang sebuah garis.
    double getPanjangGaris() {
        return Math.sqrt(Math.pow(TitikAwal.absis - TitikAkhir.absis, 2) + Math.pow(TitikAwal.ordinat - TitikAkhir.ordinat, 2));
    }
    
    //Method untuk mendapatkan gradien dari sebuah garis. 
    double getGradienGaris(){
        double x = TitikAwal.getAbsis() - TitikAkhir.getAbsis();
        if (x == 0){
            System.out.println(" Garisnya horizontal dan tidak miring");
        }
        return (TitikAwal.getOrdiat() - TitikAkhir.getOrdiat())/x;
    }

    //Method untuk mendapatkan titik tengah dari sebuah garis.
    Titik getTitikTengah(){
        return new Titik((this.TitikAwal.getAbsis() + this.TitikAkhir.getAbsis())/2, (this.TitikAwal.getOrdiat() + this.TitikAkhir.getOrdiat())/2);
    }

    //Method untuk mengecek apakah garis tersebut sejajar dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya. 
    boolean isGarisSejajar(Garis x){
        return this.getGradienGaris() ==x.getGradienGaris();
    }

    //Method untuk mengecek apakah garis tersebut tegak lurus dengan sebuah garis lainnya, mengembalikan true jika sejajar dan false jika sebaliknya. 
    boolean isTegakLurus(Garis x){
        return (this.getGradienGaris() * x.getGradienGaris()) == -1;
    }

    //Method untuk menampilkan ke layar titik awal dan titik akhir garis. 
    void printGaris() {
        System.out.println("Titik awal (" + TitikAwal.absis + "," + TitikAkhir.ordinat + "), Titik akhir (" + TitikAkhir.absis + ", " + TitikAkhir.ordinat + ")");
    }

    //Method untuk menampilkan persamaan garis dalam bentuk string y = mx + c.  
    void printPersamaan(){
        double m = (TitikAkhir.getOrdiat() - TitikAwal.getOrdiat()) / (TitikAkhir.getAbsis() - TitikAwal.getAbsis());
        double c = TitikAwal.getOrdiat() - (m * TitikAwal.getAbsis());
        System.out.println("Persamaan garis y = " + m + "x + " + c);
    }
}
