package praktikum101;
import java.util.Scanner;

public class PRAK102_2210817310006_AhmadMuhsinZein {
	public static void main(String[] args) {		
		Scanner inputan = new Scanner(System.in);
	    int angka = inputan.nextInt();
        
	    int hitungan = 0;
        while (hitungan <= 10) {
            if (angka % 5 == 0) {
                System.out.print(angka / 5 - 1);
            } else {
                System.out.print(angka);
            }
            if (hitungan < 10) {
                System.out.print(",");
            }
            angka++;
            hitungan++;
        }
        System.out.println(); 		
	}
}