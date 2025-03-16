/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */

import java.time.LocalDate;
import java.time.Period;

class Dosen {
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMTBekerja;
    private double gajiPokok;
    private String fakultas;

    public Dosen(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMTBekerja, double gajiPokok, String fakultas) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMTBekerja = TMTBekerja;
        this.gajiPokok = gajiPokok;
        this.fakultas = fakultas;
    }

    public String getNIP() { return NIP; }
    public String getNama() { return nama; }
    public LocalDate getTanggalLahir() { return tanggalLahir; }
    public LocalDate getTMTBekerja() { return TMTBekerja; }
    public double getGajiPokok() { return gajiPokok; }
    public String getFakultas() { return fakultas; }

    public String formatTanggal(LocalDate date) {
        return date.toString();
    }

    public Period hitungMasaKerja() {
        return Period.between(TMTBekerja, LocalDate.now());
    }
}