package jdbc.service;

import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MysqlMahasiswaService {
    Connection koneksi;

    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    public Mahasiswa makeMhsObject(ResultSet rs) throws SQLException {
        Mahasiswa mhs = new Mahasiswa();
        mhs.setId(rs.getInt("id"));
        mhs.setNama(rs.getString("nama"));
        return mhs;
    }

    public void add(Mahasiswa mhs) {
        try {
            // ✅ BENAR: Hanya insert NAMA, biarkan database generate ID
            String sql = "INSERT INTO mahasiswa (nama) VALUES (?)";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama()); // Hanya set nama
            int result = ps.executeUpdate();

            if (result > 0) {
                System.out.println("Data berhasil ditambahkan");
            }
        } catch (SQLException e) {
            System.out.println("Error tambah data: " + e.getMessage());
            throw new RuntimeException("Gagal menambah data: " + e.getMessage());
        }
    }

    public void update(Mahasiswa mhs) {
        try {
            String sql = "UPDATE mahasiswa SET nama=? WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error update data: " + e.getMessage());
        }
    }

    public void delete(int id) {
        try {
            String sql = "DELETE FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error delete data: " + e.getMessage());
        }
    }

    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        try {
            String sql = "SELECT * FROM mahasiswa WHERE id=?";
            PreparedStatement ps = koneksi.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                mhs = makeMhsObject(rs);
            }
        } catch (SQLException e) {
            System.out.println("Error getById: " + e.getMessage());
        }
        return mhs;
    }
    
    public void resetAutoIncrement() {
        try {
            // Reset AUTO_INCREMENT ke 1
            String sql = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
            Statement stmt = koneksi.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Auto increment berhasil direset");
        } catch (SQLException e) {
            System.out.println("Error reset auto increment: " + e.getMessage());
            throw new RuntimeException("Gagal mereset indeks: " + e.getMessage());
        }
    }

    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        try {
            String sql = "SELECT * FROM mahasiswa";
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                list.add(makeMhsObject(rs));
            }
        } catch (SQLException e) {
            System.out.println("Error getAll: " + e.getMessage());
        }
        return list;
    }
}

