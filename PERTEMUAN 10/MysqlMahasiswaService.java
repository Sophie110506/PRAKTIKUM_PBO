package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    
    // CREATE - Menambah mahasiswa baru
    public boolean insertMahasiswa(Mahasiswa mahasiswa) {
        String sql = "INSERT INTO mahasiswa (nama) VALUES (?)";
        
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, mahasiswa.getNama());
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Mahasiswa berhasil ditambahkan: " + mahasiswa.getNama());
                return true;
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat menambah mahasiswa: " + e.getMessage());
        }
        return false;
    }
    
    // READ - Mengambil semua data mahasiswa
    public List<Mahasiswa> getAllMahasiswa() {
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        String sql = "SELECT id, nama FROM mahasiswa ORDER BY id";
        
        try (Connection conn = MysqlUtility.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                Mahasiswa mahasiswa = new Mahasiswa();
                mahasiswa.setId(rs.getInt("id"));
                mahasiswa.setNama(rs.getString("nama"));
                mahasiswaList.add(mahasiswa);
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat mengambil data mahasiswa: " + e.getMessage());
        }
        
        return mahasiswaList;
    }
    
    // READ - Mengambil mahasiswa berdasarkan ID
    public Mahasiswa getMahasiswaById(int id) {
        String sql = "SELECT id, nama FROM mahasiswa WHERE id = ?";
        
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                return new Mahasiswa(rs.getInt("id"), rs.getString("nama"));
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat mengambil mahasiswa: " + e.getMessage());
        }
        
        return null;
    }
    
    // UPDATE - Mengupdate data mahasiswa
    public boolean updateMahasiswa(Mahasiswa mahasiswa) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(1, mahasiswa.getNama());
            pstmt.setInt(2, mahasiswa.getId());
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Data mahasiswa berhasil diupdate: " + mahasiswa.getNama());
                return true;
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat mengupdate mahasiswa: " + e.getMessage());
        }
        
        return false;
    }
    
    // DELETE - Menghapus mahasiswa berdasarkan ID
    public boolean deleteMahasiswa(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        
        try (Connection conn = MysqlUtility.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setInt(1, id);
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Mahasiswa dengan ID " + id + " berhasil dihapus");
                return true;
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat menghapus mahasiswa: " + e.getMessage());
        }
        
        return false;
    }
    
    // Method tambahan untuk menghitung jumlah mahasiswa
    public int countMahasiswa() {
        String sql = "SELECT COUNT(*) as total FROM mahasiswa";
        
        try (Connection conn = MysqlUtility.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            
            if (rs.next()) {
                return rs.getInt("total");
            }
            
        } catch (SQLException e) {
            System.err.println("Error saat menghitung mahasiswa: " + e.getMessage());
        }
        
        return 0;
    }
}