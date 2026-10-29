/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CPMK_2;
        import java.util.Scanner;

public class SistemParkir {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jenisKendaraan;
        int lamaParkir;
        int tarifAwal = 0;
        int tarifTambahan = 0;
        int totalBiaya;

        System.out.println("================================");
        System.out.println("     SISTEM PARKIR KAMPUS");
        System.out.println("================================");

        System.out.println("1. Motor");
        System.out.println("2. Mobil");

        System.out.print("Pilih jenis kendaraan: ");
        jenisKendaraan = input.nextInt();

        System.out.print("Masukkan lama parkir (jam): ");
        lamaParkir = input.nextInt();

        if (jenisKendaraan == 1) {
            
            System.out.println("Kendaraan : Motor");
            tarifAwal = 2000;
            tarifTambahan = 1000;

        } else if (jenisKendaraan == 2) {

            System.out.println("Kendaraan : Mobil");
            tarifAwal = 5000;
            tarifTambahan = 2000;

        } else {

            System.out.println("Jenis kendaraan tidak tersedia.");
            return;
        }

        // Menghitung total biaya parkir
        if (lamaParkir <= 1) {

            totalBiaya = tarifAwal;

        } else {

            totalBiaya = tarifAwal + 
                    ((lamaParkir - 1) * tarifTambahan);
        }

        System.out.println("--------------------------------");
        System.out.println("Lama parkir  : " + lamaParkir + " jam");
        System.out.println("Tarif awal   : Rp" + tarifAwal);
        System.out.println("Tarif tambahan: Rp" + tarifTambahan + "/jam");
        System.out.println("Total biaya  : Rp" + totalBiaya);
        System.out.println("--------------------------------");

        input.close();
    }
    
}
