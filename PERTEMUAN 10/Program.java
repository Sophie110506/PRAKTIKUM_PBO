package jdbc.program;


import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;
import jdbc.utilities.MysqlUtility;

import java.util.List;
import java.util.Scanner;

public class Program {
    private static MysqlMahasiswaService mahasiswaService = new MysqlMahasiswaService();
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("=== PROGRAM CRUD MAHASISWA ===");
        
        // Test koneksi database
        if (!MysqlUtility.testConnection()) {
            System.out.println("Gagal terhubung ke database. Program dihentikan.");
            return;
        }
        
        // Menu utama
        while (true) {
            tampilkanMenu();
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            switch (pilihan) {
                case 1:
                    tambahMahasiswa();
                    break;
                case 2:
                    tampilkanSemuaMahasiswa();
                    break;
                case 3:
                    cariMahasiswa();
                    break;
                case 4:
                    updateMahasiswa();
                    break;
                case 5:
                    hapusMahasiswa();
                    break;
                case 6:
                    System.out.println("Terima kasih! Program selesai.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            
            System.out.println("\nTekan Enter untuk melanjutkan...");
            scanner.nextLine();
        }
    }
    
    private static void tampilkanMenu() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("MENU UTAMA");
        System.out.println("=".repeat(40));
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Tampilkan Semua Mahasiswa");
        System.out.println("3. Cari Mahasiswa by ID");
        System.out.println("4. Update Mahasiswa");
        System.out.println("5. Hapus Mahasiswa");
        System.out.println("6. Keluar");
        System.out.println("=".repeat(40));
        System.out.print("Pilih menu (1-6): ");
    }
    
    private static void tambahMahasiswa() {
        System.out.println("\n--- TAMBAH MAHASISWA ---");
        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        
        if (nama.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong!");
            return;
        }
        
        Mahasiswa mahasiswa = new Mahasiswa(nama);
        if (mahasiswaService.insertMahasiswa(mahasiswa)) {
            System.out.println("✓ Mahasiswa berhasil ditambahkan!");
        } else {
            System.out.println("✗ Gagal menambahkan mahasiswa!");
        }
    }
    
    private static void tampilkanSemuaMahasiswa() {
        System.out.println("\n--- DAFTAR SEMUA MAHASISWA ---");
        List<Mahasiswa> mahasiswaList = mahasiswaService.getAllMahasiswa();
        
        if (mahasiswaList.isEmpty()) {
            System.out.println("Tidak ada data mahasiswa.");
            return;
        }
        
        System.out.println("Total mahasiswa: " + mahasiswaList.size());
        System.out.println("-".repeat(30));
        System.out.printf("%-5s | %-20s%n", "ID", "NAMA");
        System.out.println("-".repeat(30));
        
        for (Mahasiswa mhs : mahasiswaList) {
            System.out.printf("%-5d | %-20s%n", mhs.getId(), mhs.getNama());
        }
        System.out.println("-".repeat(30));
    }
    
    private static void cariMahasiswa() {
        System.out.println("\n--- CARI MAHASISWA ---");
        System.out.print("Masukkan ID mahasiswa: ");
        int id = scanner.nextInt();
        
        Mahasiswa mahasiswa = mahasiswaService.getMahasiswaById(id);
        if (mahasiswa != null) {
            System.out.println("✓ Mahasiswa ditemukan:");
            System.out.println("ID: " + mahasiswa.getId());
            System.out.println("Nama: " + mahasiswa.getNama());
        } else {
            System.out.println("✗ Mahasiswa dengan ID " + id + " tidak ditemukan!");
        }
    }
    
    private static void updateMahasiswa() {
        System.out.println("\n--- UPDATE MAHASISWA ---");
        System.out.print("Masukkan ID mahasiswa yang akan diupdate: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        Mahasiswa mahasiswa = mahasiswaService.getMahasiswaById(id);
        if (mahasiswa == null) {
            System.out.println("✗ Mahasiswa dengan ID " + id + " tidak ditemukan!");
            return;
        }
        
        System.out.println("Data saat ini: " + mahasiswa.getNama());
        System.out.print("Masukkan nama baru: ");
        String namaBaru = scanner.nextLine();
        
        if (namaBaru.trim().isEmpty()) {
            System.out.println("Nama tidak boleh kosong!");
            return;
        }
        
        mahasiswa.setNama(namaBaru);
        if (mahasiswaService.updateMahasiswa(mahasiswa)) {
            System.out.println("✓ Data mahasiswa berhasil diupdate!");
        } else {
            System.out.println("✗ Gagal mengupdate data mahasiswa!");
        }
    }
    
    private static void hapusMahasiswa() {
        System.out.println("\n--- HAPUS MAHASISWA ---");
        System.out.print("Masukkan ID mahasiswa yang akan dihapus: ");
        int id = scanner.nextInt();
        
        Mahasiswa mahasiswa = mahasiswaService.getMahasiswaById(id);
        if (mahasiswa == null) {
            System.out.println("✗ Mahasiswa dengan ID " + id + " tidak ditemukan!");
            return;
        }
        
        System.out.println("Data yang akan dihapus: " + mahasiswa.getNama());
        System.out.print("Yakin ingin menghapus? (y/n): ");
        scanner.nextLine(); // consume newline
        String konfirmasi = scanner.nextLine();
        
        if (konfirmasi.equalsIgnoreCase("y")) {
            if (mahasiswaService.deleteMahasiswa(id)) {
                System.out.println("✓ Mahasiswa berhasil dihapus!");
            } else {
                System.out.println("✗ Gagal menghapus mahasiswa!");
            }
        } else {
            System.out.println("Penghapusan dibatalkan.");
        }
    }
}