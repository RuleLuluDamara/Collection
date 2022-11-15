import java.util.Queue;
import java.util.LinkedList;

class queue {

    public static void main(String[] args) {
        Queue<Integer> Angka = new LinkedList<>();

        Angka.offer(8);
        Angka.offer(3);
        Angka.offer(10);
        System.out.println("Queue: " + Angka);
        
        int remove = Angka.poll();
        System.out.println("Setelah Di Hapus: " + Angka);
        int Temukan = Angka.peek();
        System.out.println("ditemukan di: " + Temukan);

        System.out.println("Angka Sekarang " + Angka);
    }
}
