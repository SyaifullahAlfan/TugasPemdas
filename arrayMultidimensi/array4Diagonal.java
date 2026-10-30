/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayMultidimensi;

/**
 *
 * @author HP
 */
public class array4Diagonal {
    public static void main(String[] args) {
        // Mendeklarasikan matriks persegi (ukuran baris dan kolom sama, misal 3x3)
        int[][] matriks = {
            {40, 45, 33},
            {47, 10, 56},
            {73, 75, 15}
        };

        System.out.println("--- Matriks Persegi ---");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }

        // Variabel untuk menyimpan hasil penjumlahan
        int jumlahDiagonal = 0;

        // Menjumlahkan elemen diagonal utama
        // Diagonal utama adalah elemen di mana indeks baris sama dengan indeks kolom (i == j)
        for (int i = 0; i < matriks.length; i++) {
            jumlahDiagonal += matriks[i][i]; 
        }

        System.out.println("\n--- Hasil Penjumlahan ---");
        System.out.println("Elemen diagonal utama: " + matriks[0][0] + " + " + matriks[1][1] + " + " + matriks[2][2]);
        System.out.println("Jumlah diagonal utama: " + jumlahDiagonal);
    }

}
