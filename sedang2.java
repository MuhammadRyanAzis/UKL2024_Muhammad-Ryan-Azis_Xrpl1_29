import java.util.Scanner;

public class sedang2 {
    // Fungsi untuk menghitung volume tabung
    public static double hitungVolume(double jariJari, double tinggi) {
        final double PI = 3.14159; // Konstanta nilai pi
        return PI * jariJari * jariJari * tinggi;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta input jari-jari dan tinggi tabung
        System.out.print("Masukkan jari-jari tabung (cm): ");
        double jariJari = input.nextDouble();

        System.out.print("Masukkan tinggi tabung (cm): ");
        double tinggi = input.nextDouble();

        // Menghitung volume menggunakan fungsi
        double volume = hitungVolume(jariJari, tinggi);

        // Menampilkan hasil
        System.out.println("Volume tabung adalah: " + volume + " cm3");
    }
}
