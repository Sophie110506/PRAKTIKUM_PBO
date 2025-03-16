/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */

import java.time.LocalDate;
import java.time.Period;

class DosenTetap extends Dosen {
    private String NIDN;

    public DosenTetap(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMTBekerja, double gajiPokok, String fakultas, String NIDN) {
        super(NIP, nama, tanggalLahir, TMTBekerja, gajiPokok, fakultas);
        this.NIDN = NIDN;
    }

    public void printInfo() {
        Period masaKerja = hitungMasaKerja();
        LocalDate BUP = getTanggalLahir().plusYears(65).plusMonths(1).withDayOfMonth(1);
        double tunjangan = 0.02 * masaKerja.getYears() * getGajiPokok();

        System.out.println("NIP: " + getNIP());
        System.out.println("NIDN: " + NIDN);
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + Pegawai.formatTanggal(getTanggalLahir()));
        System.out.println("TMT: " + Pegawai.formatTanggal(getTMTBekerja()));        
        System.out.println("Jabatan: Dosen Tetap");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Masa Kerja: " + masaKerja.getYears() + " tahun " + masaKerja.getMonths() + " bulan");
        System.out.println("BUP: " + formatTanggal(BUP));
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", getGajiPokok()));
        System.out.println("Tunjangan: Rp " + String.format("%,.2f", tunjangan));
    }
}