/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043 
 */

public class Kucing extends Anabul {

    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " Gerak : Berjalan");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " Suara : Meong");
    }
}
