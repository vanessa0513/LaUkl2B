import java.util.Scanner;

public class LUB1 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan sebuah bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = input.nextInt();

        // Mengecek apakah bilangan genap atau ganjil
        if (bilangan % 2 == 0) {
            System.out.println("Bilangan " + bilangan + " adalah bilangan GENAP.");
        } else {
            System.out.println("Bilangan " + bilangan + " adalah bilangan GANJIL.");
        }

        input.close();
    }
}
