/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043 
 */

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " Gerak : Melata ");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " Suara : Guk-guk");
    }
}
