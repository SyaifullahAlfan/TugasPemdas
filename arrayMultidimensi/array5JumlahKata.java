/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrayMultidimensi;

/**
 *
 * @author HP
 */
public class array5JumlahKata {
    public static void main(String[] args) {
        // Deklarasi kalimat
        String kalimat = "Kuliah di Uinsa Sangat Menyenangkan";

        System.out.println("Kalimat: \"" + kalimat + "\"");

        // Menggunakan trim() untuk menghapus spasi di awal dan akhir kalimat (jika ada)
        // Menggunakan split("\\s+") untuk memecah string berdasarkan spasi
        // "\\s+" adalah ekspresi reguler (regex) yang berarti "satu atau lebih spasi"
        String[] kumpulanKata = kalimat.trim().split("\\s+");

        // Jumlah kata adalah panjang (length) dari array kumpulanKata
        int jumlahKata = kumpulanKata.length;

        // Jika kalimat kosong setelah di-trim, panjang array kata harusnya 0
        if (kalimat.trim().isEmpty()) {
            jumlahKata = 0;
        }

        System.out.println("Jumlah kata: " + jumlahKata);
    }
}
