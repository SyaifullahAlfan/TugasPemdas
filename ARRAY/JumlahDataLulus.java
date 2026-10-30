/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ARRAY;

/**
 *
 * @author HP
 */
public class JumlahDataLulus {

    public static void main(String[] args) {
        int[] nilai = {80, 65, 90, 70, 85};
int jumlahLulus = 0;
 
    for (int i = 0; i < nilai.length; i++){
        if (nilai[i] >= 75) {
            jumlahLulus++;
           
        }
    }
    System.out.println("Jumlah mahasiswa lulus = " + jumlahLulus);
    }
}
