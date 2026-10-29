/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package PRATIKUM2_PERULANGAN;

import java.util.Scanner;
public class Faktorial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int n = input.nextInt();

        int faktorial = 1;

        for (int i = n; i >= 1; i--) {
            faktorial = faktorial * i;
        }

        System.out.println(n + " = " + faktorial);

    }
}
