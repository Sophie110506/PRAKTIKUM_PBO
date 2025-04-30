/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043 
 */

 import java.util.ArrayList;

 public class TestPolimorfismeAnabul {
 
     public static void main(String[] args) {
         Anabul a1 = new Kucing("Milo");
         Anabul a2 = new Anjing("Dogi");
         Anabul a3 = new Burung("Simba");
 
         ArrayList<Anabul> hewans = new ArrayList<>();
         hewans.add(a1);
         hewans.add(a2);
         hewans.add(a3);
 
         for (Anabul h : hewans) {
             h.Gerak();
             h.Bersuara();
         }
     }
 }
 