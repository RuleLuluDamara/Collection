import java.util.HashMap;
import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
    HashMap<Integer, String> angka = new HashMap<>();
    HashMap<String, Integer> map = new HashMap<>();
    HashMap<Integer, String> angkabaru = new HashMap<>();
    
        angka.put(1, "Ani");
        angka.put(2, "Ana");
        angka.put(3, "Figo");
        
        map.put("Ghosa", 10 );
        map.put("Dwi", 12);
        map.put("Dirgantara", 34);
        
        angkabaru.put(2, "sekar");
        
        System.out.println("Map: "
                           + angka);
        System.out.println("Map: "
                           + map);
        
        angka.remove(1);
        System.out.println("Map setelah dihapus : "
                           + angka);
        
        //System.out.println("HashMap dari Angka adalah : "+ angka);
        for (Map.Entry<String, Integer> e : map.entrySet())
            System.out.println("Number: " + e.getKey()
                               + "Value: " + e.getValue());
        
        /*if(angkabaru.containsValue(2, "sekar")==1)
            System.out.println("ditemukan");
        else 
            System.out.println("tidak ditemukan");
        */
        }

        
    }
