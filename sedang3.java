import java.util.Scanner;
import java.util.Random;

public class sedang3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            // Generate bilangan acak dan operator
            int bilangan1 = rand.nextInt(101);
            int bilangan2 = rand.nextInt(101);
            int operator = rand.nextInt(4); // 0 = perkalian, 1 = pembagian, 2 = modulus

            String simbol = "";
            int hasilBenar = 0;

            switch (operator) {
                case 0:
                    simbol = "*";
                    hasilBenar = bilangan1 * bilangan2;
                    break;
                case 1:
                    simbol = "/";
                    hasilBenar = bilangan1 / bilangan2; // Pembagian integer
                    break;
                case 2:
                    simbol = "%";
                    hasilBenar = bilangan1 % bilangan2;
                    break;
                case 4:
                    simbol = "+";
                    hasilBenar = bilangan1 + bilangan2;
                    break;
            }

            // Tampilkan kuis
            System.out.printf("%d %s %d = ?%n", bilangan1, simbol, bilangan2);
            System.out.print("Masukkan jawaban Anda (atau ketik -1 untuk keluar): ");
            int jawaban = input.nextInt();

            // Cek apakah user ingin keluar
            if (jawaban == -1) {
                System.out.println("Kuis selesai. Terima kasih!");
                break;
            }

            // Cek jawaban
            if (jawaban == hasilBenar) {
                System.out.println("Jawaban benar!");
            } else {
                System.out.println("Jawaban salah. Jawaban yang benar adalah: " + hasilBenar);
            }
        }
    }
}
