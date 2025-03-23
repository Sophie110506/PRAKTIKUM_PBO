/*  
 * File               : IResize.java  
 * Deskripsi          : Interface yang mendefinisikan perilaku resize seperti zoomIn, zoomOut, dan zoom  
 * Nama               : Sophie Venecia May Manalu  
 * NIM                : 24060123120043  
 * Tanggal pembuatan  : 20 Maret 2025  
 */

public interface IResize {
    
    // Menambah ukuran menjadi 10% lebih besar
    public void  zoomIn();

    // Mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // Mensakalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom (int percent);

}
