public class MMataKuliah {
    public static void main(String[] args){
        
        MataKuliah MataKuliah1 = new MataKuliah("111", "Manajemen Basis Data", 3);
        MataKuliah MataKuliah2 = new MataKuliah();
        
        //MataKuliah 1
        System.out.println("---MataKuliah 1---");
        System.out.println("Id Matkul:" + MataKuliah1.getIdMatkul());
        System.out.println("Nama Matkul:" + MataKuliah1.getNama());
        System.out.println("SKS:" + MataKuliah1.getSks());      

        //MataKuliah 2
        //Set MataKuliah kedua
        MataKuliah2.setIdMatkul("222");
        MataKuliah2.setNama("Sistem Cerdas");
        MataKuliah2.setSks(3);

        //menampilkan data MataKuliah 2
        System.out.println("---MataKuliah 2---");
        System.out.println("Nip:" + MataKuliah2.getIdMatkul());
        System.out.println("Nama:" + MataKuliah2.getNama());
        System.out.println("Prodi:" + MataKuliah2.getSks());  
    }
}
