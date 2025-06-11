import java.util.HashMap;
import java.util.Map;

public class MahasiswaMapLambda {
    public static void main(String[] args){
        Map<String, String> dataMahasiswa = new HashMap<>();
        
        dataMahasiswa.put("240604", "Sophie ");
        dataMahasiswa.put("123123", "Cia");
        dataMahasiswa.put("37492", "May");
        
        dataMahasiswa.forEach((nim, nama) ->
            System.out.println("NIM" + nim +", Nama: " + nama)
        );
      
        
    }
}

