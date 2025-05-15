/**
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg =
                new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran :" + bdg.hitungKeliing());
        System.out.println("tipe generic :" + bdg.get().getClass().getName());
    }
}
