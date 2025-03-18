/*  
 * File               : Persegi.java  
 * Deskripsi          : Kelas Persegi yang mewarisi atribut dan metode dari kelas BangunDatar dalam konsep inheritance pada Java  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 13 Maret 2025  
 */


public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi,String warna,String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

    // public Persegi(double sisi, String warna, String border) {
    //     this.jmlSisi = 4; 
    //     this.warna = warna; 
    //     this.border = border; 
    //     this.sisi = sisi; 
    // }

    /** Konstruktor ini tidak bisa di pakai langsung karena atribut tersebut
     * di awal di definisikan sebagai private di kelas BangunDatar
    */
    
    public double getSisi(){
        return sisi; 
    }
    public void setSisi(double sisi){
        this.sisi = sisi;
    }

    public double getLuas(){
        return sisi*sisi;
    }

    public double getKeliling(){
        return 4*sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }
    
    public void printInfo(){
        System.out.println("Warna Bangun Datar : "+getWarna());
        System.out.println("Border Bangun Datar : "+getBorder());
        System.out.println("Jumlah Sisi Bangun Datar : "+getJmlSisi());

    }
}