/*
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Pegawai {
    private String NIP;
    private String nama;
    private LocalDate tanggalLahir;
    private LocalDate TMTBekerja;
    private double gajiPokok;

    public Pegawai(String NIP, String nama, LocalDate tanggalLahir, LocalDate TMTBekerja, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.TMTBekerja = TMTBekerja;
        this.gajiPokok = gajiPokok;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTanggalLahir(LocalDate tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public LocalDate getTMTBekerja() {
        return TMTBekerja;
    }

    public void setTMTBekerja(LocalDate TMTBekerja) {
        this.TMTBekerja = TMTBekerja;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public static String formatTanggal(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", Locale.forLanguageTag("id-ID"));
        return date.format(formatter);
    }
    
    public Period hitungMasaKerja() {
        return Period.between(TMTBekerja, LocalDate.now());
    }

    public void printInfo() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + formatTanggal(tanggalLahir));
        System.out.println("TMT: " + formatTanggal(TMTBekerja));
        System.out.println("Gaji Pokok: Rp " + String.format("%,.2f", gajiPokok));
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }
}