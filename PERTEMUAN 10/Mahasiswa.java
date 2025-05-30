package jdbc.model;


public class Mahasiswa {
    private int id;
    private String nama;
    
    // Default constructor
    public Mahasiswa() {
    }
    
    // Constructor dengan parameter nama (untuk insert)
    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    
    // Constructor dengan semua parameter (untuk select)
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    
    // Getter dan Setter untuk id
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    // Getter dan Setter untuk nama
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Method toString untuk debugging/display
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                '}';
    }
    
    // Method equals untuk perbandingan object
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Mahasiswa mahasiswa = (Mahasiswa) obj;
        return id == mahasiswa.id;
    }
    
    // Method hashCode
    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }
}
