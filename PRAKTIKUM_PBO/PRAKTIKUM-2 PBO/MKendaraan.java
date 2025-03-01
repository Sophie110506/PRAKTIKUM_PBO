public class MKendaraan {
    public static void main(String[] args){
        
        Kendaraan kendaraan1 = new Kendaraan("H 0011 AB", "Mobil");
        Kendaraan kendaraan2 = new Kendaraan();
        
        //Kendaraan 1
        System.out.println("Kendaraan 1:");
        System.out.println("No Plat:" + kendaraan1.getNoPlat());
        System.out.println("Jenis:" + kendaraan1.getJenis());

        //Kendaraan 2
        //Set kendaraan kedua
        kendaraan2.setNoPlat("B 8282 BB");
        kendaraan2.setJenis("Motor");

        //menampilkan data kendaraan 2
        System.out.println("No Plat:" + kendaraan2.getNoPlat());
        System.out.println("Jenis:" + kendaraan2.getJenis());
    }
}
