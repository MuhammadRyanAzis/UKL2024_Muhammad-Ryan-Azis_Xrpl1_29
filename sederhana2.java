import java.util.Scanner;

public class sederhana2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        // Tentukan ganjil/genap
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan tersebut adalah Genap.");
        } else {
            System.out.println("Bilangan tersebut adalah Ganjil.");
        }
    }
}
