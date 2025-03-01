// Nama : Sophie Venecia May Manalu 
// Nim  : 24060123120043 
//Tanggal Pembuatan : 27 februari 2025

public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    /*******************METHOD****************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat titik ("-")   
    MataKuliah(String idMatkul, String nama, int sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }
     
    MataKuliah(){
        idMatkul   = "-";
        nama  = "-";
        sks = 0;
    }

    //Mengembalikan idMatkul
    public String getIdMatkul(){
        return idMatkul;
    }

    //Mengembalikan nama
    public String getNama(){
        return nama;   
    }

    //Mengembalikan nilai sks
    public int getSks(){
        return sks;
    }

    //Mengeset idMatkul MataKuliah dengan idMatkul baru x
    public void setIdMatkul(String x){
        idMatkul = x;
    }

    //Mengeset nama MataKuliah dengan nama baru y
    public void setNama(String y){
        nama = y;
    }

    //Mengeset nama MataKuliah dengan nama baru y
    public void setSks(int z){
        sks = z;
    }


}
