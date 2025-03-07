/**
 * File               : ExceptionOnArray.java
 * Deskripsi          : Program penggunaan eksepsi menggunakan class library java
 * Nama               : Sophie Venecia May Manalu
 * Nim                : 24060123120043
 * Tanggal pembuatan  : 6 Maret 2025
 */


public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer 
        Integer[] arrayIntegers = new Integer[4];
        try {
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code..");
        }
    }
}
