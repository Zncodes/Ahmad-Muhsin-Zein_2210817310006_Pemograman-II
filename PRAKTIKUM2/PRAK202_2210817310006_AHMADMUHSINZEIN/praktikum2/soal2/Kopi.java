package praktikum2.soal2;

public class Kopi {
	
    String namaKopi;
    String ukuran;
    double harga;
    String Pembeli;
    String Penjual;
    double pajak;
 
    public String setPembeli(String Pembeli){
        this.Pembeli=Pembeli;
        return Pembeli;
    }
    public void setPenjual(String Penjual){
        this.Penjual=Penjual;
    }
    public String getPembeli(){
        return Pembeli;
    }
    public double getPajak() {
    pajak = 0.11 * harga;
    return pajak;
    }
    
    public void info(){
        System.out.println("Nama Kopi : " + namaKopi);
        System.out.println("Ukuran : " + ukuran);
        System.out.println("Harga : Rp. " + harga);
    }
}