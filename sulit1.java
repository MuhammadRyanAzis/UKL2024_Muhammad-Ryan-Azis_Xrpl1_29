import java.util.Scanner;

public class sulit1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahHariKerja = 24;// Jumlah hari kerja dalam seminggu

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        int totalKehadiran = 0;
        int[] hariHadir = new int[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
            hariHadir[i] = scanner.nextInt();
            totalKehadiran += hariHadir[i];
        }

        int rataRata = totalKehadiran / jumlahSiswa;

        // Rekap kehadiran
        System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari Kerja: " + jumlahHariKerja + " Hari):");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Siswa ke-" + (i + 1) + ": " + hariHadir[i] + " hari hadir");
        }

        // Rata rata kehadiran
        System.out.println("\nRata-rata kehadiran siswa: " + rataRata + " hari");

        // Kesimpulan
        System.out.println("\nKesimpulan:");
        System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] > rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }

        System.out.println("- Siswa yang kehadirannya di bawah rata-rata:");
        for (int i = 0; i < jumlahSiswa; i++) {
            if (hariHadir[i] < rataRata) {
                System.out.println("  - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + " hari)");
            }
        }
    }
}

// import java.util.Scanner;

// public class sulit1 {
// public static void main(String[] args) {
// Scanner scanner = new Scanner(System.in);
// int jumlahHariKerja = 24; // Jumlah hari kerja dalam seminggu

// System.out.print("Masukkan jumlah siswa: ");
// int jumlahSiswa = scanner.nextInt();

// // Memasukkan kehadiran siswa
// int[] hariHadir = masukkanKehadiranSiswa(scanner, jumlahSiswa);

// // Menghitung total dan rata-rata kehadiran
// int totalKehadiran = hitungTotalKehadiran(hariHadir);
// int rataRata = totalKehadiran / jumlahSiswa;

// // Menampilkan rekap kehadiran
// tampilkanRekapKehadiran(hariHadir, jumlahHariKerja);

// // Menampilkan rata-rata kehadiran
// System.out.println("\nRata-rata kehadiran siswa: " + rataRata + " hari");

// // Menampilkan kesimpulan
// tampilkanKesimpulan(hariHadir, rataRata);
// }

// /**
// * Memasukkan jumlah kehadiran siswa.
// */
// public static int[] masukkanKehadiranSiswa(Scanner scanner, int jumlahSiswa)
// {
// int[] hariHadir = new int[jumlahSiswa];
// for (int i = 0; i < jumlahSiswa; i++) {
// System.out.print("Masukkan jumlah hari hadir siswa ke-" + (i + 1) + ": ");
// hariHadir[i] = scanner.nextInt();
// }
// return hariHadir;
// }

// /**
// * Menghitung total kehadiran semua siswa.
// */
// public static int hitungTotalKehadiran(int[] hariHadir) {
// int total = 0;
// for (int hadir : hariHadir) {
// total += hadir;
// }
// return total;
// }

// /**
// * Menampilkan rekap kehadiran setiap siswa.
// */
// public static void tampilkanRekapKehadiran(int[] hariHadir, int
// jumlahHariKerja) {
// System.out.println("\nRekap Kehadiran Siswa Selama 1 Bulan (Jumlah Hari
// Kerja: " + jumlahHariKerja + " Hari):");
// for (int i = 0; i < hariHadir.length; i++) {
// System.out.println("Siswa ke-" + (i + 1) + ": " + hariHadir[i] + " hari
// hadir");
// }
// }

// /**
// * Menampilkan kesimpulan siswa di atas dan di bawah rata-rata.
// */
// public static void tampilkanKesimpulan(int[] hariHadir, int rataRata) {
// System.out.println("\nKesimpulan:");
// System.out.println("- Siswa yang kehadirannya di atas rata-rata:");
// for (int i = 0; i < hariHadir.length; i++) {
// if (hariHadir[i] > rataRata) {
// System.out.println(" - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + "
// hari)");
// }
// }

// System.out.println("- Siswa yang kehadirannya di bawah rata-rata:");
// for (int i = 0; i < hariHadir.length; i++) {
// if (hariHadir[i] < rataRata) {
// System.out.println(" - Siswa ke-" + (i + 1) + " (" + hariHadir[i] + "
// hari)");
// }
// }
// }
// }
