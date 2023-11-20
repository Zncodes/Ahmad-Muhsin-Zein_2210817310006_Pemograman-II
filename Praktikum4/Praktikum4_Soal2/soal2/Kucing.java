package soal2;

public class Kucing extends HewanPeliharaan {
 private String warnaBulu;

 public Kucing(String n, String r, String warna) {
     super(n, r);
     warnaBulu = warna;
 }
 @Override
 public void displayDetailKucing() {
     super.display();
     System.out.println("Memiliki warna bulu : " + warnaBulu);
 }
}