package PRAK301_2210817310006_AhmadMuhsinZein;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);      
        int jumlahDadu = scan.nextInt();

        LinkedList<Dadu> daduList = new LinkedList<>();

        for (int i = 1; i <= jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
            System.out.println("Dadu ke-" + i + " bernilai " + dadu.getNilai());
        }

        int totalNilai = 0;
        for (Dadu dadu : daduList) {
            totalNilai += dadu.getNilai();	
        }

        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
    }
}
