import java.util.HashMap;
import java.util.Scanner;

public class sulit3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta ukuran array
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] array = new int[n];
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        // Menghitung frekuensi menggunakan HashMap
        HashMap<Integer, Integer> frekuensi = new HashMap<>();

        for (int elemen : array) {
            frekuensi.put(elemen, frekuensi.getOrDefault(elemen, 0) + 1);
        }

        // Menampilkan hasil
        System.out.println("Frekuensi elemen dalam array:");
        for (int key : frekuensi.keySet()) {
            System.out.println(key + " muncul " + frekuensi.get(key) + " kali");
        }
    }
}
