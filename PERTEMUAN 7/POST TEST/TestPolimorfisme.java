/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043 
 */

import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        System.out.println("Nama : Sophie Venecia May M");
        System.out.println("Nim  : 24060123120043\n");
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manager("Joko");
        Manager pegawai3 = new Manager("Argo");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);

        for (Pegawai emp : emps) {
            emp.tampilData();
        }
    }
}

/*
 * 1. Jelaskan manfaat polimorfisme pada kasus ini.
 * Jawaban: Semua jenis pegawai bisa disimpan dalam satu list
            Di program ini ada Manager dan Programmer. Karena 
            dua-duanya adalah turunan dari Pegawai, kita bisa 
            simpan semuanya di satu ArrayList<Pegawai>. 
            Tanpa perlu bikin list terpisah.
    2. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa
        permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
    Jawaban : Program jadi tidak fleksibel, sulit dikembangkan, dan lebih banyak yg perlu dikode.
              Misalnya seperti membuat loop untuk setiap jenis pegawai
 */