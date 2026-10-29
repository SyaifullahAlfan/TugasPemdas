/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRATIKUM2_PERULANGAN;
import java.util.Scanner;
public class MenuProgam {

    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Menampilkan angka 1-10");
            System.out.println("2. Menampilkan bilangan genap");
            System.out.println("3. Menghitung jumlah 1-10");
            System.out.println("4. Menggambar segitiga bintang");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {

                case 1:
                    System.out.println("\nAngka 1-10:");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                    }
                    break;

                case 2:
                    System.out.println("\nBilangan genap:");
                    for (int i = 2; i <= 20; i += 2) {
                        System.out.println(i);
                    }
                    break;

                case 3:
                    int jumlah = 0;

                    for (int i = 1; i <= 10; i++) {
                        jumlah = jumlah + i;
                    }

                    System.out.println("\nJumlah 1-10 = " + jumlah);
                    break;

                case 4:
                    System.out.println("\nSegitiga Bintang:");

                    // Nested loop
                    for (int i = 1; i <= 5; i++) {

                        for (int j = 1; j <= i; j++) {
                            System.out.print("*");
                        }

                        System.out.println();
                    }
                    break;

                case 5:
                    System.out.println("\nProgram selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak tersedia.");
            }

            // Keluar dari do-while jika pilihan 5
            if (pilihan == 5) {
                break;
            }

        } while (true);

    }

}
