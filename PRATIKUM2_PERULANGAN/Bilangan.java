/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRATIKUM2_PERULANGAN;

import java.util.Scanner;
public class Bilangan {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan n: ");
        int n = input.nextInt();

        // 1. Bilangan 1 sampai n
        System.out.println("\nBilangan 1 sampai " + n + ":");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        // 2. Bilangan genap
        System.out.println("\n\nBilangan genap:");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        // 3. Bilangan ganjil
        System.out.println("\n\nBilangan ganjil:");

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    
    }
}
