/**
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */

import java.util.ArrayList;

public class KoleksiAnabul<T> {
    private ArrayList<T> wadah;

    public KoleksiAnabul() {
        wadah = new ArrayList<>();
    }

    public void add(T item) {
        wadah.add(item);
    }

    public void showAll() {
        for (T item : wadah) {
            if (item instanceof Anabul) {
                Anabul a = (Anabul) item;
                System.out.println("Nama: " + a.getNama());
                a.Bersuara();
                a.Gerak();
                System.out.println();
            }
        }
    }
}
