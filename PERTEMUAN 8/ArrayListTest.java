/**
 * File       : ArrayListTest.java
 * Deskripsi  : Program penggunaan objek ArrayList sebagai Collection class
 */

import java.util.ArrayList;

public class ArrayListTest {
    public static void main (String [] args){
        //inisialisasi ArryList yang hanya dapat berisi objek string
        ArrayList<String> strings = new ArrayList<String>();
        //Menambah elemen
        strings.add("praktikum");
        strings.add("collection");
        strings.add("dan generics");
        //MEnghapus elemen
        strings.remove("praktikum");
        //iterasi pada keseluruhan ArrayList
        for(String s: strings){
            System.out.print(s+" ");
        }
    }
}
