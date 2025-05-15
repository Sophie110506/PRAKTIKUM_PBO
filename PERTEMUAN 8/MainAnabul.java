/**
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */


import java.util.Random;

public class MainAnabul {
    public static void main(String[] args) {
        KoleksiAnabul<Anabul> KoleksiAnabul = new KoleksiAnabul<>();

        String[] namaHewan = {"Milo", "Dogi", "Simba", "Luna", "Bimo", "Cici", "Bobo", "Rara", "Gigi", "Kiki"};
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int jenis = rand.nextInt(3);
            String nama = namaHewan[i];

            switch (jenis) {
                case 0:
                    KoleksiAnabul.add(new Kucing(nama));
                    break;
                case 1:
                    KoleksiAnabul.add(new Anjing(nama));
                    break;
                case 2:
                    KoleksiAnabul.add(new Burung(nama));
                    break;
            }
        }

        System.out.println("=== Koleksi Anabul ===\n");
        KoleksiAnabul.showAll();
    }
}
