/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043 
 */

class Programmer extends Pegawai {
    private int bonus = 450000;

    public Programmer(String nama){
        this.nama = nama;
    }

    @Override
    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus:" + bonus);
    }
}
