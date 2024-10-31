package Perulangan;

public class SegitigaSikuSikuTerbalik {

    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
