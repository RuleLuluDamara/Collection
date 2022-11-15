import java.util.HashSet; 


public class HashSet {
  public static void main(String[] args) {

    HashSet<Integer> Angka = new HashSet<Integer>();

    Angka.add(1);
    Angka.add(6);
    Angka.add(3);

    for(int i = 1; i <= 5; i++) {
      if(Angka.contains(i)) {
        System.out.println(i + " ditemukan");
      } else {
        System.out.println(i + " tidak ditemukan");
      }
    }
    
    if(Angka.isEmpty()) {
        System.out.println("Kosong\n");
      } else {
        System.out.println("Isi dari angka adalah : " + Angka);
      }
  }
}

