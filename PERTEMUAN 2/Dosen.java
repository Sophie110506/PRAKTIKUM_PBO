// Nama : Sophie Venecia May Manalu 
// Nim  : 24060123120043 
//Tanggal Pembuatan : 27 februari 2025

public class Dosen {
    private String nip;
    private String nama;
    private String prodi;


    /*******************METHOD****************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat titik ("-")   
    Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }
     
    Dosen(){
        nip   = "";
        nama  = "";
        prodi = "";
    }

    //Mengembalikan nip
    public String getNip(){
        return nip;
    }

    //Mengembalikan nama
    public String getNama(){
        return nama;   
    }

    //Mengembalikan nilai prodi
    public String getProdi(){
        return prodi;
    }

    //Mengeset nip Dosen dengan nip baru x
    public void setNip(String x){
        nip = x;
    }

    //Mengeset nama Dosen dengan nama baru y
    public void setNama(String y){
        nama = y;
    }

    //Mengeset nama Dosen dengan nama baru y
    public void setProdi(String z){
        prodi = z;
    }


}
