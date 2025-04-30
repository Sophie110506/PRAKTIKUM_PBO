/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043 
 */

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " Gerak : Terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " Suara : Pii-Witt");
    }
}
