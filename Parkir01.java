import java.util.Scanner;

public class Parkir01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;

        do {
            System.out.print("Masukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }

            System.out.print("Masukkan durasi parkir dalam jam: ");
            durasi = sc.nextInt();

            if (jenis == 1) {
                if (durasi > 5) {
                    total += 12500;
                } else {
                    total += durasi * 3000;
                }
            }
            if (jenis == 2) {
                if (durasi > 5) {
                    total += 12500;
                } else {
                    total += durasi * 2000;
                }
            }

        } while (jenis != 0); 

        System.out.println("Total pembayaran parkir: Rp " + total);

    }
}
