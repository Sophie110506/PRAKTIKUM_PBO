public class Mdosen {
    public static void main(String[] args){
        
        Dosen Dosen1 = new Dosen("1234567890", "Sophie", "Informatika");
        Dosen Dosen2 = new Dosen();
        
        //Dosen 1
        System.out.println("---Dosen 1---");
        System.out.println("Nip:" + Dosen1.getNip());
        System.out.println("Nama:" + Dosen1.getNama());
        System.out.println("Prodi:" + Dosen1.getProdi());      

        //Dosen 2
        //Set Dosen kedua
        Dosen2.setNip("0987654321");
        Dosen2.setNama("Venecia");
        Dosen2.setProdi("Kimia");

        //menampilkan data Dosen 2
        System.out.println("---Dosen 2---");
        System.out.println("Nip:" + Dosen2.getNip());
        System.out.println("Nama:" + Dosen2.getNama());
        System.out.println("Prodi:" + Dosen2.getProdi());  
    }
}
