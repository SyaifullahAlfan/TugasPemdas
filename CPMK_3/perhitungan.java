/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CPMK_3;

import java.util.Scanner;
public class perhitungan {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        
       
    System.out.println("--- KALKULATOR SEDERHANA ---");
    System.out.print("Masukkan angka pertama: ");
    
    int angka1 = input.nextInt();
    System.out.println("1. Pertambahan (+): ");
    System.out.println("2. Pengurangan (-):");
    System.out.println("3. Perkalian (*):");
    System.out.println("4. Pembagian (:):");
    char operator = input.next().charAt(0);
    System.out.print("Masukkan angka kedua: ");
    
    int angka2 = input.nextInt();
    int hasil;
    
        switch (operator) {
            case '+':
                hasil = angka1 + angka2;
                System.out.println("Hasil = " + hasil);
                break;
            case '-':
                hasil = angka1 - angka2;
                System.out.println("Hasil = " + hasil);
                break;
            case '*':
                hasil = angka1 * angka2;
                System.out.println("Hasil = " + hasil);
                break;
            case '/':
                if (angka2 == 0) {
                    System.out.println("Error: Tidak bisa dibagi dengan 0!");
                } else {
                    hasil = angka1 / angka2;
                    System.out.println("Hasil = " + hasil);
                }
                break;
            case '%':
                if (angka2 == 0) {
                    System.out.println("Error: Modulus dengan 0 tidak diperbolehkan!");
                } else {
                    hasil = angka1 % angka2;
                    System.out.println("Hasil = " + hasil);
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
        }
        
        input.close();
    }
}

