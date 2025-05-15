/**
 * Nama : Sophie Venecia May M
 * Nim  : 24060123120043
 */

public class BangunDatarGeneric<T1234 extends BangunDatar>{
    private T1234 bangunDatar;
    
    public void set (T1234 tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public T1234 get(){
        return bangunDatar;
    }
    public double hitungKeliing(){
        return bangunDatar.hitungKeliling();
    }
    
}
