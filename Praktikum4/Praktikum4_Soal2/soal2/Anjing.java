package soal2;

public class Anjing extends HewanPeliharaan {
 private String warnaBulu;
 private String kemampuan;

 public Anjing(String n, String r, String warna, String kemampuan) {
     super(n, r);
     warnaBulu = warna;
     this.kemampuan = kemampuan;
 }

 @Override
 public void displayDetailAnjing() {
     super.display();
     System.out.println("Memiliki warna bulu : " + warnaBulu);
     System.out.println("Memiliki kemampuan : " + kemampuan);
 }
}