/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRATIKUM_1;

import java.util.Scanner;
public class perhitunganBeras {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        System.out.print("Total beras (kg): ");
        int totalBeras = input.nextInt();

        System.out.print("Beras per keluarga (kg): ");
        int berasPerKeluarga = input.nextInt();

        int jumlahKeluarga = totalBeras / berasPerKeluarga;

        int sisaBeras = totalBeras % berasPerKeluarga;

        System.out.println("\n=== HASIL DISTRIBUSI ===");
        System.out.println("Jumlah keluarga = " + jumlahKeluarga);
        System.out.println("Sisa beras = " + sisaBeras + " kg");

        input.close();
    }
}
 
