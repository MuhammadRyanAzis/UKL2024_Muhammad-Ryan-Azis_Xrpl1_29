import java.util.Scanner;

public class sederhana1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();
        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan panjang paket (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar paket (cm): ");
        double lebar = input.nextDouble();
        System.out.print("Masukkan tinggi paket (cm): ");
        double tinggi = input.nextDouble();

        // Hitung volume
        double volume = panjang * lebar * tinggi;

        // Hitung biaya per kg berdasarkan jarak
        double biayaPerKg = (jarak <= 10) ? 4250 : 6000;

        // Hitung total biaya pengiriman
        double biayaPengiriman = berat * biayaPerKg;

        // Tambahkan biaya tambahan jika volume > 100 cm³
        if (volume > 100) {
            biayaPengiriman += 50000;
        }

        // Output hasil
        System.out.println("Total biaya pengiriman: Rp " + biayaPengiriman);
    }
}
