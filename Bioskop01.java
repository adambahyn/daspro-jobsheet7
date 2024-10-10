import java.util.Scanner;

public class Bioskop01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int hargaTiket = 50000;
        int totalTiket = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli (ketik -1 untuk mengakhiri): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == -1) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan masukkan jumlah tiket yang benar.");
                continue;  
            }

            double totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                totalHarga *= 0.85;  
            } else if (jumlahTiket > 4) {
                totalHarga *= 0.90;  
            }

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;

            System.out.println("Total yang harus dibayar untuk " + jumlahTiket + " tiket adalah: Rp " + totalHarga);
        }

        System.out.println("Total tiket terjual hari ini: " + totalTiket);
        System.out.println("Total penjualan hari ini: Rp " + totalPenjualan);

    }
}
