/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRATIKUM2_PERULANGAN;

import java.util.Scanner;
public class diamondSetengah {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tinggi;

        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextInt();

        // Bagian naik
        for (int i = 1; i <= tinggi; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bagian turun
        for (int i = tinggi - 1; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
