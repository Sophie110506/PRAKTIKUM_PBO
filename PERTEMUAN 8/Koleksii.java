/**
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */

import java.util.ArrayList;

public class Koleksii<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksii() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public T getIsi(int index) {
        return wadah.get(index);
    }

    public void setIsi(int index, T value) {
        wadah.set(index, value);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int size) {
        this.nbelm = size;
    }

    public void add(T value) {
        wadah.add(value);
        nbelm++;
    }

    public void delete(int index) {
        if (index >= 0 && index < wadah.size()) {
            wadah.remove(index);
            nbelm--;
        }
    }

    public void showAll() {
        System.out.println("Isi Koleksi:");
        for (int i = 0; i < wadah.size(); i++) {
            System.out.println("Elemen ke-" + i + ": " + wadah.get(i));
        }
    }
}
