import java.util.Scanner;

public class InputKeyboard001 {
    public static void main(String[] args) {
    // deklar variable atau obyek
        Scanner NamaInput = new Scanner(System.in);
        String nama;

    // input 
         System.out.println("Masukkan Nama Anda : ");
         nama = NamaInput.nextLine();

    //output 
    System.out.println("Nama : " + nama);

    }
}
