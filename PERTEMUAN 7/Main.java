/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043 
 */

public class Main {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Milo");
        Anabul anjing = new Anjing("Dogi");
        Anabul burung = new Burung("Simba");

        kucing.Gerak();
        kucing.Bersuara();

        anjing.Gerak();
        anjing.Bersuara();

        burung.Gerak();
        burung.Bersuara();
    }
}
