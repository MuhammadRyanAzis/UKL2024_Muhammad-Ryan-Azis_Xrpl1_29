import java.util.HashSet;
import java.util.Scanner;

public class sulit2 {
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

        // Mengecek duplikat menggunakan HashSet
        HashSet<Integer> set = new HashSet<>();
        boolean adaDuplikat = false;

        for (int elemen : array) {
            if (set.contains(elemen)) {
                adaDuplikat = true;
                System.out.println("Array memiliki elemen duplikat: " + elemen);
                break;
            }
            set.add(elemen);
        }

        if (!adaDuplikat) {
            System.out.println("Tidak ada elemen duplikat dalam array.");
        }
    }
}
