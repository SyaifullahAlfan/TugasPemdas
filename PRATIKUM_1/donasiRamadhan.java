/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRATIKUM_1;

import java.util.Scanner;
public class donasiRamadhan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama donatur : ");
        String nama = input.nextLine();
        System.out.print("Jenis donatur : ");
        String jenis = input.nextLine();
        System.out.print("Jumlah donasi : Rp");
        double donasi = input.nextDouble();
        input.nextLine();
        System.out.print("Kode transaksi : ");
        String kode = input.nextLine();
        System.out.print("Donasi anonim? (true/false): ");
        boolean anonim = input.nextBoolean();
        
        System.out.println("\n=== DATA DONASI ===");
        System.out.println("Nama : " + nama);
        System.out.println("Jenis : " + jenis);
        System.out.println("Donasi : Rp" + donasi);
        System.out.println("Kode : " + kode);
        System.out.println("Anonim : " + anonim);
        input.close();
    }
}

