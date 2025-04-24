/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043 
 */

class Pegawai {
    protected String nama;
    protected int gajiPokok = 5000000;

    public void SetNama(String nama){
        this.nama = nama;
    }

    public void tampilData() {
        System.out.println("Nama :" + nama+", Gaji Pokok :" + gajiPokok);
    }
    
}
