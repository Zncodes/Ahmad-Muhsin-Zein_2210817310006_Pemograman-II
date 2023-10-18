package praktikum2;

public class buah {
	String nama;
	double berat;
	double harga;
	double jumlahbeli;
	double hargaasli;
	double diskon;
	double hargadiskon;
	
	buah(String nama, double berat, double harga, double jumlahbeli, double hargaasli){
		this.nama = nama;
		this.berat = berat;		
		this.harga = harga;		
		this.jumlahbeli = jumlahbeli;	
		this.hargaasli = hargaasli;
	}
    public void diskonbuah(){
        diskon= (Math.floor(jumlahbeli/4) *0.02* harga*4);
        hargadiskon = hargaasli- diskon;
        System.out.printf("Total diskon :Rp%.2f\n", diskon);
        System.out.printf("Harga setelah diskon :Rp%.2f\n", hargadiskon);
    }	
	public void display() {
		System.out.println("Nama : " + this.nama);
		System.out.println("Berat : " + this.berat);
		System.out.println("Harga : " + this.harga);
		System.out.println("Jumlah Beli : " + this.jumlahbeli + "kg");
		System.out.println("Harga Sebelum Diskon : Rp" + this.hargaasli);
		diskonbuah();
		System.out.println();
	}
}
