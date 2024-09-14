import java.util.Scanner;

public class InputMahasiswa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama, nim, Program_Studi;

            System.out.println("==============Input==========");
            System.out.print("Nama : " );
                nama = in.nextLine();
            System.out.print("NIM  : ");
                nim = in.nextLine();
            System.out.print("Program Studi : ");
                Program_Studi = in.nextLine();

                System.out.println("");
                System.out.println("============Output==========");
                System.out.println("Hai " + nama + ", Anda terdaftar dengan NIM " + nim + " di Program Studi : " + Program_Studi);
   

   }
    
}
