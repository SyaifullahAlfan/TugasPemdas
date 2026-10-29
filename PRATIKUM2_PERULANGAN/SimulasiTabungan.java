

package PRATIKUM2_PERULANGAN;
import java.util.Scanner; 

public class SimulasiTabungan {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah bulan: ");
        int jumlahBulan = input.nextInt();

        int tabungan = 100000;
        int total = 0;

        for (int bulan = 1; bulan <= jumlahBulan; bulan++) {

            // Menampilkan tabungan setiap bulan
            System.out.println("Bulan " + bulan + " = Rp" + tabungan);

            // Akumulasi total tabungan
            total = total + tabungan;

            // Mengecek apakah total sudah mencapai Rp1.000.000
            if (total >= 1000000) {
                System.out.println("Total pertama kali mencapai Rp1.000.000 pada bulan ke-" + bulan);
                break;
            }

            // Tabungan bertambah Rp50.000 setiap bulan
            tabungan = tabungan + 50000;
        }

        System.out.println("Total tabungan = Rp" + total);
    }
}

