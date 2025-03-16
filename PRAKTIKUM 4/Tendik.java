/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */

import java.time.LocalDate;

class Tendik extends Dosen {
    public Tendik(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMTBekerja, double gajiPokok, String fakultas) {
        super(NIP, nama, tanggalLahir, TMTBekerja, gajiPokok, fakultas);
    }

    public void printInfo() {
        System.out.println("NIP: " + getNIP());
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + Pegawai.formatTanggal(getTanggalLahir()));
        System.out.println("TMT: " + Pegawai.formatTanggal(getTMTBekerja()));        
        System.out.println("Jabatan: Tendik");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", getGajiPokok()));
    }
}
