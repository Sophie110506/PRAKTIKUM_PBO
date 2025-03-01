/*Nama File     : MTitik.java
 *Deskripsi     : Berisi atribut dan method class titik
 * Pembuat      : Sophie Venecia May Manalu
 * Tanggal      : 20 Februari 2025
*/
public class Mtitik {
    public static void main(String[] args) {

        // Membuat objek titik T1(0,0)
        Titik T1 = new Titik(); 
        // Mengubah absis T1 dengan nilai 3
        T1.setAbsis(3); 

        // Mengubah ordinat T1 dengan nilai 4
        T1.setOrdinat(4); 
         // Mencetak koordinat T1 ke layar
        T1.printTitik();
        // Menggeser T1 sejauh (3,4)
        T1.geser(3, 4); 
        T1.printTitik(); // Menampilkan titik T1 setelah digeser

        Titik T2 = T1; 
        T2.printTitik();
        T1.setAbsis(10);
        T1.setOrdinat(10);
        T2.printTitik(); 

        Titik T3 = new Titik();
        Titik T4 = new Titik(3, 5); 

        System.out.println("Jumlah objek titik = " + Titik.getCounterTitik());

        System.out.println("Kuadran T4 = " + T4.getKuadran());

        //Refeksi titik X
        Titik T7 = new Titik(4, 5);
        Titik T8 = T7.getRefleksiX();
        T8.printTitik();

        //Refeksi titik Y
        Titik T9 = T7.getRefleksiY();
        T9.printTitik();

        System.out.println("Jarak T1 ke pusat: " + T1.getJarakPusat());  
        System.out.println("Jarak T7 ke pusat: " + T7.getJarakPusat());  
        System.out.println("Jarak T1 ke T7: " + T1.getJarak(T7)); 
    }
}
