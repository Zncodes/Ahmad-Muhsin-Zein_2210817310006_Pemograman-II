package PRAK301_2210817310006_AhmadMuhsinZein;

import java.util.Random;

class Dadu {
    private int nilai;

    public Dadu() {
        acakNilai();
    }

    public void acakNilai() {
        Random acak = new Random();
        nilai = acak.nextInt(6) + 1;
    }

    public int getNilai() {
        return nilai;
    }
}