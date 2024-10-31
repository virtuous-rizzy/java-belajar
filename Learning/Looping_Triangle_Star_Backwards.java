package Perulangan;

public class PiramidaBintangTerbalik {

    public static void main(String[] args) {
        int jumlahLoop = 5;

        for (int i = jumlahLoop; i >= 1; i--) {
            for (int j = i; j < jumlahLoop; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
