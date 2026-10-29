/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRATIKUM2_PERULANGAN;

import java.util.Scanner;
public class peruPlusPercabNilaiMahasiswa {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;
        int totalNilai = 0;
        for (int i = 1; i <= 5; i++) {

            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
           
            int nilai = input.nextInt();
            totalNilai = totalNilai + nilai;

            if (nilai >= 75) {
                System.out.println("Status: Lulus");
                jumlahLulus++;
            } else {
                System.out.println("Status: Tidak Lulus");
                jumlahTidakLulus++;
                
            }
        }
            double rataRata = (double) totalNilai /5;
            System.out.println("==== HASIL AKHIR ====");
            System.out.println("Jumlah Mahasiswa Lulus :" + jumlahLulus);
            System.out.println("Jumlah Mahasiswa Lulus :" + jumlahTidakLulus);
            System.out.println("Rata-rata Nilai:" + rataRata);
            
            input.close();
    }
}



   



        
    



         
    
  



        
    

