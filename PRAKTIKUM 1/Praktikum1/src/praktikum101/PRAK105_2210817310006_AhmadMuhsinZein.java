package praktikum101;
import java.util.Scanner;

public class PRAK105_2210817310006_AhmadMuhsinZein {

    static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukkan jari-jari : ");
        double jariJari = inputan.nextDouble();
        System.out.print("Masukkan tinggi : ");
        double tinggi = inputan.nextDouble();

        double volume = PI * jariJari * jariJari * tinggi;
        String formatVolume = String.format("%.3f", volume);

        System.out.println("Volume tabung dengan jari-jari " + jariJari + " cm dan tinggi " + tinggi + " cm adalah " + formatVolume + " m^3");
    }
}