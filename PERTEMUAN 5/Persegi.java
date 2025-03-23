/*  
 * File               : Persegi.java  
 * Deskripsi          : Kelas Persegi yang mewarisi atribut dan metode dari kelas BangunDatar dalam konsep inheritance pada Java  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 20 Maret 2025  
 */


 public class Persegi extends BangunDatar implements IResize{
    private double sisi;

    public Persegi(){
        setJmlSisi(4);
    }

    public Persegi(double sisi,String warna,String border){
        super(4, warna, border);
        this.sisi = sisi;
    }

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
    
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom (int percent){
        sisi = sisi * percent/100;
    }

    public void printInfo(){
        System.out.println("Warna Bangun Datar : "+getWarna());
        System.out.println("Border Bangun Datar : "+getBorder());
        System.out.println("Jumlah Sisi Bangun Datar : "+getJmlSisi());

    }
}