/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRATIKUM_1;

import java.util.Scanner;
public class danaSosial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Nama pengelola: ");
        String namaPengelola = input.nextLine();

        System.out.print("Dana awal: ");
        double danaAwal = input.nextDouble();

        System.out.print("Jumlah infaq: ");
        double infaq = input.nextDouble();

        System.out.print("Jumlah penerima: ");
        int jumlahPenerima = input.nextInt();

        input.nextLine();

        System.out.print("Status kegiatan sosial: ");
        String statusKegiatan = input.nextLine();

        if (jumlahPenerima == 0) {
            System.out.println("Jumlah penerima tidak boleh 0.");
        } else {
            double sisaDana = danaAwal - infaq;

            double danaPerPenerima = sisaDana / jumlahPenerima;

            System.out.println("\n=== HASIL PENGELOLAAN DANA ===");
            System.out.println("Nama Pengelola : " + namaPengelola);
            System.out.println("Status Kegiatan : " + statusKegiatan);
            System.out.println("Sisa Dana : Rp" + sisaDana);
            System.out.println("Dana per Penerima : Rp" + danaPerPenerima);

            if (sisaDana >= 500000) {
                System.out.println("Dana masih mencukupi.");
            } else {
                System.out.println("Dana perlu dikelola kembali.");
            }

            if (jumlahPenerima > 20) {
                System.out.println("Program skala besar.");
            }

            if (danaPerPenerima < 50000) {
                System.out.println("Perlu evaluasi distribusi.");
            } else {
                System.out.println("Distribusi memenuhi target minimum.");
            }
        }
    }
}

