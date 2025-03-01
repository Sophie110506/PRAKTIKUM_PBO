// nama : Sophie Venecia May Manalu 
// Nim  : 24060123120043 
//Tanggal Pembuatan : 27 februari 2025

import java.util.ArrayList;

public class Mahasiswa {

    /*******************ATRIBUT****************/
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;


    /*******************METHOD****************/
    //KONSTRUKTOR
    //Konstruktor untuk membuat titik ("")   
    public Mahasiswa(){
        this.nim   = "";
        this.nama  = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>();
    }
    public Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>();
    }

    //Mengembalikan nim
    public String getNim(){
        return nim;
    }

    //Mengembalikan nama
    public String getNama(){
        return nama;   
    }

    public String getProdi(){
        return prodi;   
    }

    public void setDosen(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    //Mengeset nim Mahasiswa dengan nim baru x
    public void setNim(String x){
        nim = x;
    }

    //Mengeset nama Mahasiswa dengan nama baru y
    public void setNama(String y){
        nama = y;
    }

    //Mengeset nama Mahasiswa dengan nama baru y
    public void setProdi(String z){
        prodi = z;
    }

    public int getJumlahMatKul() {
        return listMatKul.size();
    }

    public int getJumlahSks() {
        int jumlah = 0;
        for (int i = 0; i < listMatKul.size(); i++) {
            jumlah += listMatKul.get(i).getSks();
        }
        return jumlah;
    }


    public void addMatkul(MataKuliah newMatKul){
        listMatKul.add(newMatKul);
    }

    public void printDetailMhs(){
        System.out.println("Nim: " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi: " + prodi);
        int i;
        for(i=0; i<listMatKul.size(); i++){
            System.out.println(listMatKul.get(i).getNama());
        }
    }
}