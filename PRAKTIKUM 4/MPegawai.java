/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */

import java.time.LocalDate;

public class MPegawai {
    public static void main(String[] args) {
        DosenTetap dosenTetap = new DosenTetap("9545647548", "Andi", LocalDate.of(1990, 5, 5), LocalDate.of(2015, 1, 1), 5000000.00, "Fakultas Sains dan Matematika", "78647324");
        dosenTetap.printInfo();

        System.out.println("\n");

        DosenTamu dosenTamu = new DosenTamu("123456789", "Sophie", LocalDate.of(2006, 5, 11), LocalDate.of(2018, 6, 15), 7000000.00, "Fakultas Teknik", "NIDK123", LocalDate.of(2025, 6, 1));
        dosenTamu.printInfo();

        System.out.println("\n");

        Tendik tendik = new Tendik("789012345", "Venecia", LocalDate.of(1979, 3, 10), LocalDate.of(2010, 9, 1), 4000000.00, "Kemahasiswaan");
        tendik.printInfo();
    }
}