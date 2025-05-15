public class BangunDatarGenerik<T123 extends BangunDatar> {
    private T bangunDatar;

    public BangunDatarGenerik(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public double luas() {
        return bangunDatar.hitungLuas();
    }

    public double keliling() {
        return bangunDatar.hitungKeliling();
    }

    public void printInfo() {
        System.out.println("Luas: " + luas());
        System.out.println("Keliling: " + keliling());
    }
}
