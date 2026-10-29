/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRATIKUM2_PERULANGAN;

import java.util.Scanner;
public class doWhile {
     public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int angka;
        do {
            System.out.print("Masukkan angka (0 untuk berhenti):");
            angka = input.nextInt();
            System.out.println("Anda masukkan:" + angka);
        } while (angka != 0);   
        System.out.print("Program selesai");
}
}
