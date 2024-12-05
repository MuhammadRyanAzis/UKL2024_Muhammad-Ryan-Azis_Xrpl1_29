import java.util.Scanner;

public class sedang1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input bilangan bulat positif
        System.out.print("Masukkan bilangan positif: ");
        int bilangan = input.nextInt();

        // Validasi input
        if (bilangan < 0) {
            System.out.println("Bilangan harus positif.");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= bilangan; i++) {
                faktorial *= i; // Menghitung faktorial
            }
            System.out.println("Faktorial dari " + bilangan + " adalah " + faktorial);
        }
    }
}
