public class sederhana3 {
    public static void main(String[] args) {
        cetakPesan(50);
        System.out.println("1. saya senang");
    }

    public static void cetakPesan(int batas) {
        for (int i = batas; i >= 1; i--) {
            if (i % 3 == 0) {
                System.out.println(i + ". saya angkatan 33");
            } else if (i % 2 == 0) {
                System.out.println(i + ". saya anak moklet");
            } else {
                System.out.println(i + ". saya anak wikusama");
            }
        }
    }
}
