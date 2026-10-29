/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CPMK_2;


        import java.util.Random;
import java.util.Scanner;

public class Tebakangka {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Komputer memilih angka 1-100
        int angkaRahasia = random.nextInt(100) + 1;

        int percobaan = 0;
        int tebakan = 0;
        boolean benar = false;

        System.out.println("=== PERMAINAN TEBAK ANGKA ===");
        System.out.println("Komputer memilih angka dari 1 sampai 100.");
        System.out.println("Anda memiliki maksimal 7 kali percobaan.\n");

        while (percobaan < 7 && !benar) {

            System.out.print("Masukkan tebakan ke-" + (percobaan + 1) + ": ");
            tebakan = input.nextInt();

            percobaan++;

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil!\n");

            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar!\n");

            } else {
                benar = true;
                System.out.println("Benar!");
                System.out.println("Anda berhasil menebak dalam "
                        + percobaan + " percobaan.");
            }
        }

        if (!benar) {
            System.out.println("\nKesempatan habis!");
            System.out.println("Angka yang benar adalah: " + angkaRahasia);
        }

        input.close();
    }
    
}
