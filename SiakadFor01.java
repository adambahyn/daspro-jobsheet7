import java.util.Scanner;

public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0; 


        for (int i = 1; i <= 10; i++) { 
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();
            lulus += (nilai >= 60) ? 1 : 0;  
            tidakLulus += (nilai < 60) ? 1 : 0; 
            if (nilai > tertinggi) {                                        
                tertinggi = nilai;                                          
            }                                                               
            if (nilai < terendah) {                                         
                terendah = nilai;                                           
            }
            
        }

        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah mahasiswa lulus : " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus : " + tidakLulus);
    }
}