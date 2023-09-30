package praktikum101;
import java.util.Scanner;

public class PRAK103_2210817310006_AhmadMuhsinZein {
	public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        int N = inputan.nextInt();
        int angka = inputan.nextInt();
        int hitungan = 0;
        do {
            if (angka % 2 != 0) {
                System.out.print(angka);
                hitungan++;
                if (hitungan < N) {
                    System.out.print(",");
                }
            }
            angka++;
        } while (hitungan < N);
        System.out.println();
    }	
}
