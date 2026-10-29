/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRATIKUM2_PERULANGAN;

import java.util.Scanner;
public class PolaDinamis {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tinggi;

        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextInt();

        for (int i = 1; i <= tinggi; i++) {

            // Mencetak spasi
            for (int j = 1; j <= tinggi - i; j++) {
                System.out.print(" ");
            }

            // Mencetak bintang
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
