// jenis : Sophie Venecia May Manalu 
// Nim  : 24060123120043 
//Tanggal Pembuatan : 27 februari 2025

public class Kendaraan {

    /*******************ATRIBUT****************/
    private String noPlat;
    private String jenis;


    /*******************METHOD****************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat titik ("-")   
    Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }
     
    Kendaraan(){
        noPlat = "";
        jenis  = "";
    }

    //Mengembalikan noPlat
    public String getNoPlat(){
        return noPlat;
    }

    //Mengembalikan jenis
    public String getJenis(){
        return jenis;   
    }

    //Mengeset noPlat Kendaraan dengan noPlat baru x
    public void setNoPlat(String x){
        noPlat = x;
    }

    //Mengeset jenis Kendaraan dengan jenis baru y
    public void setJenis(String y){
        jenis = y;
    }



}
