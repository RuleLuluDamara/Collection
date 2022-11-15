
public class CompareTo {
    public static void main(String[] args){
        String myStr1 = "Helo";
        String myStr2 = "Hello";
        System.out.println(myStr1.compareTo(myStr2));
    }
}

/*CompareTo() digunakan untuk membandingkan dua String
secara secara setiap karakter dari kedua string diubah menjadi nilai Unicode.
Namun, jika kedua string sama, maka metode ini mengembalikan 0 selain itu hanya 
menghasilkan nilai negatif atau positif*/