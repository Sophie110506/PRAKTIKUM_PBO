/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */

import java.time.LocalDate;

class DosenTamu extends Dosen {
    private String NIDK;
    private LocalDate akhirKontrak;

    public DosenTamu(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMTBekerja, double gajiPokok, String fakultas, String NIDK, LocalDate akhirKontrak) {
        super(NIP, nama, tanggalLahir, TMTBekerja, gajiPokok, fakultas);
        this.NIDK = NIDK;
        this.akhirKontrak = akhirKontrak;
    }

    public void printInfo() {
        double tunjangan = 0.025 * getGajiPokok();

        System.out.println("NIP: " + getNIP());
        System.out.println("NIDK: " + NIDK);
        System.out.println("Nama: " + getNama());
        System.out.println("Tanggal Lahir: " + Pegawai.formatTanggal(getTanggalLahir()));
        System.out.println("TMT: " + Pegawai.formatTanggal(getTMTBekerja()));        
        System.out.println("Jabatan: Dosen Tamu");
        System.out.println("Fakultas: " + getFakultas());
        System.out.println("Akhir Kontrak: " + formatTanggal(akhirKontrak));
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", getGajiPokok()));
        System.out.println("Tunjangan: Rp " + String.format("%,.2f", tunjangan));
    }
}