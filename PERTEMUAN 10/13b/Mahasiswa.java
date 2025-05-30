package jdbc.model;


public class Mahasiswa {
    
    //Atribut
    private int id;
    private String nama;
    
    //  constructor
    public Mahasiswa() {
    }
    
    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    
    public Mahasiswa(int id, String nama) {
        this.id = id;
        this.nama = nama;
    }
    
    // Getter dan Setter
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Method toString untuk debugging/display
    @Override
    public String toString() {
        return "Mahasiswa{" + "id=" + id + ", nama='" + nama  + '}';
    }
}
