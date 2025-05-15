/**
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */
import java.util.HashMap;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        //kunci -> integer, nilai -> string 
        Map<Integer, String> map = new HashMap<Integer, String>();
        //Menempatkan elemen kunci dan  nilai
        map.put(1, "satu");
        map.put(2, "dua");
        //mengambil elemen pertama
        System.out.println(map.get(1));
        //mengambil keseluruhan kunci sebagai objek collction set
        Set<Integer> key = map.keySet();
        //bagaimana iterasi untuk mengambil keseluruhan 
        //nilai dari kunci? tulis pada laporann anda 
        //petunjuk : gunakan iterasi seperti program ArrayListTest
    }
 
}
