/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGAS_MANDIRI;

import java.util.Scanner;
public class andiBelajar {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.println("Masukkan angka dari 1-4 untuk mengetahui Andi sedang belajar matematika apa :");
        double angka = input.nextDouble();
    
        if (angka == 1) {
        System.out.println("Andi sedang belajar Matematika operasi penjumlahan");
        } else if (angka == 2) {    
        System.out.print("Andi sedang belajar Matematika operasi pengurangan");
        } else if (angka == 3) {
        System.out.println("Andi sedang belajar Matematika operasi pembagian");
        } else {
        System.out.println("Andi sedang belajar Matematika operasi perkalian");
        }
    }
}

