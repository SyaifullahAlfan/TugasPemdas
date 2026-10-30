/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ARRAY;

import java.util.Scanner;
public class PenjualanKantinKampus {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        int[] penjualan = {25, 30, 18, 40, 35, 45, 50};
        int total = 0;
        int tertinggi = penjualan[0];
        int terendah = penjualan[0];
        int jumlahHari = 0;

        // Perulangan untuk menghitung data
        for (int i = 0; i < penjualan.length; i++) {

            // Total penjualan
            total = total + penjualan[i];

            // Penjualan tertinggi
            if (penjualan[i] > tertinggi) {
                tertinggi = penjualan[i];
            }

            // Penjualan terendah
            if (penjualan[i] < terendah) {
                terendah = penjualan[i];
            }

            // Jumlah hari dengan penjualan minimal 30
            if (penjualan[i] >= 30) {
                jumlahHari++;
            
            //Menghitung rata-rata
            double rataRata = (double) total / penjualan.length;
    
        System.out.println("=== PENJUALAN KANTIN KAMPUS ===");
        System.out.println("Total penjualan     : " + total);
        System.out.println("Rata-rata penjualan : " + rataRata);
        System.out.println("Penjualan tertinggi : " + tertinggi);
        System.out.println("Penjualan terendah  : " + terendah);
        System.out.println("Hari penjualan >= 30: " + jumlahHari + " hari");
    }
}
    }
}
