/*  
 * File               : Lingkaran.java  
 * Deskripsi          : Kelas lingkaran yang mewarisi atribut dan metode dari kelas BangunDatar dalam konsep inheritance pada Java  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 13 Maret 2025  
 */

class Lingkaran extends BangunDatar{
    private double jari;

    public Lingkaran(){

    }

    public Lingkaran(double diameter, String warna, String border){
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari(){
        return jari;
    }

    public void setJari(double jari){
        this.jari = jari;
    }

    public double getLuas(){
        return Math.PI * jari *jari;
    }

    public double getKeliling(){
        return 2 * Math.PI * jari;
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Jari-jari: " + jari);
    }
}