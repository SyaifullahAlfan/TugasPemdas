/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRATIKUM2_PERULANGAN;


import java.util.Scanner;
public class SistemPresentasi {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Memasukkan jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        int jumlahHadir = 0;
        int jumlahTidakHadir = 0;

        // Memasukkan data kehadiran
        for (int i = 1; i <= jumlahMahasiswa; i++) {

            System.out.print("Kehadiran mahasiswa ke-" + i + " (1=Hadir, 0=Tidak Hadir): ");
            int kehadiran = input.nextInt();

            if (kehadiran == 1) {
                jumlahHadir++;
            } else if (kehadiran == 0) {
                jumlahTidakHadir++;
            }
        }

        // Menghitung persentase kehadiran
        double persentase = (double) jumlahHadir / jumlahMahasiswa * 100;

        // Menampilkan hasil
        System.out.println("\n===== HASIL KEHADIRAN =====");
        System.out.println("Jumlah mahasiswa   : " + jumlahMahasiswa);
        System.out.println("Jumlah hadir       : " + jumlahHadir);
        System.out.println("Jumlah tidak hadir : " + jumlahTidakHadir);
        System.out.println("Persentase hadir   : " + persentase + "%");

        // Menentukan syarat
        if (persentase >= 75) {
            System.out.println("Status: Memenuhi syarat");
        } else {
            System.out.println("Status: Tidak memenuhi syarat");
        }
    }

    }

