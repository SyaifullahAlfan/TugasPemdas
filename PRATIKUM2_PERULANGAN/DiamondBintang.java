/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRATIKUM2_PERULANGAN;
public class DiamondBintang {

    public static void main(String[] args) {
        int n = 5;
        
        // Bagian atas
        for (int i = 1; i <= n; i++) {

            // Mencetak spasi
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Mencetak bintang
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bagian bawah
        for (int i = n - 1; i >= 1; i--) {

            // Mencetak spasi
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Mencetak bintang
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

