/*Nama File     : Titik.java
 *Deskripsi     : Berisi atribut dan method class titik
 * Pembuat      : Sophie Venecia May Manalu
 * Tanggal      : 20 Februari 2025
*/

public class Titik {

    /*******************ATRIBUT****************/
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /*******************METHOD****************/
    //Konstruktor untuk membuat titik (0,0)    
    Titik (double absis, double ordinat){
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }

    Titik(){
        this(0,0);
    }

    //Mengembalikan nilai absis
    double getAbsis(){
        return absis;
    }
    
    //Mengembalikan nilai ordinat
    double getOrdiat(){
        return ordinat;
    }
    
    //Mengeset absis titik dengan nilai baru x
    void setAbsis(double x){
        absis = x;
    }
    
    //Mengeset absis titik dengan nilai baru y
    void setOrdinat (double y){
        ordinat = y;
    }
    
    //Menggeser nilai absis dan ordinat titik masing masing sejauh x dan y
    void geser (double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    void RefleksiX(){
        ordinat = ordinat* -1;
    }

    Titik getRefleksiX(){
        return new Titik(getAbsis(), getOrdiat()*-1);
    }

    void RefleksiY(){
        absis = absis* -1;
    }

    Titik getRefleksiY(){
        return new Titik(getAbsis()*-1, getOrdiat());
    }

    double getKuadran(){
        if (absis >=0 && ordinat>=0){
            return 1;
        }else if (absis <0 && ordinat >=0){
            return 2;
        }else if(absis <0 && ordinat < 0){
            return 3;
        }else if (absis >=0 && ordinat <0){
            return 4;
        }
        return 0;
    }

    // Menghitung jarak dari pusat (0,0)
    double getJarakPusat() {
        return Math.sqrt(absis * absis + ordinat * ordinat);
    }

    // Menghitung jarak antara dua titik
    double getJarak(Titik t) {
        double dx = t.getAbsis() - this.absis;
        double dy = t.getOrdiat() - this.ordinat;
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    //Mencetak koordinat titik 
    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat + ")");
    }

    void printCounterTitik(){
        System.out.println(this.counterTitik);
    }

}
