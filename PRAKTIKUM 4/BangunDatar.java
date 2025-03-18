/*  
 * File               : BangunDatar.java  
 * Deskripsi          : Program bangun datar untuk menunjukkan konsep inheritance pada Java  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 13 Maret 2025  
 */

public class BangunDatar {
    /*
     *  Jika dibuat final class BangunDatar maka kelas persegi dan lingkaran tidak dapat 
     *  mewarisinya. Akan terjadi error juga pada ke2 hal tersebut.
     *  Final digunakan untuk mencegah kelas lain untuk tidak mewarisinya.
     */
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar (int jmlSisi, String warna, String border){
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
    }

    public BangunDatar(){
        counterBangunDatar ++;

    }
    
    public void printCounterBangunDatar(){
        System.out.println("Jumlah Objek Bangun Datar:" + counterBangunDatar);
    }

    /* Tidak dapat di override karena merupakan metode static.
     * Override hanya dapat dilakukan pada metode yang memiliki objek atau 
     * non static. printCounterBangunDatar merupakah kelas alias static.
    */

    
    public int getJmlSisi(){
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi){
        this.jmlSisi = jmlSisi;
    }

    public String getWarna(){
        return warna;
    }

    public void setWarna(String warna){
        this.warna = warna;
    }

    public String getBorder(){
        return border;
    }

    public void setBorder(String border){
        this.border = border;
    } 

    // @Override
    public void printInfo(){

        /*
         * Akan terjadi error krn final pada method digunakan 
         *  untuk mengunci metode agar tidak dapat diubah oleh subclass, 
         * sehingga memastikan logika yang sudah ditentukan tetap berjalan sesuai tujuan awal.
         */


        // super.printInfo();
        // super.printCounterBangunDatar();
        // System.out.println("Sisi:" + sisi);
        System.out.println("Jumlah sisi:" + jmlSisi);
        System.out.println("Warna:" + warna);
        System.out.println("Border:" + border);
    }
}
